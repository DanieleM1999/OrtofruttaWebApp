package it.dstech.mainwebapp;

public class ServletListaProdotti {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String parametro = req.getParameter("nomeParametro");
		int limit = Integer.parseInt(req.getParameter("limit"));
		try {
			List<String> city = getCity(parametro, limit);
			req.setAttribute("listaCitta", city);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("listaCittà.jsp").forward(req, resp);
	}

}
