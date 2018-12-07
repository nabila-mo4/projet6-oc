package org.librarypro.webapp.business.contract.manager;

import java.util.List;

import org.librarypro.webapp.model.OuvrageDTO;

public interface OuvrageManager {
	
	OuvrageDTO getById(int idouvrage);
	void create(OuvrageDTO ouvrage);
	List<OuvrageDTO> list();
	List<OuvrageDTO> getOuvrageByTitre(String critere);
	List<OuvrageDTO> getOuvrageByAuteur(String critere);
	
	
}
