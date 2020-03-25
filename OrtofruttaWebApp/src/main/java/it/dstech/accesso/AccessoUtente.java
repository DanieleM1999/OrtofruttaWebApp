package it.dstech.accesso;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.gestionedb.AccessoDB;

public class AccessoUtente extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "hai tentato di accedere manualmente a questa pagina");
		req.getRequestDispatcher("SelectMenuPrincipale.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	AccessoDB accessoDB = new AccessoDB();
	String nomeProdotto = req.getParameter("Username");
//	
//	try {
//		accessoDB.aquisto(quantita, nomeProdotto);
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//	req.getRequestDispatcher("Acquisto.jsp").forward(req, resp);
//	}
//	
	
}
}
