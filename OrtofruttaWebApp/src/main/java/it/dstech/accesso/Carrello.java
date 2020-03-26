package it.dstech.accesso;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.gestionedb.AccessoDB;

public class Carrello extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GestisciUtenti gestisciUtenti = new GestisciUtenti();
		String User = req.getParameter("User");
		String nomeProdotto = req.getParameter("Name");
		int quantita = Integer.parseInt(req.getParameter("inv"));
		try {
			gestisciUtenti.gestioneCarrello(User, nomeProdotto, quantita);
			req.getRequestDispatcher("SelectMenuPrincipale.jsp").forward(req, resp);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
