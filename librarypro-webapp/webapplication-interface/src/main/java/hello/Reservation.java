package hello;

import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.librarypro.webapp.model.OuvrageDTO;
import org.librarypro.webapp.model.ReservationDTO;
import org.librarypro.webapp.model.UtilisateurDTO;
import org.librarypro.webapp.webinterface.AbstractAction;

import com.opensymphony.xwork2.ActionContext;

public class Reservation extends AbstractAction {
	 private List<ReservationDTO> list;
	private String resultat=ERROR;
	
	private boolean dejareserve=false;
	
	
	
	private ReservationDTO reservation;
	private int idouvrage;
	public int getIdouvrage() {
		return idouvrage;
	}


	public void setIdouvrage(int idouvrage) {
		this.idouvrage = idouvrage;
	}
 

	public String execute() throws DatatypeConfigurationException {
		
		UtilisateurDTO u = (UtilisateurDTO) ActionContext.getContext().getSession().get("utilisateur");
		//u.getIdutilisateur();
		ReservationDTO reserv= new ReservationDTO();
		//int idouvrage=1;
	    OuvrageDTO o= getManagerFactory().getOuvrageManager().getById(idouvrage);
	   list =getManagerFactory().getReservationManager().getList(u.getIdutilisateur(), o.getIdouvrage());
	   // System.out.println(list.size());
		reserv.setUtilisateurDTO(u);
		reserv.setOuvrageDTO(o);
		reserv.setReservationdate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
		if(list.size()==0) {
	   
	    dejareserve=false;
		}
		else {
			dejareserve=true;
		}
		
		System.out.println(dejareserve);
		return resultat =SUCCESS ;
			
		}


	public ReservationDTO getReservation() {
		return reservation;
	}
	public void setReservation(ReservationDTO reservation) {
		this.reservation = reservation;
	}
	
	public String getResultat() {
		return resultat;
	}


	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	
}


