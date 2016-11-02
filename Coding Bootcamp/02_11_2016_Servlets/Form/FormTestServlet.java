package org.afdemp.bootcamp.dimitristheo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormTestServlet
 */
@WebServlet("/FormTestServlet")
public class FormTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormTestServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("<!DOCTYPE html>");
		response.getWriter().append("<html>");
		response.getWriter().append("<head>");
		response.getWriter().append("<title>Exercise-4</title>");
		response.getWriter().append("<meta charset=\"UTF-8\">");
		response.getWriter().append("</head>");
		response.getWriter().append("<body>");
		response.getWriter().append("<form action=\"../bootcamp/FormTestServlet\" method=\"POST\">");
		response.getWriter().append("<input type=\"text\" name=\"key1\">");
		response.getWriter().append("<input type=\"text\" name=\"key2\">");
		response.getWriter().append("<input type=\"submit\" value=\"submit\">");
		response.getWriter().append("</form>");
		response.getWriter().append("</body>");
		response.getWriter().append("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String key1 = request.getParameter("key1");
		String key2 = request.getParameter("key2");
		response.getWriter().append("key1: " + key1);
		response.getWriter().append("\nkey2: " + key2);
	}

}
