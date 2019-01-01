package hello;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.librarypro.webapp.model.OuvrageDTO;
import org.librarypro.webapp.model.ReservationDTO;
import org.librarypro.webapp.model.UtilisateurDTO;
import org.librarypro.webapp.webinterface.AbstractAction;

import com.opensymphony.xwork2.ActionContext;

public class ReserverAction extends AbstractAction {
	
	private String resultat=ERROR;
	private OuvrageDTO o;
	List<ReservationDTO> list;
	
	public List<ReservationDTO> getList() {
		return list;
	}


	public void setList(List<ReservationDTO> list) {
		this.list = list;
	}


	public static boolean dejareserve=false;
	
	
	
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
		ReservationDTO reserv= new ReservationDTO(); 
	    o= getManagerFactory().getOuvrageManager().getById(idouvrage);
	    list =getManagerFactory().getReservationManager().getList(u.getIdutilisateur(), o.getIdouvrage());
	    System.out.println(getManagerFactory().getReservationManager().getList(1,1).size()+"nadia");
		reserv.setUtilisateurDTO(u);
		reserv.setOuvrageDTO(o);
		reserv.setReservationdate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
		
		if(list.size()==0) {
	    getManagerFactory().getReservationManager().create(reserv);
		}
	   
		 return resultat =SUCCESS ;
		}


	public OuvrageDTO getO() {
		return o;
	}


	public void setO(OuvrageDTO o) {
		this.o = o;
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

