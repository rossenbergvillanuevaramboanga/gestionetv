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
 * Servlet implementation class PrepareUpdateTelevisoreServlet
 */
@WebServlet("/PrepareUpdateTelevisoreServlet")
public class PrepareUpdateTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrepareUpdateTelevisoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Long idTelevisore = Long.parseLong(request.getParameter("idTelevisore"));
		
		Televisore result = null;
		try {
			result = MyServiceFactory.getTelevisoreServiceInstance().caricaSingolo(idTelevisore);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		request.setAttribute("televisoreDaModificare", result);
		request.getRequestDispatcher("update.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
