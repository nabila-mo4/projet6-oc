package org.librarypro.webapp.business.impl.manager;

import java.util.List;

import org.librarypro.webapp.business.contract.manager.OuvrageManager;
import org.librarypro.webapp.model.OuvrageDTO;
import org.springframework.stereotype.Service;

@Service
public class OuvrageManagerImpl extends AbstractManagerImpl implements OuvrageManager{
	 
	

		public OuvrageDTO getById(int idouvrage) 
		    {
		      return getDaoFactory().getOuvrageDao().getById(idouvrage);
			
		    }

		public void create(OuvrageDTO ouvrage) {
			  getDaoFactory().getOuvrageDao().create(ouvrage);
			
			
		}
		
		public List<OuvrageDTO> list() {
			 return getDaoFactory().getOuvrageDao().list();	
		}
		
		public List<OuvrageDTO> getOuvrageByTitre(String critere) {
			 return getDaoFactory().getOuvrageDao().getOuvrageByTitre(critere)	;
		}
		
		
		public List<OuvrageDTO> getOuvrageByAuteur(String critere) {
			 return getDaoFactory().getOuvrageDao().getOuvrageByAuteur(critere)	;
		}
	
	
	
		
		


}
