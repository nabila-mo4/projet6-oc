package hello;

import org.librarypro.webapp.model.AuteurDTO;
import org.librarypro.webapp.model.OuvrageDTO;
import org.librarypro.webapp.webinterface.AbstractAction;

public class Formulaire extends AbstractAction {
	
	private OuvrageDTO ouvrage;
	private AuteurDTO auteur;
	
	
    public AuteurDTO getAuteur() {
		return auteur;
	}

	public void setAuteur(AuteurDTO auteur) {
		this.auteur = auteur;
	}

	public String execute() throws Exception {
    	
        getManagerFactory().getOuvrageManager().create(ouvrage);
        return SUCCESS;
    }

	public OuvrageDTO getOuvrage() {
		return ouvrage;
	}

	public void setOuvrage(OuvrageDTO ouvrage) {
		this.ouvrage = ouvrage;
	}

	
}
