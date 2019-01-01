package org.librarypro.webservice.business.impl.manager;

import java.util.ArrayList;
import java.util.List;

import org.librarypro.webservice.business.contract.manager.ReservationManager;
import org.librarypro.webservice.model.dto.EmpruntDTO;
import org.librarypro.webservice.model.dto.ReservationDTO;
import org.librarypro.webservice.model.entities.Emprunt;
import org.librarypro.webservice.model.entities.Reservation;

public class ReservationManagerImpl extends AbstractManagerImpl implements ReservationManager{

	@Override
	public void add(ReservationDTO reservation) {
		
		Reservation reservationEnt = getConvfac().getReservationConversion().toReservationEntity(reservation, true, ReservationDTO.class.getSimpleName());
		getDaoFc().getReservationDao().add(reservationEnt);
		
	}

	@Override
	public List<ReservationDTO> getList(int idutilisateur, int idouvrage) {
		List<Reservation> reservations= getDaoFc().getReservationDao().getList(idutilisateur,idouvrage);
		
		List<ReservationDTO> reservationsDTO = new ArrayList<>();
		for(Reservation r : reservations)
		{
			
			reservationsDTO.add(getConvfac().getReservationConversion().toReservationDTO(r, true, Reservation.class.getSimpleName()));
		}
		return reservationsDTO;
	}

	@Override
	public List<ReservationDTO> getListByOuvrage(int idouvrage) {
     List<Reservation> reservations= getDaoFc().getReservationDao().getListByOuvrageId(idouvrage);
		
		List<ReservationDTO> reservationsDTO = new ArrayList<>();
		for(Reservation r : reservations)
		{
			
			reservationsDTO.add(getConvfac().getReservationConversion().toReservationDTO(r, true, Reservation.class.getSimpleName()));
		}
		return reservationsDTO;
	}

	@Override
	public List<ReservationDTO> getListByOuvrageTriee(int idouvrage) {
     List<Reservation> reservations= getDaoFc().getReservationDao().getListByOuvrageIdTriee(idouvrage);
		
		List<ReservationDTO> reservationsDTO = new ArrayList<>();
		for(Reservation r : reservations)
		{
			
			reservationsDTO.add(getConvfac().getReservationConversion().toReservationDTO(r, true, Reservation.class.getSimpleName()));
		}
		return reservationsDTO;
	}

	@Override
	public void update(ReservationDTO reservation) {
		Reservation reservationEnt = getConvfac().getReservationConversion().toReservationEntity(reservation, true, ReservationDTO.class.getSimpleName());
		getDaoFc().getReservationDao().update(reservationEnt);
		
		
	}

	@Override
	public void delete(ReservationDTO reservation) {
		Reservation reservationEnt = getConvfac().getReservationConversion().toReservationEntity(reservation, true, ReservationDTO.class.getSimpleName());
		getDaoFc().getReservationDao().delete(reservationEnt);
		
	}
 
}
