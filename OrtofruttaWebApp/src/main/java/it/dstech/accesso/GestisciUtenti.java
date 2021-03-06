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
import it.dstech.ortofrutta.Prodotto;
import it.dstech.ortofrutta.Scontrino;
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
			PreparedStatement preparedStatement = con().prepareStatement("INSERT INTO Utente (Nome,Username,Et�,Cognome,Tipo) Values (?,?,?,?,?);");
			preparedStatement.setString(1, utente.getName());
			preparedStatement.setString(2, utente.getUsername());
			preparedStatement.setString(3, utente.getEta());
			preparedStatement.setString(4, utente.getCognome());
			preparedStatement.setString(5, utente.getTipo());
			preparedStatement.execute();
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
			String eta = resultSet.getString("Et�");
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

	public void gestioneCarrello(String User,String prodottoNome,int quantita) throws ClassNotFoundException, SQLException {
		AccessoDB accessoDB = new AccessoDB();
		for (Utente u : lista()) {
			if(u.getUsername().equalsIgnoreCase(User)) {
				for (Prodotto p : accessoDB.listaProdotti()) {
					if(p.getName().equalsIgnoreCase(prodottoNome) && accessoDB.inventarioAttuale(prodottoNome)-quantita>=0) {
						double prezzo = p.getPrice() * quantita;
						aggiungiProdottoalCarrello(p, u, prezzo, accessoDB);
					}
				}
			}
		}
	}
	
	public void aggiungiProdottoalCarrello(Prodotto prodotto,Utente u,double prezzo, AccessoDB ac) throws SQLException, ClassNotFoundException {
		String query = "INSERT INTO Carrello (Proprietario,NomeProdotto,CostoCarrello) VALUES (?,?,?);";
		PreparedStatement statement = ac.accessoDB().prepareStatement(query);
		statement.setString(1, u.getUsername());
		statement.setString(2, prodotto.getName());
		statement.setDouble(3, prezzo);
		statement.execute();
	}

}
