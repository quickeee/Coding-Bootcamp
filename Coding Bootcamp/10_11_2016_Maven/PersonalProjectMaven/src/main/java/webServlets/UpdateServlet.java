package webServlets;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Task;
import service.TaskService;

/**
 * Servlet implementation class UpdateServlet
 * 
 * @author Dimitris
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TaskService mService = new TaskService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String taskId = request.getParameter("taskId");
		String workField = request.getParameter("workField");
		String date = null;
		date = request.getParameter("date");
		Timestamp deadline = null;
		deadline = Timestamp.valueOf(date + " " + "23:59:59");
		Task task = mService.findOne(Integer.parseInt(taskId));
		if (task == null) {
			String msg = "The Task you would like to update does not exist. Please give a new Task Id!";
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("update.jsp").forward(request, response);
			return;
		} else {
			if (mService.update(task.setDeadline(deadline).setWorkField(workField))) {
				response.sendRedirect("index");
			} else {
				response.getWriter().append("An error occured");
			}
		}
	}
}
