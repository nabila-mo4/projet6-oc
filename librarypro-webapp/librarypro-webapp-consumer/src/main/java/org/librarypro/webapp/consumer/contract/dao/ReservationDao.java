package org.librarypro.webapp.consumer.contract.dao;

import java.util.List;

import org.librarypro.webapp.model.ReservationDTO;

public interface ReservationDao {
	
	
	List<ReservationDTO> getList(int idutilisteur, int idouvrage);
	List<ReservationDTO> getListByOuvrage(int idouvrage);
	List<ReservationDTO> getListByOuvrageTriee(int idouvrage);
	void create(ReservationDTO reservation);
	void update(ReservationDTO reservation);
	void delete(ReservationDTO reservation);
	
	
} 
