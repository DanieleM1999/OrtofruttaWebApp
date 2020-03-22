package it.dstech.mainwebapp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.gestionedb.AccessoDB;

public class NuovoPrezzo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AccessoDB accessoDB = new AccessoDB();
		String nomeProdotto = req.getParameter("Name");
		double price = Double.parseDouble(req.getParameter("Price"));
		try {
			accessoDB.nuovoPrezzo(price, nomeProdotto);;
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		req.getRequestDispatcher("PaginaFinale.jsp").forward(req, resp);
	}
	
}
