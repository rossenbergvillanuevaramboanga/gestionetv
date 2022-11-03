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
 * Servlet implementation class ExecuteInsertTelevisoreServlet
 */
@WebServlet("/ExecuteInsertTelevisoreServlet")
public class ExecuteInsertTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExecuteInsertTelevisoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String destinazione = "insertForm.jsp";

		// Binding
		String marca = request.getParameter("marca");
		String modello = request.getParameter("modello");
		String prezzo = request.getParameter("prezzo");
		String numeropollici = request.getParameter("numeropollici");
		String codice = request.getParameter("codice");

		if (marca.isBlank() || modello.isBlank() || prezzo.isBlank() || numeropollici.isBlank() || codice.isBlank()) {
			String messaggioErrore = "Inserire tutti i campi";
			request.setAttribute("messaggioErrore", messaggioErrore);
			request.getRequestDispatcher(destinazione).forward(request, response);
			return;
		}

		Televisore televisore = new Televisore(null, marca, modello, Integer.parseInt(prezzo), Integer.parseInt(numeropollici), codice);
		
		try {
			
			MyServiceFactory.getTelevisoreServiceInstance().inserisciSingolo(televisore);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		destinazione = "listAllTelevisori.jsp";
		String messaggioCreazione = "Abitante Inserito Nel DB";
		request.setAttribute("messaggioCreazione", messaggioCreazione);
		request.getRequestDispatcher(destinazione).forward(request, response);
	}

}
