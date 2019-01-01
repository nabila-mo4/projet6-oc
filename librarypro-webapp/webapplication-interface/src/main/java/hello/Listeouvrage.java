package hello;

import java.util.List;

import org.librarypro.webapp.model.AuteurDTO;
import org.librarypro.webapp.model.OuvrageDTO;
import org.librarypro.webapp.model.ReservationDTO;
import org.librarypro.webapp.model.UtilisateurDTO;
import org.librarypro.webapp.webinterface.AbstractAction;

import com.opensymphony.xwork2.ActionContext;

public class Listeouvrage extends AbstractAction{
	
	private List<OuvrageDTO> ouvrages;
	private List<ReservationDTO> reservations;
	private int idutilisateur;
	public List<ReservationDTO> getReservations() {
		return reservations;
	}



	public void setReservations(List<ReservationDTO> reservations) {
		this.reservations = reservations;
	}



	public int getIdutilisateur() {
		return idutilisateur;
	}



	public void setIdutilisateur(int idutilisateur) {
		this.idutilisateur = idutilisateur;
	}

	private AuteurDTO auteur;
	public AuteurDTO getAuteur() {
		return auteur;
	}



	public void setAuteur(AuteurDTO auteur) {
		this.auteur = auteur;
	}

	private int idouvrage; 
	
    public String execute() throws Exception {
    	
        UtilisateurDTO u = (UtilisateurDTO) ActionContext.getContext().getSession().get("utilisateur");
    	
        //String idouvrage = ActionContext.getContext().getParameters().get("idouvrage").toString();
        //Work inputWork = new Work();
        //inputWork.setId(Integer.parseInt(workId));
        System.out.println(idouvrage);
        //int idouv=Integer.parseInt(idouvrage);

       // work = getManagerFactory().getWorkManager().getWork(inputWork);
       
    	 
        ReservationDTO reserv= new ReservationDTO();
		
	    //OuvrageDTO o= getManagerFactory().getOuvrageManager().getById(idouvrage);
		//idouvrage=o.getIdouvrage();
       
		
    	
        
        ouvrages=getManagerFactory().getOuvrageManager().list();
        
        reservations=getManagerFactory().getReservationManager().getList(u.getIdutilisateur(), idouvrage);
       // boolean reserve=ReserverAction.dejareserve;
      //  System.out.println(reserve);
        System.out.println(u.getIdutilisateur()+"tarik");
        System.out.println(idouvrage+"tarik");
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
	
    /*public String check() throws Exception {
    	
        reservations=getManagerFactory().getReservationManager().getList(idutilisateur, idouvrage);
        return SUCCESS;
    }*/


}
