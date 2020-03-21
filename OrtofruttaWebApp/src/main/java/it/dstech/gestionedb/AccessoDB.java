package it.dstech.gestionedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccessoDB {

	public Connection accessoDB() throws ClassNotFoundException, SQLException {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	String pass = "0NNeA14tJn";
	String user = "wx7ypi70Zd";
	String url = "jdbc:mysql://remotemysql.com:3306/wx7ypi70Zd?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC&createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false";
	Connection con = DriverManager.getConnection(url, user, pass);
	return con;
	
	}
	
	
}
