package org.librarypro.webservice.business.impl;



import org.librarypro.webservice.business.contract.ManagerFactory;
import org.librarypro.webservice.business.contract.manager.AuteurManager;
import org.librarypro.webservice.business.contract.manager.EmpruntManager;
import org.librarypro.webservice.business.contract.manager.OuvrageManager;
import org.librarypro.webservice.business.contract.manager.ReservationManager;
import org.librarypro.webservice.business.contract.manager.UtilisateurManager;


public class ManagerFactoryImpl implements ManagerFactory{
	
	private OuvrageManager ouvrageManager;
	private AuteurManager auteurManager;
	private EmpruntManager empruntManager;
	private UtilisateurManager utilisateurManager;
    private ReservationManager reservationManager;
    
	public OuvrageManager getOuvrageManager() {
		
		return ouvrageManager;
	}

	public void setOuvrageManager(OuvrageManager ouvrageManager) {
		this.ouvrageManager = ouvrageManager;
		
	}

	public AuteurManager getAuteurManager() {
		
		return auteurManager;
	}

	public void setAuteurManager(AuteurManager auteurManager) {
		this.auteurManager=auteurManager;
		
	}

	
	public EmpruntManager getEmpruntManager() {
		return  empruntManager;
	}

	
	public void setEmpruntManager(EmpruntManager empruntManager) {
		this.empruntManager= empruntManager;
		
	}

	
	public UtilisateurManager getUtilisateurManager() {
		return utilisateurManager;
	}

	
	public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
		this.utilisateurManager=utilisateurManager;
		
	}

	@Override
	public ReservationManager getReservationManager() {
		
		return reservationManager;
	}

	@Override
	public void setReservationManager(ReservationManager reservationManager) {
		this.reservationManager=reservationManager;
		
	}

}
