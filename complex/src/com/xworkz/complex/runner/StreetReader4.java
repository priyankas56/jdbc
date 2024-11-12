package com.xworkz.complex.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class StreetReader4 {

	public static void main(String[] args) {
String query="select name from customer_details where id>10";
		
		Connection connection=null;
		
		
		try {
		connection=	DriverManager.getConnection(StreetEnum.URL.getValue(),StreetEnum.USERNAME.getValue(),StreetEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		
		
		while(resultSet.next()) {
			System.out.println("data from table=="+ resultSet.getString("name"));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
}



