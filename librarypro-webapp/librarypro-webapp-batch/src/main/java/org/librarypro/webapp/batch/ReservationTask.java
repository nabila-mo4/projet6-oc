package org.librarypro.webapp.batch;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.datatype.DatatypeFactory;
import org.librarypro.webapp.model.EmpruntDTO;
import org.librarypro.webapp.model.OuvrageDTO;
import org.librarypro.webapp.model.ReservationDTO;
import org.librarypro.webapp.model.UtilisateurDTO;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservationTask extends AbstractJob implements Tasklet {
	
	@Autowired
	 private  Mail mail;
	
	private GregorianCalendar cal= new GregorianCalendar();
	
	private LocalDate maildate;
	
	private LocalDate now= LocalDate.now();
	
	private int idouv;

	public List<ReservationDTO> getReservations() {
		return reservations;
	}

	public void setReservations(List<ReservationDTO> reservations) {
		this.reservations = reservations;
	}

	public int getIdouv() {
		return idouv;
	}

	public void setIdouv(int idouv) {
		this.idouv = idouv;
	}

	private List<ReservationDTO> reservations;

	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		
		
		List<OuvrageDTO> ouvrages= getManagerFactory().getOuvrageManager().list();
		for (OuvrageDTO o: ouvrages){
		if(o.isEtat()==true) {
			idouv= o.getIdouvrage();
			reservations = getManagerFactory().getReservationManager().getListByOuvrageTriee(idouv);
			
			break;	
		}
	                                }
		
		reservations = getManagerFactory().getReservationManager().getListByOuvrageTriee(idouv);
		if(reservations.size()!=0) 
		{
			ReservationDTO firstreservation = reservations.get(0);
			if(firstreservation.getMaildate()==null) {
				firstreservation.setMaildate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
				getManagerFactory().getReservationManager().update(firstreservation);
				int id= firstreservation.getUtilisateurDTO().getIdutilisateur();
				UtilisateurDTO u= getManagerFactory().getUtilisateurManager().getUtilisateurById(id);
				sendEmail(firstreservation);
			
			}
			
			else {
				
				int id =firstreservation.getUtilisateurDTO().getIdutilisateur();    
		     	List<EmpruntDTO> prets =  getManagerFactory().getEmpruntManager().getEmpruntByUser(id);
		     	for (EmpruntDTO e: prets) {
		     		if(e.getOuvrageDTO().getIdouvrage()==idouv) {
		     			
		     			getManagerFactory().getReservationManager().delete(firstreservation);
						if(reservations.size()!=0) {
					
							firstreservation.setMaildate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
							getManagerFactory().getReservationManager().update(firstreservation);
							sendEmail(firstreservation);
		     			
		     		}
		     	}}
				maildate= firstreservation.getMaildate().toGregorianCalendar().toZonedDateTime().toLocalDate();
				if(ChronoUnit.DAYS.between(maildate, now) == 1){
					getManagerFactory().getReservationManager().delete(firstreservation);
					if(reservations.size()!=0) {
						
						firstreservation.setMaildate(DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
						getManagerFactory().getReservationManager().update(firstreservation);
						sendEmail(firstreservation);}
			
				}
			}
			
			
		}
		
		return null;
	}
	
	public void sendEmail(ReservationDTO reservation) {
		int id =reservation.getUtilisateurDTO().getIdutilisateur();
		UtilisateurDTO u= getManagerFactory().getUtilisateurManager().getUtilisateurById(id);
		String destinataire= u.getEmail();
		String nom= u.getNom();
		int idouvrage=reservation.getOuvrageDTO().getIdouvrage();
		OuvrageDTO ouvrage=getManagerFactory().getOuvrageManager().getById(idouvrage);
		String titre=ouvrage.getTitre();
		String objet="L'ouvrage est maintenant disponible";
		String corps="Bonjour" + " "+nom+". L'ouvrage "+" "+titre
				+ " "+ " que vous avez réservé est maintenant disponible. Merci de venir à la bibliothèque"
				+ " "+ " pour le récupérer d'ici 48h !";
		
		mail.envoyer(destinataire, objet, corps);
	}

}
