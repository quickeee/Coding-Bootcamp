package org.afdemp.bootcamp.sofos.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.afdemp.bootcamp.sofos.dao.UserDAO;
import org.afdemp.bootcamp.sofos.domain.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		UserDAO user = new UserDAO();
		try {
			User user1 = null;
			user.open();
			user1 = user.authenticateUser(username, pass);
			user.close();
			if (user1 != null) {
				session.setAttribute("user-object", user1);
				request.getRequestDispatcher("/register.jsp").forward(request, response);
				return;
			} else {
				String msg = "Wrong username or password";
				request.setAttribute("msg", msg);
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				return;
			}

		} catch (Exception e) {

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
