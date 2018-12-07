package hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.librarypro.webapp.webinterface.AbstractAction;

public class Monprofil extends AbstractAction{
	
	String messagee;
	
	public String getMessagee() {
		return messagee;
	}

	public void setMessagee(String messagee) {
		this.messagee = messagee;
	}

	public String execute(){  
		
		HttpServletRequest requete=ServletActionContext.getRequest();  
		HttpSession session=requete.getSession();  
		  
		String session1=(String)session.getAttribute("login");
		
		if(session1!=null && !session1.equals("")){  
		    return SUCCESS;  
		}  
		else{ 
			
			messagee="Veuillez vous connecter pour accéder à cette page";
		    return ERROR;  
		}  
		
	}
		
		  

}
