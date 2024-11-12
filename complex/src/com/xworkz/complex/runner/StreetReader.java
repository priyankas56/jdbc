package com.xworkz.complex.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class StreetReader {

	public static void main(String[] args) {
String readOperation="select name from customer_details where email='varsh@gmail.com' and password=143456";
		
		Connection connection=null;
		
		
		try {
		connection=	DriverManager.getConnection(StreetEnum.URL.getValue(),StreetEnum.USERNAME.getValue(),StreetEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(readOperation);
		
		
		while(resultSet.next()) {
			System.out.println("data from table=="+ resultSet.getString("name"));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

}


	
