package hello;

import java.util.List;

import org.librarypro.webapp.model.EmpruntDTO;
import org.librarypro.webapp.model.UtilisateurDTO;
import org.librarypro.webapp.webinterface.AbstractAction;

import com.opensymphony.xwork2.ActionContext;

public class PretAction extends AbstractAction{
	
	private List<EmpruntDTO> prets;
	
	
   
	public String execute() {
    	
    	UtilisateurDTO u = (UtilisateurDTO) ActionContext.getContext().getSession().get("utilisateur");
    	
    	if(u!=null) 
    	{
    	
    	System.out.println(u.getIdutilisateur());
    	
    	    
     	prets =  getManagerFactory().getEmpruntManager().getEmpruntByUser(u.getIdutilisateur());
   	
        return SUCCESS;
        
    	}
    	
    	else
    	{
    		return ERROR;
    	}
    	
    	
    }


	public List<EmpruntDTO> getPrets() {
		return prets;
	}


	public void setPrets(List<EmpruntDTO> prets) {
		this.prets = prets;
	}


}
