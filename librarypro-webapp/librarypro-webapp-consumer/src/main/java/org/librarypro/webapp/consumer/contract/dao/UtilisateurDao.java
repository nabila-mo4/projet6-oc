package org.librarypro.webapp.consumer.contract.dao;

import java.util.List;

import org.librarypro.webapp.model.UtilisateurDTO;

public interface UtilisateurDao {
	
	List<UtilisateurDTO> list();
	boolean valider(String email, String mdp);
	UtilisateurDTO getUtilisateurByEmail(String email);
	UtilisateurDTO getUtilisateurById(int id);
	
	

}
