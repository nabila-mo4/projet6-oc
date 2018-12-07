package org.librarypro.webapp.business.impl.manager;

import java.util.List;

import org.librarypro.webapp.business.contract.manager.EmpruntManager;
import org.librarypro.webapp.model.EmpruntDTO;

public class EmpruntManagerImpl extends AbstractManagerImpl implements EmpruntManager {
	
	public List<EmpruntDTO> getEmprunts() {
		
		return getDaoFactory().getEmpruntDao().prets();
	}
	
	
	public void prolonger(int idemprunt) {
		
		 getDaoFactory().getEmpruntDao().prolonger(idemprunt);
		}
	
	public void prolonge(EmpruntDTO e) {
		
		 getDaoFactory().getEmpruntDao().prolonge(e);
		}
	

	public List<EmpruntDTO> getEmpruntByUser(int idutilisateur) {
		
		return getDaoFactory().getEmpruntDao().getEmpruntByUtilisateur(idutilisateur);
		}

	
	public List<EmpruntDTO> getEmpruntsEnCours() {
		
		return getDaoFactory().getEmpruntDao().getEmpruntsEnCours();
	}


	

}
