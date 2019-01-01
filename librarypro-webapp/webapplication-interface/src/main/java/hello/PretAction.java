package hello;

import java.util.GregorianCalendar;
import java.util.List;

import org.librarypro.webapp.model.EmpruntDTO;
import org.librarypro.webapp.model.UtilisateurDTO;
import org.librarypro.webapp.webinterface.AbstractAction;

import com.opensymphony.xwork2.ActionContext;

public class PretAction extends AbstractAction{
	
	private List<EmpruntDTO> prets;
	private GregorianCalendar now = new GregorianCalendar();
	
	   
   
	public GregorianCalendar getNow() {
		return now;
	}


	public void setNow(GregorianCalendar now) {
		this.now = now;
	}


	public String execute() {
    	
    	UtilisateurDTO u = (UtilisateurDTO) ActionContext.getContext().getSession().get("utilisateur");
    	
    	if(u!=null) 
    	{
    	
    	System.out.println(u.getIdutilisateur()+"rtr");
    	
    	    
     	prets =  getManagerFactory().getEmpruntManager().getEmpruntByUser(u.getIdutilisateur());
   	    System.out.println(prets.size());
   	  //System.out.println(prets.get(0).isProlonge());
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
