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
		GestisciUtenti gestisciUtenti = new GestisciUtenti();
		String user = req.getParameter("Username");
	try {
		if(gestisciUtenti.controlloSoloPerNome(user)) {
			req.getRequestDispatcher("SelectMenuPrincipale.jsp").forward(req, resp);
		}else {
		req.getRequestDispatcher("Errore.jsp").forward(req, resp);
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
