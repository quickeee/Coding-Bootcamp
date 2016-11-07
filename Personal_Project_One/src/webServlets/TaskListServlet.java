package webServlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Task;
import service.TaskService;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/list")
public class TaskListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TaskService mService = new TaskService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TaskListServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Task> tasks = mService.findAll();
		if (tasks == null) {
			response.getWriter().append("Error!");
			return;
		}

		request.setAttribute("task_list", tasks);
		getServletContext().getRequestDispatcher("/TaskList.jsp").forward(request, response);

		// for (Task task : mService.findAll()){
		// response.getWriter().append("Task: ")
		// .append(String.valueOf(task.getTaskId()))
		// .append(", ")
		// .append(task.getWorkField())
		// .append(", ")
		// .append(task.getDeadline().toString())
		// .append("\n");
		// }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
