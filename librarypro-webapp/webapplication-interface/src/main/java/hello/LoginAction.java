package hello;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.librarypro.webapp.model.UtilisateurDTO;
import org.librarypro.webapp.webinterface.AbstractAction;

public class LoginAction extends AbstractAction implements SessionAware {
	
	private String email;
	private String mdp;
	private String nom;
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}

	private SessionMap<String,Object> session; 
	private UtilisateurDTO utilisateur;
	String message1;
	String message2;
	String message;
	
	
	
	public String getMessage2() {
		return message2;
	}



	public void setMessage2(String message2) {
		this.message2 = message2;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getMessage1() {
		return message1;
	}



	public void setMessage1(String message1) {
		this.message1 = message1;
	}



	public String execute(){  
   
		if(valider(email, mdp)){ 
	    	
	    	session.put("email", email);
	    	
	    	utilisateur = getManagerFactory().getUtilisateurManager().getUtilisateurByEmail(email);
	    	session.put("utilisateur",utilisateur);
	    	String idutilisateur=utilisateur.getIdutilisateur()+"";
	    	nom=utilisateur.getNom();
	    	session.put("idutilisateur", idutilisateur);
	    	
	    	 message1="Connexion réussie";
	    	
	    	
	        return SUCCESS;  
	    }  
	   else{  
	    	
         System.out.println("erreur");
	    	message="Email ou mot de passe erronnés";
		
	    	
	        return ERROR;}
	   }
	

	
	public UtilisateurDTO getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	public SessionMap<String, Object> getSession() {
		return session;
	}


	public void setSession(SessionMap<String, Object> session) {
		this.session = session;
	}


	public boolean valider(String email, String mdp) {
		System.out.println(mdp);
	 return(getManagerFactory().getUtilisateurManager().valider(email, mdp));
		 
	  
		


		
	}
	
	public void setSession(Map map) {  
	    session=(SessionMap)map;  
	    session.put("login","true");  
	    
	}  
	  
	public String logout(){  
	    session.invalidate();  
		message2="Déconnexion réussie";
	    
	    return SUCCESS;  
	}  
}


