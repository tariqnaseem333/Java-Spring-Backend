package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GuestDetails {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_exercise";

	// Providing database credentials
	static final String USER = "root";
	static final String PASS = "root";

	// Method which fetches all the details of the guests
	public void getAllGuests() {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			// Load the Driver
			Class.forName(JDBC_DRIVER);
			
			// Create a connection
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			
			// Create a statement
			statement = connection.createStatement();
			
			// Create a Query and execute it
			String query = "Select * from guests";
			resultSet= statement.executeQuery(query);
			
			// Process the result 
			System.out.println("Guests Detail: ");
			System.out.println("---------------------");
			while(resultSet.next()) {
				System.out.println("Id: " + resultSet.getInt("guest_id") +
								   ", Name: " + resultSet.getString("guest_name") + 
								   ", City: " + resultSet.getString("guest_city"));	
			}
			System.out.println();
			
			// Closing the connection
			resultSet.close();
			statement.close();
			connection.close();
			
		} catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(connection != null)
					connection.close();
				if(statement != null)
					statement.close();
				if(resultSet != null)
					resultSet.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
	}

	// Method which fetches the name of all the guests
	public void getGuestsByName() {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			// Load the Driver
			Class.forName(JDBC_DRIVER);
			
			// Create a connection
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			
			// Create a statement
			statement = connection.createStatement();
			
			// Create a Query and execute it
			String query = "Select guest_name from guests";
			resultSet= statement.executeQuery(query);
			
			// Process the result 
			System.out.println("Guests Name: ");
			System.out.println("---------------------");
			while(resultSet.next()) {
				System.out.println(resultSet.getString("guest_name"));	
			}
			System.out.println();
			
			// Closing the connection
			resultSet.close();
			statement.close();
			connection.close();
			
		} catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(connection != null)
					connection.close();
				if(statement != null)
					statement.close();
				if(resultSet != null)
					resultSet.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
	}
	
}
