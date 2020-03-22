package it.dstech.mainwebapp;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.gestionedb.AccessoDB;
import it.dstech.ortofrutta.Prodotto;

public class AggiungiProdotto extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AccessoDB accessoDB = new AccessoDB();
		String name = req.getParameter("Name");
		int quantita = Integer.parseInt(req.getParameter("inventories"));
		double prezzo = Double.parseDouble(req.getParameter("price"));
		String info = req.getParameter("info");
		try {
			Prodotto prodotto = new Prodotto(name, quantita, prezzo, info);
			accessoDB.aggiungiProdotto(prodotto);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		req.getRequestDispatcher("PaginaFinale.jsp").forward(req, resp);
	}
	
}
