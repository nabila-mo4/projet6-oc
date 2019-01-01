package org.librarypro.webapp.business.impl.manager;

import java.util.List;

import org.librarypro.webapp.business.contract.manager.ReservationManager;
import org.librarypro.webapp.model.ReservationDTO;

public class ReservationManagerImpl extends AbstractManagerImpl  implements ReservationManager {

	
	
	public List<ReservationDTO> getList(int idutilisateur, int idouvrage) {
		return getDaoFactory().getReservationDao().getList(idutilisateur, idouvrage);
	}

	public List<ReservationDTO> getListByOuvrage(int idouvrage) {
		return getDaoFactory().getReservationDao().getListByOuvrage(idouvrage);
	}

	public void create(ReservationDTO reservation) {
		getDaoFactory().getReservationDao().create(reservation);
		
	}

	public List<ReservationDTO> getListByOuvrageTriee(int idouvrage) {
		return getDaoFactory().getReservationDao().getListByOuvrageTriee(idouvrage);
	}

	public void update(ReservationDTO reservation) {
	    getDaoFactory().getReservationDao().update(reservation);
		
	}

	public void delete(ReservationDTO reservation) {
		 getDaoFactory().getReservationDao().delete(reservation);
		
	}
	
	

}