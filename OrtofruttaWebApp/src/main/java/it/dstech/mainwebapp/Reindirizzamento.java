package it.dstech.mainwebapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.gestionedb.AccessoDB;

public class Reindirizzamento extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AccessoDB accessoDB = new AccessoDB();
		String parametro = req.getParameter("SceltaOperazioni");
		if(parametro.equals("Aggiungi Prodotto")) {
			req.getRequestDispatcher("AggiungiProdotto.jsp").forward(req, resp);	
			}
		else if(parametro.equals("Stampa ListaProdotti")) {
			req.getRequestDispatcher("Stampa.jsp").forward(req, resp);	
			}
		else if(parametro.equals("Registra Aquisto")) {
			req.getRequestDispatcher("Aquisto.jsp").forward(req, resp);	
			}
		else if(parametro.equals("Registra Arrivo")) {
			req.getRequestDispatcher("Carico.jsp").forward(req, resp);	
			}
		else if(parametro.equals("Cambia Prezzo")) {
			req.getRequestDispatcher("NuovoPrice.jsp").forward(req, resp);	
			}
		else if(parametro.equals("Cambia Descrizione")){
			req.getRequestDispatcher("NuovaDesc.jsp").forward(req, resp);	
			}
	}
}
