package it.dstech.mainwebapp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.gestionedb.AccessoDB;

public class Aquisto extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("messaggio", "hai tentato di accedere manualmente all' acquisto di qualche prodotto");
		req.getRequestDispatcher("SelectMenuPrincipale.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	AccessoDB accessoDB = new AccessoDB();
	String nomeProdotto = req.getParameter("Name");
	int quantita = Integer.parseInt(req.getParameter("inv"));
	try {
		accessoDB.aquisto(quantita, nomeProdotto);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	req.getRequestDispatcher("PaginaFinale.jsp").forward(req, resp);
	}
	
}
