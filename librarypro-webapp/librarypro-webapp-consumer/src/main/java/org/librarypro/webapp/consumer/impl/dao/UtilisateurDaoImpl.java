package org.librarypro.webapp.consumer.impl.dao;

import java.util.List;

import org.librarypro.webapp.consumer.contract.dao.UtilisateurDao;
import org.librarypro.webapp.consumer.impl.AbstractDao;
import org.librarypro.webapp.model.UtilisateurDTO;

public class UtilisateurDaoImpl extends AbstractDao implements UtilisateurDao{
	
	public List<UtilisateurDTO> list() {
		return getUtilisateurClient().users();
	}

	
	

	public boolean valider(String email, String mdp) {
		return getUtilisateurClient().valider(email, mdp);
	}


	public UtilisateurDTO getUtilisateurByEmail(String email) {
		return getUtilisateurClient().getUtilisateurByEmail(email);
	}




	public UtilisateurDTO getUtilisateurById(int id) {
		return getUtilisateurClient().getUtilisateurById(id);
	}


	

	


}
