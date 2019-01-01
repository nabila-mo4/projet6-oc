package org.librarypro.webapp.consumer.impl.dao;

import java.util.List;

import org.librarypro.webapp.consumer.contract.dao.ReservationDao;
import org.librarypro.webapp.consumer.impl.AbstractDao;
import org.librarypro.webapp.model.ReservationDTO;

public class ReservationDaoImpl extends AbstractDao implements ReservationDao{

	
	    
		
		
	    public List<ReservationDTO> getList(int idutilisateur, int idouvrage) {
			
			return getReservationClient().getList(idutilisateur, idouvrage);
		}
	    
	    
	    
    public List<ReservationDTO> getListByOuvrage(int idouvrage) {
			
			return getReservationClient().getListByOuvrage(idouvrage);
		}



	public void create(ReservationDTO reservation) {
		getReservationClient().add(reservation);
		
	}



	public List<ReservationDTO> getListByOuvrageTriee(int idouvrage) {
		return getReservationClient().getListByOuvrageTriee(idouvrage);
	}



	public void update(ReservationDTO reservation) {
		getReservationClient().update(reservation);
		
	}
	
	
	public void delete(ReservationDTO reservation) {
		getReservationClient().delete(reservation);
		
	}



	
	    
	    
		

	}