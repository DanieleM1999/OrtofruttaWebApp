package it.dstech.accesso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Client;

import it.dstech.gestionedb.AccessoDB;
import it.dstech.ortofrutta.Utente;

public class GestisciUtenti {

	public Connection con() throws ClassNotFoundException, SQLException {
		AccessoDB accessoDB = new AccessoDB();
		return accessoDB.accessoDB();
	}

	public boolean aggiungiUtente(Utente utente) throws SQLException, ClassNotFoundException {
		if(controlloSoloPerNome(utente.getUsername())) {
			
			return false;
		}else {
			PreparedStatement preparedStatement = con().prepareStatement("INSERT INTO Utenti (Nome,Username,Età,Cognome,Tipo) Values (?,?,?,?,?);");
			preparedStatement.setString(1, utente.getName());
			preparedStatement.setString(2, utente.getUsername());
			preparedStatement.setString(3, utente.getEta());
			preparedStatement.setString(4, utente.getCognome());
			preparedStatement.setString(5, utente.getTipo());
			
			return true;
		}
		
	}
	
	public List<Utente> lista() throws ClassNotFoundException, SQLException{
		List<Utente> lista = new ArrayList<>();
		String query = "SELECT * from Utente";
		Statement statement = con().createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			String username = resultSet.getString("Username");
			String name = resultSet.getString("Nome");
			String cognome = resultSet.getString("Cognome");
			String eta = resultSet.getString("Età");
			String tipo = resultSet.getString("Tipo");
			Utente utente = new Utente(username, name, cognome, eta, tipo);
			lista.add(utente);
		}
		return lista;
	}
	
	public boolean controlloSoloPerNome(String nome) throws ClassNotFoundException, SQLException {
	for (Utente utente : lista()) {
		if(utente.getUsername().equalsIgnoreCase(nome)) {
			return true;
		}
	}
	return false;
	}
}
