package org.librarypro.webapp.consumer.impl;

import org.librarypro.webapp.model.EmpruntClient;
import org.librarypro.webapp.model.EmpruntService;
import org.librarypro.webapp.model.OuvrageClient;
import org.librarypro.webapp.model.OuvrageService;
import org.librarypro.webapp.model.UtilisateurClient;
import org.librarypro.webapp.model.UtilisateurService;

public abstract class AbstractDao {
	
	private OuvrageService ouvrageService = new OuvrageService();
	private OuvrageClient ouvrageClient = ouvrageService.getOuvragePort();
	
	private EmpruntService empruntService= new EmpruntService();
	private EmpruntClient empruntClient= empruntService.getEmpruntPort();
	
	private UtilisateurService utilisateurService= new UtilisateurService();
	private UtilisateurClient utilisateurClient= utilisateurService.getUtilisateurPort();
	
	
	
	public EmpruntService getEmpruntService() {
		return empruntService;
	}
	public void setEmpruntService(EmpruntService empruntService) {
		this.empruntService = empruntService;
	}
	public EmpruntClient getEmpruntClient() {
		return empruntClient;
	}
	public void setEmpruntClient(EmpruntClient empruntClient) {
		this.empruntClient = empruntClient;
	}
	public UtilisateurService getUtilisateurService() {
		return utilisateurService;
	}
	public void setUtilisateurService(UtilisateurService utilisateurService) {
		this.utilisateurService = utilisateurService;
	}
	public UtilisateurClient getUtilisateurClient() {
		return utilisateurClient;
	}
	public void setUtilisateurClient(UtilisateurClient utilisateurClient) {
		this.utilisateurClient = utilisateurClient;
	}
	public OuvrageService getOuvrageService() {
		return ouvrageService;
	}
	public void setOuvrageService(OuvrageService ouvrageService) {
		this.ouvrageService = ouvrageService;
	}
	public OuvrageClient getOuvrageClient() {
		return ouvrageClient;
	}
	public void setOuvrageClient(OuvrageClient ouvrageClient) {
		this.ouvrageClient = ouvrageClient;
	}
	
	
	

}
