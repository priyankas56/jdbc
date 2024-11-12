package com.xworkz.application.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ApplicationReader3 {

	public static void main(String[] args) {
	
String query="select application_firstName from application_table where id>10";
		
		Connection connection=null;
		
		
		try {
		connection=	DriverManager.getConnection(ApplicationEnum.URL.getValue(),ApplicationEnum.USERNAME.getValue(),ApplicationEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		
		
		while(resultSet.next()) {
			System.out.println("data from table=="+ resultSet.getString("application_firstName"));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
}



