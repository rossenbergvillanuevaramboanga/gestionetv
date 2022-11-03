package it.gestionetv.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.gestionetv.model.Televisore;
import it.gestionetv.service.MyServiceFactory;

/**
 * Servlet implementation class ExecuteDeleteTelevisoreServlet
 */
@WebServlet("/ExecuteDeleteTelevisoreServlet")
public class ExecuteDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExecuteDeleteTelevisoreServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Long idTelevisore = Long.parseLong(request.getParameter("idTelevisore"));

		try {
			Televisore televisore = MyServiceFactory.getTelevisoreServiceInstance().caricaSingolo(idTelevisore);
			MyServiceFactory.getTelevisoreServiceInstance().eliminaSingolo(televisore);
			// request.setAttribute("listAbitantiAttributeName",
			// MyServiceFactory.getTelevisoreServiceInstance().caricaTutti());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher("listAllTelevisori.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
