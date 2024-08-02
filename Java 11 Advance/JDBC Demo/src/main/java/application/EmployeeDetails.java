package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class EmployeeDetails {
	
	private static final Log LOGGER = LogFactory.getLog(EmployeeDetails.class);
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_demo";

	// Providing database credentials
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			// Step No. 1: Registering the JDBC driver
			Class.forName(JDBC_DRIVER);

			// Step No. 2: Opening a connection
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			
			// Step No. 3: Create Statement
			statement = connection.createStatement();
			
			// Step No. 4: Prepare and Execute the Query
			String sql = "select * from employee";
			ResultSet resultset = statement.executeQuery(sql);

			// Step No. 5: Process the result
			// The next() method moves the cursor forward by one row from
			// it's current position in the resultset
			while(resultset.next()) {
				// getInt() gets the value of a column as integer
				// getString() gets the value of a column as string
				// Retrieve by column id
				int id = resultset.getInt(1);
				String name = resultset.getString(2);
				int age = resultset.getInt(3);
				// Displaying the values
				LOGGER.info("Id: " + id+", Name: " + name+", Age: " + age);
			}
			
			// Step No. 6: Closing the connection
			resultset.close();
			statement.close();
			connection.close();
			
		} catch (SQLException se) {
			// This handles errors for JDBC
			System.out.println(se);
		} catch (Exception e) {
			// This handles errors for Class.forName
			LOGGER.info(e);
		} finally {
			// finally block closes all the resources
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				LOGGER.info(se);
			}
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException se2) {
				LOGGER.info(se2);
			}

			try {
				if (resultSet != null)
					resultSet.close();
			} catch (SQLException se) {
				LOGGER.info(se);
			}
		}
	}
}
