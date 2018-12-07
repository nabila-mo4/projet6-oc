package org.librarypro.webapp.business.impl.manager;

import java.util.List;

import org.librarypro.webapp.business.contract.manager.UtilisateurManager;
import org.librarypro.webapp.model.UtilisateurDTO;

public class UtilisateurManagerImpl extends AbstractManagerImpl implements UtilisateurManager{
	
	
	public List<UtilisateurDTO> users() {

		return getDaoFactory().getUtilisateurDao().list();
	}

	
	public boolean valider(String email, String mdp) {
		return getDaoFactory().getUtilisateurDao().valider(email, mdp);
		
	}
	
	
	public UtilisateurDTO getUtilisateurByEmail(String email) {
		return getDaoFactory().getUtilisateurDao().getUtilisateurByEmail(email);
		
	}

}
