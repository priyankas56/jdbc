package com.xworkz.application.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ApplicationReader1 {

	public static void main(String[] args) {
String query="select application_adress from application_table where application_firstName='navya' and application_mobileNo=8072235606";
		
		Connection connection=null;
		
		
		try {
		connection=	DriverManager.getConnection(ApplicationEnum.URL.getValue(),ApplicationEnum.USERNAME.getValue(),ApplicationEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		
		
		while(resultSet.next()) {
			System.out.println("data from table=="+ resultSet.getString("application_adress"));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

}
