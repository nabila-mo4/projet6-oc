package org.librarypro.webapp.batch;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;

import org.librarypro.webapp.model.EmpruntDTO;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RappelTask extends AbstractJob implements Tasklet {
	
	@Autowired
	private Mail mail;
	private XMLGregorianCalendar dateretour;
	private LocalDate dr;
	

	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		
		List<EmpruntDTO> prets= getManagerFactory().getEmpruntManager().getEmprunts();
        
        
		for (EmpruntDTO e: prets) {
			dateretour= e.getDateretour();
			dr= dateretour.toGregorianCalendar().toZonedDateTime().toLocalDate();
			int idouv=e.getOuvrageDTO().getIdouvrage();
			if(ChronoUnit.DAYS.between(dr, LocalDate.now()) == 1) {
				int iduser= e.getUtilisateurDTO().getIdutilisateur();
				String destinataire=getManagerFactory().getUtilisateurManager().getUtilisateurById(iduser).getEmail();
				String nom= getManagerFactory().getUtilisateurManager().getUtilisateurById(iduser).getNom();
				String titre=getManagerFactory().getOuvrageManager().getById(idouv).getTitre();
				String objet="La date de retour de votre ouvrage arrive bientôt à expiration";
				String corps="Bonjour"+" "+nom+","+" "+"merci de penser à retourner l'ouvrage "+titre+" "+"avant"
						+" "+dateretour.toString();
				mail.envoyer(destinataire, objet, corps);
			}
				
			}
				
		
		
		return null;
	}

}
