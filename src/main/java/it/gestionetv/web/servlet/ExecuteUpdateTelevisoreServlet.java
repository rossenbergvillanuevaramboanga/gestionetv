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
 * Servlet implementation class ExecuteUpdateTelevisoreServlet
 */
@WebServlet("/ExecuteUpdateTelevisoreServlet")
public class ExecuteUpdateTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExecuteUpdateTelevisoreServlet() {
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
		String destinazione = "update.jsp";

		// Binding
		String id = request.getParameter("id");
		String marca = request.getParameter("marca");
		String modello = request.getParameter("modello");
		String prezzo = request.getParameter("prezzo");
		String numeropollici = request.getParameter("numeropollici");
		String codice = request.getParameter("codice");
		
		Televisore televisore = new Televisore(Long.parseLong(id), marca, modello, Integer.parseInt(prezzo), Integer.parseInt(numeropollici), codice);

		if (marca.isBlank() || modello.isBlank() || prezzo.isBlank() || numeropollici.isBlank() || codice.isBlank()) {
			String messaggioErrore = "Inserire tutti i campi";
			request.setAttribute("messaggioErrore", messaggioErrore);
			request.setAttribute("televisoreDaModificare",televisore);
			request.getRequestDispatcher(destinazione).forward(request, response);
			return;
		}

		
		try {
			
			MyServiceFactory.getTelevisoreServiceInstance().aggiornaSingolo(televisore);
			String messaggioAggiorna = "Abitante Aggiornato Nel DB";
			request.setAttribute("messaggioCreazione", messaggioAggiorna);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		destinazione = "listAllTelevisori.jsp";
		request.getRequestDispatcher(destinazione).forward(request, response);
	}

}
