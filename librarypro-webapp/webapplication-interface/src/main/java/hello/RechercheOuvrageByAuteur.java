package hello;

import java.util.List;

import org.librarypro.webapp.model.OuvrageDTO;
import org.librarypro.webapp.webinterface.AbstractAction;



public class RechercheOuvrageByAuteur extends AbstractAction{
	
	    private List<OuvrageDTO> ouvrages;
	    private String auteur;
	
	
	public String getAuteur() {
			return auteur;
		}


		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}


	public String execute() {
		ouvrages = getManagerFactory().getOuvrageManager().getOuvrageByAuteur(auteur);
		if(ouvrages.isEmpty()) {
			String message="Pas d'ouvrage trouvé dans la base de données";
		}
		
	    return SUCCESS;
		
	}


	public List<OuvrageDTO> getOuvrages() {
		return ouvrages;
	}


	public void setOuvrages(List<OuvrageDTO> ouvrages) {
		this.ouvrages = ouvrages;
	}

}
