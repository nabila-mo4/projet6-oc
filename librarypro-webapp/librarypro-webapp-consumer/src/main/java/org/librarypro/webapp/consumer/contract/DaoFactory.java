package org.librarypro.webapp.consumer.contract;

import org.librarypro.webapp.consumer.contract.dao.AuteurDao;
import org.librarypro.webapp.consumer.contract.dao.EmpruntDao;
import org.librarypro.webapp.consumer.contract.dao.OuvrageDao;
import org.librarypro.webapp.consumer.contract.dao.ReservationDao;
import org.librarypro.webapp.consumer.contract.dao.UtilisateurDao;

public interface DaoFactory {
	
	 OuvrageDao getOuvrageDao();
	 void setOuvrageDao(OuvrageDao ouvrageDao);
	 
	 AuteurDao getAuteurDao();
	 void setAuteurDao(AuteurDao auteurDao);
	 
	 EmpruntDao getEmpruntDao();
	 void setEmpruntDao(EmpruntDao empruntDao);
	 
	 UtilisateurDao getUtilisateurDao();
	 void setUtilisateurDao(UtilisateurDao Dao);
	 
	 ReservationDao getReservationDao();
	 void setReservationDao(ReservationDao Dao);
	 

}
