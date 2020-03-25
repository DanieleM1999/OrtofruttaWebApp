package it.dstech.accesso;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.gestionedb.AccessoDB;
import it.dstech.ortofrutta.Prodotto;
import it.dstech.ortofrutta.Utente;

public class RegistraUtente extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "hai tentato di accedere manualmente");
		req.getRequestDispatcher("SelectMenuPrincipale.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AccessoDB accessoDB = new AccessoDB();
		String username = req.getParameter("Username");
		String name = req.getParameter("Name");
		String cognome = req.getParameter("Cognome");
		String giorno = req.getParameter("giorno");
		String mese = req.getParameter("mese");
		String anno = req.getParameter("anno");
		String eta = giorno + "/" + mese + "/" + anno;
		try {
			Utente utente = new Utente(username, name, cognome, eta);
			GestisciUtenti gestisciUtenti = new GestisciUtenti();
			gestisciUtenti.aggiungiUtente(utente);
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		req.getRequestDispatcher("SelectMenuPrincipale.jsp").forward(req, resp);
	}

}
