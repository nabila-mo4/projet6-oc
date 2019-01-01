package org.librarypro.webservice.consumer.contract.dao;

import java.util.List;

import org.librarypro.webservice.model.entities.Reservation;

public interface ReservationDao {
	
	void add(Reservation reservation);
	
	List<Reservation > getList(int idutilisateur,int idouvrage);
	
	List<Reservation > getListByOuvrageId(int idouvrage);
	
	List<Reservation > getListByOuvrageIdTriee(int idouvrage);
	
	void update(Reservation reservation);
	
	void delete(Reservation reservation);

} 
