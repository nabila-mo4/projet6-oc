package org.librarypro.webapp.business.contract.manager;

import java.util.List;

import org.librarypro.webapp.model.EmpruntDTO;

public interface EmpruntManager {
	List<EmpruntDTO> getEmprunts();
	void prolonger(int idemprunt);
	void prolonge(EmpruntDTO e);
	List<EmpruntDTO> getEmpruntByUser(int idutilisateur) ;
	 List<EmpruntDTO> getEmpruntsEnCours();

}
