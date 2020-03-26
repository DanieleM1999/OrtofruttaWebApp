package it.dstech.accesso;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Switch extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String parametro = req.getParameter("switch");
		if(parametro.equals("AggiungiAlCarrello")) {
			req.getRequestDispatcher("Carrello.jsp").forward(req, resp);	
			}
		else if(parametro.equals("Paga")) {
			req.getRequestDispatcher("Stampa.jsp").forward(req, resp);	
			}
		else if(parametro.equals("StampaCarrello")) {
			req.getRequestDispatcher("Aquisto.jsp").forward(req, resp);	
			}
		else if(parametro.equals("StampaListaClienti")) {
			req.getRequestDispatcher("StampaClienti.jsp").forward(req, resp);	
			}
		else if(parametro.equals("Fai2+2")) {
			req.getRequestDispatcher("2+2.jsp").forward(req, resp);	
			}
	}
}
