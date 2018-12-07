package hello;

import java.util.List;

import org.librarypro.webapp.model.AuteurDTO;
import org.librarypro.webapp.model.OuvrageDTO;
import org.librarypro.webapp.webinterface.AbstractAction;

public class Listeouvrage extends AbstractAction{
	
	private List<OuvrageDTO> ouvrages;
	private AuteurDTO auteur;
	public AuteurDTO getAuteur() {
		return auteur;
	}



	public void setAuteur(AuteurDTO auteur) {
		this.auteur = auteur;
	}

	private int idouvrage; 
	
    public String execute() throws Exception {
    	
        ouvrages=getManagerFactory().getOuvrageManager().list();
        return SUCCESS;
    }

	

	public List<OuvrageDTO> getOuvrages() {
		return ouvrages;
	}



	public void setOuvrages(List<OuvrageDTO> ouvrages) {
		this.ouvrages = ouvrages;
	}



	public int getIdouvrage() {
		return idouvrage;
	}

	public void setIdouvrage(int idouvrage) {
		this.idouvrage = idouvrage;
	}

}
