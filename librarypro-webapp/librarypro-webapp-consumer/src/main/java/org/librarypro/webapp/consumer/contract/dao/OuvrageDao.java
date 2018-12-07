package org.librarypro.webapp.consumer.contract.dao;

import java.util.List;

import org.librarypro.webapp.model.OuvrageDTO;

public interface OuvrageDao {
	
	OuvrageDTO getById(int idouvrage);
	
	void create(OuvrageDTO ouvrage);
	
	List<OuvrageDTO> list();
	
	List<OuvrageDTO> getOuvrageByTitre(String critere);
	
	List<OuvrageDTO> getOuvrageByAuteur(String critere);
	
	
	

}
