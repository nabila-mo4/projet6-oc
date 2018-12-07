package org.librarypro.webapp.consumer.impl.dao;

import java.util.Hashtable;
import java.util.List;

import org.librarypro.webapp.consumer.contract.dao.OuvrageDao;


import org.librarypro.webapp.consumer.impl.AbstractDao;
import org.librarypro.webapp.model.OuvrageDTO;


public class OuvrageDaoImpl extends AbstractDao implements OuvrageDao {

	public OuvrageDTO getById(int idouvrage) {
		
		return getOuvrageClient().getBook(idouvrage);

	}

	public void create(OuvrageDTO ouvrage) {
		getOuvrageClient().create(ouvrage);
		
	}
	
	
	public List<OuvrageDTO> list() {
		return getOuvrageClient().getAll();
		
	}

	public List<OuvrageDTO> getOuvrageByTitre(String critere) {
		
		return  getOuvrageClient().getOuvrageByTitre(critere);
	}
	
    public List<OuvrageDTO> getOuvrageByAuteur(String critere) {
		
		return  getOuvrageClient().getOuvrageByAuteur(critere);
	}
	
	

	
	
	
	
	

	
	
	
	
	

		
	
	}

	
