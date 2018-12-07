package org.librarypro.webapp.consumer.impl.dao;

import java.util.List;

import org.librarypro.webapp.consumer.contract.dao.EmpruntDao;
import org.librarypro.webapp.consumer.impl.AbstractDao;
import org.librarypro.webapp.model.EmpruntDTO;

public class EmpruntDaoImpl extends AbstractDao implements EmpruntDao{
	
	public List<EmpruntDTO> prets() {

		return getEmpruntClient().list();
		
	}

	
	public void prolonger(int idemprunt) {

		getEmpruntClient().prolonger(idemprunt);
		
		
	}
	
 
	public void prolonge(EmpruntDTO e) {

		getEmpruntClient().prolonge(e);
		
		
	}
	
	
	
	
	public List<EmpruntDTO> getEmpruntByUtilisateur(int idutilisateur) {
		
		return getEmpruntClient().empruntsByUtilisateur(idutilisateur);
	}

	
	public List<EmpruntDTO> getEmpruntsEnCours() {
		
		return getEmpruntClient().empruntsEnCours();
	}

}
