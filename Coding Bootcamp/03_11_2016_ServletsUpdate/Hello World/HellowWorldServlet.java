package org.afdemp.bootcamp.dimitristheo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HellowWorldServlet
 */
@WebServlet("/hellow")
public class HellowWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HellowWorldServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("<html>");
		response.getWriter().append("<body>");
		response.getWriter().append("<form action=\"/bootcamp/hellow\" method=\"POST\">");
		response.getWriter().append("<input name=\"username\">");
		response.getWriter().append("<input type=\"password\"name=\"password\">");
		response.getWriter().append("<input type=\"submit\" value=\"Servlet post\">");
		response.getWriter().append("</form>");
		response.getWriter().append("</body>");
		response.getWriter().append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username != null && password.equals("123")) {
			response.getWriter().append("Hello, "+username);
		}else {
			response.getWriter().append("Sorry, wrong password");
		}
	}

}
