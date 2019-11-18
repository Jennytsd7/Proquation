package com.proquation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.proquation.bean.Admin;
//Author : Rahul Suresh, Raghavan
public class AdminLoginDAO {
	public Admin ValidateAdmin(String username, String password) {
		String query = "select admin_password from Admin where admin_username=?";
		Connection connection = null;
		PreparedStatement statement = null;
		Admin admin = null;
		try {
			connection = (Connection) DatabaseConnection.getDBConnectionInstance().getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, username);
			ResultSet rs = statement.executeQuery();
			if(rs.next())
			{
				String dbPassword = rs.getString("admin_password");
				if(dbPassword.equals(password)) {
					admin = new Admin();
					admin.setAdminName(rs.getString("admin_fullname"));
					admin.setAdminUsername(rs.getString("admin_username"));
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(statement != null)
					statement.close();
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return admin;
	}

}
