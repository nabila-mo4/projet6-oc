package org.librarypro.webservice.model.entities;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable{
	
	private int idreservation;
	private Date reservationdate;
	private Utilisateur utilisateur;
	private Ouvrage ouvrage;
	private Date maildate;
	 
	


	public Date getMaildate() {
		return maildate;
	}

	public void setMaildate(Date maildate) {
		this.maildate = maildate;
	}

	public Reservation() {
		super();
	}

	public Reservation(Ouvrage ouvrage) {
		super();
		this.ouvrage = ouvrage;
	}

	public Reservation(Utilisateur utilisateur, Ouvrage ouvrage) {
		super();
		this.utilisateur = utilisateur;
		this.ouvrage = ouvrage;
	}

	

	public Reservation(int idreservation, Date reservationdate, Utilisateur utilisateur, Ouvrage ouvrage,
			Date maildate) {
		super();
		this.idreservation = idreservation;
		this.reservationdate = reservationdate;
		this.utilisateur = utilisateur;
		this.ouvrage = ouvrage;
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

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Ouvrage getOuvrage() {
		return ouvrage;
	}

	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}
	
	

}
