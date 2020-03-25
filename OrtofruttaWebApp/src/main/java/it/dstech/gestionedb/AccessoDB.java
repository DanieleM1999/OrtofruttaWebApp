package it.dstech.gestionedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.dstech.ortofrutta.Prodotto;

public class AccessoDB {

	public Connection accessoDB() throws ClassNotFoundException, SQLException {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	String pass = "0NNeA14tJn";
	String user = "wx7ypi70Zd";
	String url = "jdbc:mysql://remotemysql.com:3306/wx7ypi70Zd?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC&createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false";
	Connection con = DriverManager.getConnection(url, user, pass);
	return con;
	
	}

	public List<Prodotto> listaProdotti() throws SQLException, ClassNotFoundException{
		List<Prodotto> listaprodotti = new ArrayList<>();
		String query = "SELECT * FROM ProdottiOrtofrutta;";
		Statement statement = accessoDB().createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		while(resultSet.next()) {
			String name = resultSet.getString("Name");
			int quantita = resultSet.getInt("Inventories");
			double prezzo = resultSet.getDouble("Price");
			String info = resultSet.getString("Info");
			Prodotto prodotto = new Prodotto(name, quantita, prezzo, info);
			listaprodotti.add(prodotto);
		}
		return listaprodotti;
	}
	public boolean controllo(Prodotto prodotto) throws ClassNotFoundException, SQLException {
		for (Prodotto p : listaProdotti()) {
			if(p.getName().equalsIgnoreCase(prodotto.getName())) {
				return false;
			}
		}
		return true;
	}
	
	public boolean aggiungiProdotto(Prodotto prodotto) throws SQLException, ClassNotFoundException {
		if(controllo(prodotto)) {
		String query = "INSERT INTO ProdottiOrtofrutta (Name,Inventories,Price,Info) VALUES (?,?,?,?);";
		PreparedStatement statement = accessoDB().prepareStatement(query);
		statement.setString(1, prodotto.getName());
		statement.setInt(2, prodotto.getInventories());
		statement.setDouble(3, prodotto.getPrice());
		statement.setString(4,prodotto.getInfo());
		statement.execute();
		return true;
		}
		return false;
		
	}
	
	public boolean aquisto(int numeroDaSottrarre,String nomeProdotto) throws SQLException, ClassNotFoundException {
		int inv = inventarioAttuale(nomeProdotto)-numeroDaSottrarre;
		if(inv>=0) {
		String query = "UPDATE ProdottiOrtofrutta SET Inventories = ? where Name = ? ;";
		PreparedStatement statement = accessoDB().prepareStatement(query);
		statement.setInt(1, inv);
		statement.setString(2, nomeProdotto);
		statement.execute();
		return true;
		}else {
			return false;
		}
	}

	private int inventarioAttuale(String nomeProdotto) throws SQLException, ClassNotFoundException {
		String querylettura = "SELECT Inventories FROM ProdottiOrtofrutta WHERE Name =\""+nomeProdotto+"\";";
		Statement statement1 = accessoDB().createStatement();
		ResultSet resultSet = statement1.executeQuery(querylettura);
		while(resultSet.next()) {
		return resultSet.getInt("Inventories");
		}
		return 0;
	}
	
	public void carico(int numeroAdd,String nomeProdotto) throws SQLException, ClassNotFoundException {
		int inv = inventarioAttuale(nomeProdotto)+numeroAdd;
		String query = "UPDATE ProdottiOrtofrutta SET Inventories = ? where Name = ? ;";
		PreparedStatement statement = accessoDB().prepareStatement(query);
		statement.setInt(1, inv);
		statement.setString(2, nomeProdotto);
		statement.execute();
		
	}
	
	public void nuovoPrezzo(double price,String nome) throws SQLException, ClassNotFoundException {
		String query = "UPDATE ProdottiOrtofrutta SET Price = ? where Name = ? ;";
		PreparedStatement statement = accessoDB().prepareStatement(query);
		statement.setDouble(1, price);
		statement.setString(2, nome);
		statement.execute();
	}
	
	public void nuovaDesc(String desc,String nome) throws SQLException, ClassNotFoundException {
		String query = "UPDATE ProdottiOrtofrutta SET Info = ? where Name = ? ;";
		PreparedStatement statement = accessoDB().prepareStatement(query);
		statement.setString(1, desc);
		statement.setString(2, nome);
		statement.execute();
	}
}
