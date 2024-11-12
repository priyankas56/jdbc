package com.xworkz.smartwatch.runner;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SmartWatchReader {
	
	public static void main(String[] args) {
		
		String query="select employee_name from employee_table where employee_email='priya23@gmail.com' and employee_number=81224";
		
		Connection connection=null;
		
		
		try {
		connection=	DriverManager.getConnection(SmartWatchEnum.URL.getValue(),SmartWatchEnum.USERNAME.getValue(),SmartWatchEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		
		
		while(resultSet.next()) {
			System.out.println("data from table=="+ resultSet.getString("employee_name"));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

}
