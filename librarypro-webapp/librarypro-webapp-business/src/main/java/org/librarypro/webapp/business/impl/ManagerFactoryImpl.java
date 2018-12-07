package org.librarypro.webapp.business.impl;

import org.librarypro.webapp.business.contract.ManagerFactory;
import org.librarypro.webapp.business.contract.manager.EmpruntManager;
import org.librarypro.webapp.business.contract.manager.OuvrageManager;
import org.librarypro.webapp.business.contract.manager.UtilisateurManager;

public class ManagerFactoryImpl implements ManagerFactory{
	
	private OuvrageManager ouvrageManager;
	private EmpruntManager empruntManager;
	private UtilisateurManager utilisateurManager;

	public EmpruntManager getEmpruntManager() {
		return empruntManager;
	}

	public void setEmpruntManager(EmpruntManager empruntManager) {
		this.empruntManager = empruntManager;
	}

	public UtilisateurManager getUtilisateurManager() {
		return utilisateurManager;
	}

	public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
		this.utilisateurManager = utilisateurManager;
	}

	public OuvrageManager getOuvrageManager() {
		
		return ouvrageManager;
	}

	public void setOuvrageManager(OuvrageManager ouvrageManager) {
		this.ouvrageManager=ouvrageManager;
		
	}

}
