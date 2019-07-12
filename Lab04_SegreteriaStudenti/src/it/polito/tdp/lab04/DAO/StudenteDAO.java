package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.polito.tdp.lab04.model.Studente;

public class StudenteDAO {
	
	// Controllo se studente (matricola e' iscritto ad un corso(codins)
	
	
	//Data una matricola ottengo lo studente

	public Studente getStudente(int matricola) {
		final String sql = "SELECT * FROM studente where matricola=?";
		Studente studente = null;
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, matricola);

			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				studente = new Studente(matricola, rs.getString("nome"), rs.getString("cognome"), rs.getString("cds"));
			}

			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}

		
		return studente;
	}

	
	
}
