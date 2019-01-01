package org.librarypro.webapp.business.contract;

import org.librarypro.webapp.business.contract.manager.EmpruntManager;
import org.librarypro.webapp.business.contract.manager.OuvrageManager;
import org.librarypro.webapp.business.contract.manager.ReservationManager;
import org.librarypro.webapp.business.contract.manager.UtilisateurManager;
import org.springframework.stereotype.Service;

@Service
public interface ManagerFactory {
	
	OuvrageManager getOuvrageManager();
	void setOuvrageManager(OuvrageManager ouvrageManager);
	
	EmpruntManager getEmpruntManager();
	void setEmpruntManager(EmpruntManager emprunteManager);

	
	UtilisateurManager getUtilisateurManager();
	void setUtilisateurManager(UtilisateurManager utilisateurManager);
	
	ReservationManager getReservationManager();
	void setReservationManager(ReservationManager reservationManager);


}
