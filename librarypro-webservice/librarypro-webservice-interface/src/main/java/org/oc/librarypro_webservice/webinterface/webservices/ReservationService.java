package org.oc.librarypro_webservice.webinterface.webservices;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.librarypro.webservice.model.dto.ReservationDTO;
import org.librarypro.webservice.model.entities.Reservation;
import org.oc.librarypro_webservice.webinterface.AbstractService;

@WebService (name = "ReservationClient", serviceName = "ReservationService", portName = "ReservationPort", targetNamespace="model.webapp.librarypro.org")
public class ReservationService extends AbstractService {
	
	@WebMethod
	public void add(ReservationDTO reservation)
	{
	   getManagerFactory().getReservationManager().add(reservation);
	}
	
	@WebMethod
	public List<ReservationDTO> getList(int idutilisateur, int idouvrage)
	{
	   return getManagerFactory().getReservationManager().getList(idutilisateur, idouvrage);
	}

	
	@WebMethod
	public List<ReservationDTO> getListByOuvrage(int idouvrage)
	{
	   return getManagerFactory().getReservationManager().getListByOuvrage(idouvrage);
	}
	
	@WebMethod
	public List<ReservationDTO> getListByOuvrageTriee(int idouvrage)
	{
	   return getManagerFactory().getReservationManager().getListByOuvrageTriee(idouvrage);
	}

	
	@WebMethod
	public void update(ReservationDTO reservation)
	{
	   getManagerFactory().getReservationManager().update(reservation);
	}
	
	@WebMethod
	public void delete(ReservationDTO reservation)
	{
	   getManagerFactory().getReservationManager().delete(reservation);
	}
} 
