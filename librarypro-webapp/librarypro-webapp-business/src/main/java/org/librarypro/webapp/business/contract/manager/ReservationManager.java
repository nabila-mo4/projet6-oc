package org.librarypro.webapp.business.contract.manager;

import java.util.List;

import org.librarypro.webapp.model.ReservationDTO;

public interface ReservationManager {
	
	
	
	List<ReservationDTO> getList(int idutilisateur, int idouvrage);
	
	List<ReservationDTO> getListByOuvrage( int idouvrage);
	
	void create(ReservationDTO reservation);

	List<ReservationDTO> getListByOuvrageTriee( int idouvrage);
	
	void update(ReservationDTO reservation);
	
	void delete(ReservationDTO reservation);
}

