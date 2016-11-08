package dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Utility class used for retrieving database connection
 * 
 * @author Dimitris
 */
public class DaoUtils {
	private static final String databaseUrl = "jdbc:mysql://localhost:3306/bids4job_db";
	private static final String databaseUsername = "root";
	private static final String databasePassword = "xxxx";

	public static Connection getConnection()
			throws SQLException, IllegalAccessException, InstantiationException, ClassNotFoundException {
		if (!DriverManager.getDrivers().hasMoreElements()) {
			registerDriver();
		}
		return DriverManager.getConnection(databaseUrl, databaseUsername, databasePassword);
	}

	public static void registerDriver()
			throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
		DriverManager.registerDriver((Driver) Class.forName("com.mysql.jdbc.Driver").newInstance());
	}
}
