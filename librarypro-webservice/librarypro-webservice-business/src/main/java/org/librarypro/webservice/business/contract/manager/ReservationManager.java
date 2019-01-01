package org.librarypro.webservice.business.contract.manager;

import java.util.List;

import org.librarypro.webservice.model.dto.ReservationDTO;
import org.librarypro.webservice.model.entities.Reservation;

public interface ReservationManager {
	
	public void add(ReservationDTO reservation);
	
	public List<ReservationDTO> getList(int idutilisateur,int idouvrage);
	
	public List<ReservationDTO> getListByOuvrage(int idouvrage);
	
	public List<ReservationDTO> getListByOuvrageTriee(int idouvrage);
	
	public void update(ReservationDTO reservation);
	
	public void delete(ReservationDTO reservation);
	
	

}
