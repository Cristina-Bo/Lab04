package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	static private final String jdbcUrl = "jdbc:mysql://127.0.0.1/iscritticorsi?user=root&password=Pallinomar99";

	public static Connection getConnection() {
		
		try {
				Connection connection = DriverManager.getConnection(jdbcUrl);
				return connection;
		} catch (SQLException e) {
			System.err.println("Errore Connessione al DB");
			e.printStackTrace();
			throw new RuntimeException("Cannot get a connection " + jdbcUrl, e);
		}
		
	}

}
