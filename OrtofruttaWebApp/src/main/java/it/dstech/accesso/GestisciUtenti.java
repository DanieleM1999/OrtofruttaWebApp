package it.dstech.accesso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import it.dstech.gestionedb.AccessoDB;
import it.dstech.ortofrutta.Utente;

public class GestisciUtenti {

	public Connection con() throws ClassNotFoundException, SQLException {
		AccessoDB accessoDB = new AccessoDB();
		return accessoDB.accessoDB();
	}

	public void aggiungiUtente(Utente utente) throws SQLException, ClassNotFoundException {
		AccessoDB accessoDB = new AccessoDB();
		String query = "INSERT INTO ProdottiOrtofrutta (Username, Name, Cognome, Eta) VALUES (?,?,?,?);";
		PreparedStatement statement = (PreparedStatement) accessoDB.accessoDB();
		statement.setString(1, utente.getUsername());
		statement.setString(2, utente.getName());
		statement.setString(3, utente.getCognome());
		statement.setString(4, utente.getEta());
		statement.execute();
	}
}
