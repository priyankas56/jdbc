package com.xworkz.complex.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class StreetReader2 {

	public static void main(String[] args) {
String query="select email,password  from customer_details where phnNO=73460750873";


		
		Connection connection=null;
		
		
		try {
		connection=	DriverManager.getConnection(StreetEnum.URL.getValue(),StreetEnum.USERNAME.getValue(),StreetEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		
		
		while(resultSet.next()) {
			System.out.println("data from table=="+ resultSet.getString("email"));
			System.out.println("data from table=="+ resultSet.getString("password"));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
}

	

