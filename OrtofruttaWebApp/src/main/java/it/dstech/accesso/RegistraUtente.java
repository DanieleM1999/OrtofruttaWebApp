package it.dstech.accesso;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import it.dstech.ortofrutta.Utente;

public class RegistraUtente extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("Username");
		String name = req.getParameter("Name");
		String cognome = req.getParameter("Cognome");
		String giorno = req.getParameter("giorno");
		String mese = req.getParameter("mese");
		String anno = req.getParameter("anno");
		String eta = giorno + "/" + mese + "/" + anno;
		String tipo = req.getParameter("sceltaTipo");
		Utente utente = new Utente(username, name, cognome, eta, tipo);
		GestisciUtenti gestisciUtenti = new GestisciUtenti();
		try {
		boolean a = gestisciUtenti.aggiungiUtente(utente);
		if(a) {
			req.getRequestDispatcher("SelectMenuPrincipale.jsp").forward(req, resp);;
		}
		if(!a) {
			req.getRequestDispatcher("Errore.jsp").forward(req, resp);;
		}
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
	}

}
