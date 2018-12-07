package hello;

import java.util.List;

import org.librarypro.webapp.model.OuvrageDTO;
import org.librarypro.webapp.webinterface.AbstractAction;



public class RecherchesaveouvrageAction extends AbstractAction{
	
	    private List<OuvrageDTO> ouvrages;
	    private String ouvrageTitre;
	
	
	public String execute() {
		ouvrages = getManagerFactory().getOuvrageManager().getOuvrageByTitre(ouvrageTitre);
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


	public String getOuvrageTitre() {
		return ouvrageTitre;
	}


	public void setOuvrageTitre(String ouvrageTitre) {
		this.ouvrageTitre = ouvrageTitre;
	}

}
