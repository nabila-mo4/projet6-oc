package org.librarypro.webservice.consumer.impl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.librarypro.webservice.consumer.contract.dao.ReservationDao;
import org.librarypro.webservice.consumer.impl.dao.OuvrageDaoImpl.OuvrageMapper;
import org.librarypro.webservice.model.entities.Emprunt;
import org.librarypro.webservice.model.entities.Ouvrage;
import org.librarypro.webservice.model.entities.Reservation;
import org.librarypro.webservice.model.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class ReservationDaoImpl implements ReservationDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	SqlParameterSource paramSource;
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}
	
	@Override
	public void add(Reservation reservation) {
		String sql="INSERT INTO reservation (reservationdate,idutilisateur,idouvrage) VALUES (:reservationdate,:idutilisateur,:idouvrage)";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(reservation));
		
	}  
	
	
	public SqlParameterSource getSqlParameterByModel(Reservation reservation) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(reservation !=null) {
			paramSource.addValue("idreservation", reservation.getIdreservation());
			paramSource.addValue("reservationdate", reservation.getReservationdate());
			paramSource.addValue("idouvrage",reservation.getOuvrage().getIdouvrage());
			paramSource.addValue("idutilisateur", reservation.getUtilisateur().getIdutilisateur());
		
		}
		return paramSource;
	}
	
	
	public static final class ReservationMapper implements RowMapper<Reservation>{
		public Reservation mapRow(ResultSet rs, int rowNum) throws SQLException{
			Reservation reservation = new Reservation();
			reservation.setIdreservation(rs.getInt("idreservation"));
			
			reservation.setReservationdate(rs.getDate("reservationdate"));
			
			reservation.setMaildate(rs.getDate("maildate"));
			
			Utilisateur utilisateur= new Utilisateur();
			utilisateur.setIdutilisateur(rs.getInt("idutilisateur"));
			reservation.setUtilisateur(utilisateur);
			
			Ouvrage ouvrage= new Ouvrage();
			ouvrage.setIdouvrage(rs.getInt("idouvrage"));
			reservation.setOuvrage(ouvrage);
			return reservation;
		}
	}


	/*@Override
	public List<Reservation> getList(int idouvrage) {
		
        String sql ="SELECT reservation.*  FROM reservation WHERE idouvrage=:idouvrage";
		List<Reservation> list = namedParameterJdbcTemplate.query(sql, new MapSqlParameterSource(
		           "idouvrage", idouvrage), new ReservationMapper());
		
		
		return list;
	
	}
*/
	@Override
	public List<Reservation> getList(int idutilisateur, int idouvrage) {
		
        String sql ="SELECT reservation.*  FROM reservation WHERE idouvrage=:idouvrage AND idutilisateur=:idutilisateur";
		List<Reservation> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(new Reservation(new Utilisateur(idutilisateur),new Ouvrage(idouvrage))), new ReservationMapper());
		
		
		return list;
	
	}
	
	
	public SqlParameterSource getSqlParameterByModelTwo(int idutilisateur, int idouvrage) {
		    MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		    paramSource.addValue("idutilisateur", idutilisateur);
			paramSource.addValue("idouvrage",idouvrage);
		    return paramSource;
	}

	@Override
	public List<Reservation> getListByOuvrageId(int idouvrage) {
		
		 String sql ="SELECT reservation.*  FROM reservation WHERE idouvrage=:idouvrage";
		 List<Reservation> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(new Reservation(new Ouvrage(idouvrage))), new ReservationMapper());
			
		return list;
	}

	@Override
	public List<Reservation> getListByOuvrageIdTriee(int idouvrage) {
		String sql ="SELECT reservation.*  FROM reservation WHERE idouvrage=:idouvrage ORDER BY reservationdate ASC";
		 List<Reservation> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModelTriee(new Reservation(new Ouvrage(idouvrage))), new ReservationMapper());
	     return list;
	     
	     
	}
	
	public SqlParameterSource getSqlParameterByModelTriee(Reservation reservation) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(reservation !=null) {
			paramSource.addValue("idreservation", reservation.getIdreservation());
			paramSource.addValue("reservationdate", reservation.getReservationdate());
			paramSource.addValue("idouvrage",reservation.getOuvrage().getIdouvrage());
			paramSource.addValue("maildate", reservation.getMaildate());
			
		
		}
		return paramSource;
	}

	@Override
	public void update(Reservation reservation) {
		
		
        String sql="UPDATE reservation SET reservationdate=:reservationdate,maildate=:maildate,idutilisateur=:idutilisateur,idouvrage=:idouvrage WHERE idreservation=:idreservation";
		
		
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModeltwo(reservation));
	
	}
	
	public SqlParameterSource getSqlParameterByModeltwo(Reservation reservation) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(reservation !=null) {
			paramSource.addValue("idreservation", reservation.getIdreservation());
			paramSource.addValue("reservationdate", reservation.getReservationdate());
			paramSource.addValue("maildate", reservation.getMaildate());
			
			paramSource.addValue("idouvrage", reservation.getOuvrage().getIdouvrage());
			paramSource.addValue("idutilisateur", reservation.getUtilisateur().getIdutilisateur());
			
		}
		return paramSource;
	}

	@Override
	public void delete(Reservation reservation) {
		
			String sql ="DELETE FROM reservation WHERE idreservation=:idreservation";
			namedParameterJdbcTemplate.update(sql, getSqlParameterByModelone(reservation));
			
		}
		

	public SqlParameterSource getSqlParameterByModelone(Reservation reservation) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource ();
		if(reservation !=null) {
			paramSource.addValue("idreservation", reservation.getIdreservation());
			paramSource.addValue("reservationdate", reservation.getReservationdate());
			paramSource.addValue("idouvrage",reservation.getOuvrage().getIdouvrage());
			paramSource.addValue("idutilisateur",reservation.getUtilisateur().getIdutilisateur());
			paramSource.addValue("maildate", reservation.getMaildate());
			
		
		}
		return paramSource;
	}
		
	
	 
}
