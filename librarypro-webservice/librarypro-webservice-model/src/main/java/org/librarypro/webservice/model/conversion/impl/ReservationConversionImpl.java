package org.librarypro.webservice.model.conversion.impl;

import java.util.HashSet;
import java.util.Set;

import org.librarypro.webservice.model.conversion.contract.OuvrageConversion;
import org.librarypro.webservice.model.conversion.contract.ReservationConversion;
import org.librarypro.webservice.model.conversion.contract.UtilisateurConversion;
import org.librarypro.webservice.model.dto.EmpruntDTO;
import org.librarypro.webservice.model.dto.ReservationDTO;
import org.librarypro.webservice.model.entities.Emprunt;
import org.librarypro.webservice.model.entities.Ouvrage;
import org.librarypro.webservice.model.entities.Reservation;
import org.librarypro.webservice.model.entities.Utilisateur;

public class ReservationConversionImpl implements ReservationConversion {

	@Override
	public ReservationDTO toReservationDTO(Reservation reservation, boolean isParent, String classParentName) {
		
		ReservationDTO r = new ReservationDTO();
		if(reservation.getIdreservation()!=0)
		{
			r.setIdreservation(reservation.getIdreservation());
		}
		
		if(reservation.getReservationdate()!=null)
		{
			r.setReservationdate(reservation.getReservationdate());
		}
		
		if(reservation.getMaildate()!=null)
		{
			r.setMaildate(reservation.getMaildate());
		}
		
		if(reservation.getOuvrage()!=null)
		{
			
			OuvrageConversion oConversion = new OuvrageConversionImpl();
			r.setOuvrageDTO(oConversion.toOuvrageDTO(reservation.getOuvrage(), false, Ouvrage.class.getSimpleName()));
		}
		
		if(reservation.getUtilisateur()!=null)
		{
			UtilisateurConversion uConversion = new UtilisateurConversionImpl();
			r.setUtilisateurDTO(uConversion.toUtilisateurDTO(reservation.getUtilisateur(), false, Utilisateur.class.getSimpleName()));
		}
		
		
		return r;
	}


	@Override
	public Set<ReservationDTO> toReservationsDTO(Set<Reservation> reservations, boolean isParent,
			String classParentName) {
		Set<ReservationDTO> o = new HashSet<>();
		for(Reservation reservation : reservations)
		{
			o.add(toReservationDTO(reservation, isParent, classParentName));
		}
		return o;
	}

	@Override
	public Reservation toReservationEntity(ReservationDTO reservation, boolean isParent, String classParentName) {
		
     Reservation r = new Reservation();
		if(reservation.getIdreservation()!=0)
		{
			r.setIdreservation(reservation.getIdreservation());
		}
		
		if(reservation.getReservationdate()!=null)
		{
			r.setReservationdate(reservation.getReservationdate());
		}
		
		if(reservation.getMaildate()!=null)
		{
			r.setMaildate(reservation.getMaildate());
		}
		
		if(reservation.getOuvrageDTO()!=null)
		{
			
			OuvrageConversion oConversion = new OuvrageConversionImpl();
			r.setOuvrage(oConversion.toOuvrageEntity(reservation.getOuvrageDTO(), false, Ouvrage.class.getSimpleName()));
		}
		
		if(reservation.getUtilisateurDTO()!=null)
		{
			UtilisateurConversion uConversion = new UtilisateurConversionImpl();
			r.setUtilisateur(uConversion.toUtilisateurEntity(reservation.getUtilisateurDTO(), false, Utilisateur.class.getSimpleName()));
		}
		
		return r;
		
	}

	@Override
	public Set<Reservation> toReservationsEntities(Set<ReservationDTO> reservations, boolean isParent,
			String classParentName) {
		Set<Reservation> ou= new HashSet<>();
		for(ReservationDTO r: reservations)
		{
			ou.add(toReservationEntity(r, isParent, classParentName));
		}
		return ou;
	}

}
