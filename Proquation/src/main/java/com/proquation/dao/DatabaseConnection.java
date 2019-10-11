package com.proquation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static DatabaseConnection dbConnectionInstance;
	private Connection connection;
	private String url = "jdbc:mysql://localhost:3306/proquation";
	private String username = "root";
	private String password = "root1234";
	private DatabaseConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, username, password);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Database Connection Creation Failed : " + e.getMessage());
		}
	}
	
	public Connection getConnection() {
        return connection;
    }
	
	public static DatabaseConnection getDBConnectionInstance() throws SQLException {
		if(dbConnectionInstance == null)
			dbConnectionInstance = new DatabaseConnection();
		else if (dbConnectionInstance.getConnection().isClosed())
			dbConnectionInstance = new DatabaseConnection();
		return dbConnectionInstance;
	}
}
