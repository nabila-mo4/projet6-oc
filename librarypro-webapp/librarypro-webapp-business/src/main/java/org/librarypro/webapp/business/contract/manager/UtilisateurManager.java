package org.librarypro.webapp.business.contract.manager;

import java.util.List;

import org.librarypro.webapp.model.UtilisateurDTO;

public interface UtilisateurManager {
	
	List<UtilisateurDTO> users();
	boolean valider(String email, String mdp);
	UtilisateurDTO getUtilisateurByEmail(String email);

}
