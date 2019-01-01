package org.librarypro.webservice.model.conversion.contract;

import java.util.Set;

import org.librarypro.webservice.model.dto.ReservationDTO;
import org.librarypro.webservice.model.entities.Reservation;

public interface ReservationConversion {
	
	ReservationDTO toReservationDTO(Reservation reservation, boolean isParent, String classParentName);
	Set<ReservationDTO> toReservationsDTO(Set<Reservation> reservations, boolean isParent, String classParentName);
	Reservation toReservationEntity(ReservationDTO reservation, boolean isParent, String classParentName);
	Set<Reservation> toReservationsEntities(Set<ReservationDTO> reservations, boolean isParent, String classParentName);

}
