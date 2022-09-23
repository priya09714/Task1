package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static Connection connection;

	public static Connection getConnection() throws SQLException {
		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/soprasteria", "root", "Priya0962@");
			return connection;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
