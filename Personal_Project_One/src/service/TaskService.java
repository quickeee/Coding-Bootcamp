package service;

import dao.TaskDao;
import domain.Task;

import java.sql.SQLException;
import java.util.List;

/**
 * Service class that executes all required business logic regarding bids.
 *
 * @author Dimitris.
 */
public class TaskService {

	private TaskDao dao = new TaskDao();

	/**
	 * Finds specific Task by id.
	 * 
	 * @param taskId
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Task findOne(int taskId) {
		try {
			return dao.findOne(taskId);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

	/**
	 * Find all existing Tasks in database.
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public List<Task> findAll() {
		try {
			return dao.findAll();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * Add a new Task in the database.
	 * 
	 * @param task
	 * @return
	 */
	public Task create(Task task) {
		try {
			return dao.create(task);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

	/**
	 * Updates one or more columns in a Task record in database.
	 * 
	 * @param task
	 * @return
	 * @throws SQLException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 */
	public boolean update(Task task) {
		try {
			return dao.update(task);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	/**
	 * Deletes a Task record in database.
	 * 
	 * @param task
	 * @return
	 * @throws SQLException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 */
	public boolean delete(Task task) {
		try {
			return dao.delete(task);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}
