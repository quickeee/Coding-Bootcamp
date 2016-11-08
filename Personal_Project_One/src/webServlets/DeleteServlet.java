package webServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Task;
import service.TaskService;

/**
 * Servlet implementation class DeleteServlet
 * 
 * @author Dimitris
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TaskService mService = new TaskService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/delete.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("deleteId"));
		Task task = mService.findOne(id);
		// Check if the requested Task does not exists.
		if (task == null) {
			String msg = "This Task does not exist. Please try again!";
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("delete.jsp").forward(request, response);
			return;
		}
		if (mService.delete(task)) {
			response.sendRedirect("index");
		} else {
			response.getWriter().append("An error occured");
		}
	}
}
