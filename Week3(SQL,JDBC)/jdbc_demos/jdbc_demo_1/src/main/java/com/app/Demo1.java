package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			// Step 1 - Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully");

			// Step 2 - Open Connection
			// urljdbc:mysql://localhost:3306/dbname
			String url = "jdbc:mysql://localhost:3306/revature_mass_india";
			String username = "root";
			String password = "root"; // Give your DB username and Password
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
			
			//Step 3 - Create Statement
			Statement statement=connection.createStatement();
			String sql="select id,name,age,gender,city,sportsName,contact from player order by id desc";
			
			//Step 4 - Execute Query
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query executed successfully");
			
			//Step 5 - Process Results
			while(resultSet.next()) {
				System.out.print("Id : "+resultSet.getInt("id"));
				System.out.print(" Name : "+resultSet.getString("name"));
				System.out.print(" Gender : "+resultSet.getString("gender"));
				System.out.print(" City : "+resultSet.getString("city"));
				System.out.print(" Sports Name : "+resultSet.getString("sportsName"));
				System.out.print(" Age : "+resultSet.getInt("age"));
				System.out.println(" Contact : "+resultSet.getLong("contact"));
			}
			System.out.println("Results Processed");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				// Step 6 - Close connection
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
