package com.xworkz.complex.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StreetReader1 {

	public static void main(String[] args) {
String readOperation="select address from customer_details where name='deeraj' and phnNo=9846750873";
		
		Connection connection=null;
		
		
		try {
		connection=	DriverManager.getConnection(StreetEnum.URL.getValue(),StreetEnum.USERNAME.getValue(),StreetEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(readOperation);
		
		
		while(resultSet.next()) {
			System.out.println("data from table=="+ resultSet.getString("address"));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

}

