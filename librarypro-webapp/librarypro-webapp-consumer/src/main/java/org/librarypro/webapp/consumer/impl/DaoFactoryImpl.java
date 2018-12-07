package org.librarypro.webapp.consumer.impl;

import org.librarypro.webapp.consumer.contract.DaoFactory;
import org.librarypro.webapp.consumer.contract.dao.AuteurDao;
import org.librarypro.webapp.consumer.contract.dao.EmpruntDao;
import org.librarypro.webapp.consumer.contract.dao.OuvrageDao;
import org.librarypro.webapp.consumer.contract.dao.UtilisateurDao;

public class DaoFactoryImpl implements DaoFactory {
	
	private OuvrageDao ouvrageDao;
	private AuteurDao auteurDao;
	private EmpruntDao empruntDao;
	private UtilisateurDao utilisateurDao;

	public OuvrageDao getOuvrageDao() {
		return ouvrageDao;
	}

	public void setOuvrageDao(OuvrageDao ouvrageDao) {
		this.ouvrageDao = ouvrageDao;
	}

	public AuteurDao getAuteurDao() {
		return auteurDao;
	}

	public void setAuteurDao(AuteurDao auteurDao) {
		this.auteurDao=auteurDao;
		
	}

	public EmpruntDao getEmpruntDao() {
	return empruntDao;
	}

	public void setEmpruntDao(EmpruntDao empruntDao) {
		this.empruntDao=empruntDao;
		
	}

	public UtilisateurDao getUtilisateurDao() {
		return utilisateurDao;
	}

	public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
		this.utilisateurDao=utilisateurDao;
		
	}
	
	 
	

}
