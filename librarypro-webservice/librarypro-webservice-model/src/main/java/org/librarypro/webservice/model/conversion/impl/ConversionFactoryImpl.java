package org.librarypro.webservice.model.conversion.impl;

import org.librarypro.webservice.model.conversion.contract.AuteurConversion;
import org.librarypro.webservice.model.conversion.contract.ConversionFactory;
import org.librarypro.webservice.model.conversion.contract.EmpruntConversion;
import org.librarypro.webservice.model.conversion.contract.OuvrageConversion;
import org.librarypro.webservice.model.conversion.contract.ReservationConversion;
import org.librarypro.webservice.model.conversion.contract.UtilisateurConversion;

public class ConversionFactoryImpl implements ConversionFactory{
	
	OuvrageConversion ouvrageConversion;
	AuteurConversion auteurConversion;
	EmpruntConversion empruntConversion;
	UtilisateurConversion utilisateurConversion;
	ReservationConversion reservationConversion;
	
	
	public OuvrageConversion getOuvrageConversion() {
		
		return ouvrageConversion;
	}

	public void setOuvrageConversion(OuvrageConversion ouvrageConversion) {
		this.ouvrageConversion = ouvrageConversion;
		
		
	}

	public AuteurConversion getAuteurConversion() {
		
		return auteurConversion;
	}

	public void setAuteurConversion(AuteurConversion auteurConversion) {
		this.auteurConversion=auteurConversion;
		
	}

	
	public EmpruntConversion getEmpruntConversion() {
		return empruntConversion;
	}

	
	public void setEmpruntConversion(EmpruntConversion empruntConversion) {
		this.empruntConversion=empruntConversion;		
	}

	
	public UtilisateurConversion getUtilisateurConversion() {
		return utilisateurConversion;
	}

	
	public void setUtilisateurConversion(UtilisateurConversion utilisateurConversion) {
		this.utilisateurConversion=utilisateurConversion;
		
	}

	@Override
	public ReservationConversion getReservationConversion() {
		
		return reservationConversion;
	}

	@Override
	public void setReservationConversion(ReservationConversion reservationConversion) {
		this.reservationConversion=reservationConversion;
		
	}

}
