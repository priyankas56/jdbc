package com.xworkz.trade.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class productQuery3 {

	public static void main(String[] args) {
String query="select barcode from product_table where productName='fitness tracker' and weight=32";
		
		Connection connection=null;
		
		
		try {
		connection=	DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		
		
		while(resultSet.next()) {
			System.out.println("barcode="+ resultSet.getString("barcode"));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
}

	
