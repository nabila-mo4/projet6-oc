package hello;

import java.util.List;

import org.librarypro.webapp.model.EmpruntDTO;
import org.librarypro.webapp.model.UtilisateurDTO;
import org.librarypro.webapp.webinterface.AbstractAction;

import com.opensymphony.xwork2.ActionContext;

public class ProlongerAction extends AbstractAction { 
	
	private int idemprunt;
	
	private String resultat=ERROR;
	
	private List<EmpruntDTO> prets;
	
	public String execute() {
		UtilisateurDTO u = (UtilisateurDTO) ActionContext.getContext().getSession().get("utilisateur");
		
		
	   prets=getManagerFactory().getEmpruntManager().getEmpruntByUser(u.getIdutilisateur());
		System.out.println(prets.size());
		for(EmpruntDTO emprunt : prets) {
			if(emprunt.getIdemprunt() == idemprunt) {
				
				//getManagerFactory().getEmpruntManager().prolonger(idemprunt);
				getManagerFactory().getEmpruntManager().prolonge(emprunt);
				
				resultat =SUCCESS ;
			}
		}
		
			return resultat;
		
	}

	public int getIdemprunt() {
		return idemprunt;
	}

	public void setIdemprunt(int idemprunt) {
		this.idemprunt = idemprunt;
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public List<EmpruntDTO> getPrets() {
		return prets;
	}

	public void setPrets(List<EmpruntDTO> prets) {
		this.prets = prets;
	}


}
