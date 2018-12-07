package org.librarypro.webapp.batch;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.librarypro.webapp.model.EmpruntDTO;
import org.librarypro.webapp.model.OuvrageDTO;
import org.librarypro.webapp.model.UtilisateurDTO;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Task extends AbstractJob implements Tasklet {
	
	
	 @Autowired
	 private  Mail mail;
	 
	 String nomouv;
	 
	 private static final String USERNAME = "lognab77@gmail.com";
		private static final String PASSWORD = "azeqsdwxc";
	 
	 
	 public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		   
	
	 		    String mailFrom = "lognab77@gmail.com";
	 		    String destinataire = "nabila.mokadmi01@gmail.com";
	 		    String objet = "A propos de votre pret d'ouvrage";
	 		    String corps = "J'ai constaté que vous n'avez pas encore rendu l'ouvrage emprunté.";
	 		   List<EmpruntDTO > prets= getManagerFactory().getEmpruntManager().getEmpruntsEnCours();
		 		List<UtilisateurDTO > utilisateurs= getManagerFactory().getUtilisateurManager().users();
		 		List<OuvrageDTO > ouvrages= getManagerFactory().getOuvrageManager().list();

		 		Date d = new Date();
		 		LocalDate date = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		 		date = date.plusDays(3);
		 		
		 		String prolonger = "";
		 		String corps1 = "";
		 		

		 		try {
		 		

		 			for (EmpruntDTO emprunt : prets) {
		 				
		 				
		 				LocalDate date1 = emprunt.getDateretour().toGregorianCalendar().toZonedDateTime().toLocalDate();
		 				System.out.println(date1);
		 				if (date1.compareTo(date) < 0) {
		 				
		 					for (UtilisateurDTO utilisateur : utilisateurs) {
		 						if (utilisateur.getIdutilisateur() == emprunt.getIdutilisateur()) {
		 							destinataire = utilisateur.getEmail();
		 							
		 						}
		 						for(OuvrageDTO ouvrage:ouvrages)
			 					{
			 						if(ouvrage.getIdouvrage()==emprunt.getIdouvrage())
			 							nomouv=ouvrage.getNom();
			 					}
		 					}
		 					
		 					long nbjours = ChronoUnit.DAYS.between(date1, date);
		 					nbjours = 3 - nbjours;
		 					System.out.println(nbjours);
		 					
		 					
		 					if(emprunt.isProlonge() == false) {
		 						 prolonger = ". Il est possible de prolonger votre prêt de 4 semaines si vous le souhaitez";
		 					}
		 					else {
		 						prolonger ="";
		 					}
		 					
		 					
		 					
		 					if(nbjours <0) {
		 						 corps1 =	corps + "Le délai pour rendre l'ouvrage"+nomouv+ "n'a pas été respecté.";
		 						 
		 					}
		 					else {
		 						 corps1 =	corps + "Il vous reste " + nbjours + "jours pour rendre l'ouvrage"+nomouv;
											
		 					}

		 			       mail.envoyer(destinataire, objet, corps1);
		 				}
		 			}
		 		} catch (Exception e) {
		 			System.out.println("erreur dans l'adresse mail");
		 		}
		 		
	 		    Task gmail = new Task();
	 		    gmail.sendMail(mailFrom, destinataire, objet, corps1);
	 		   return RepeatStatus.FINISHED;
	 		}

	 
	 		private void sendMail(String mailFrom, String destinataire, String objet,
	 		                      String corps) throws Exception {

	 		    Properties config = createConfiguration();
	 		    Session session = Session.getInstance(config, new Authenticator() {
	 		        @Override
	 		        protected PasswordAuthentication getPasswordAuthentication() {
	 		            return new PasswordAuthentication(
	 		                Task.USERNAME,
	 		                Task.PASSWORD
	 		            );
	 		        }
	 		    });

	 		   
	 		    Message message = new MimeMessage(session);
	 		    message.setSentDate(new Date());
	 		    message.setFrom(new InternetAddress(mailFrom));
	 		    message.setRecipient(Message.RecipientType.TO, new InternetAddress(destinataire));
	 		    message.setSubject(objet);
	 		    message.setText(corps);

	 		  
	 		    Transport.send(message, Task.USERNAME, Task.PASSWORD);
	 		}

	 		private Properties createConfiguration() {
	 		    return new Properties() {{
	 		        put("mail.smtp.host", "smtp.gmail.com");
	 		        put("mail.smtp.auth", "true");
	 		        put("mail.smtp.port", "465");
	 		        put("mail.smtp.socketFactory.port", "465");
	 		        put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	 		    }};
	 		}  
	    }

