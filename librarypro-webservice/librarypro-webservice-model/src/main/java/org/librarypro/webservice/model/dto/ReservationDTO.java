package org.librarypro.webservice.model.dto;

import java.util.Date;

import org.librarypro.webservice.model.entities.Ouvrage;
import org.librarypro.webservice.model.entities.Utilisateur;

public class ReservationDTO {
	
	private int idreservation;
	private Date reservationdate;
	private UtilisateurDTO utilisateur;
	private OuvrageDTO ouvrage;
	private Date maildate;
	
	public ReservationDTO() {
		super();
	}
	
	public ReservationDTO(int idreservation, Date reservationdate, UtilisateurDTO utilisateur, OuvrageDTO ouvrage,
			Date maildate) {
		super();
		this.idreservation = idreservation;
		this.reservationdate = reservationdate;
		this.utilisateur = utilisateur;
		this.ouvrage = ouvrage;
		this.maildate = maildate;
	}

	public Date getMaildate() {
		return maildate;
	}

	public void setMaildate(Date maildate) {
		this.maildate = maildate;
	}

	public int getIdreservation() {
		return idreservation;
	}
	public void setIdreservation(int idreservation) {
		this.idreservation = idreservation;
	}
	public Date getReservationdate() {
		return reservationdate;
	}
	public void setReservationdate(Date reservationdate) {
		this.reservationdate = reservationdate;
	}
	public UtilisateurDTO getUtilisateurDTO() {
		return utilisateur;
	}
	public void setUtilisateurDTO(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}
	public OuvrageDTO getOuvrageDTO() {
		return ouvrage;
	}
	public void setOuvrageDTO(OuvrageDTO ouvrage) {
		this.ouvrage = ouvrage;
	}
	
	
}
