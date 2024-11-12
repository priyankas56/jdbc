package com.xworkz.smartwatch.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SmartWatchReader1 {

	public static void main(String[] args) {

		
String query="select employee_adress from employee_table where employee_name='varsh' and employee_number=98456";
		
		Connection connection=null;
		
		
		try {
		connection=	DriverManager.getConnection(SmartWatchEnum.URL.getValue(),SmartWatchEnum.USERNAME.getValue(),SmartWatchEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		
		
		while(resultSet.next()) {
			System.out.println("data from table=="+ resultSet.getString("employee_adress"));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}



}
