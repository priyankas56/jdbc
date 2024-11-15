package com.xworkz.trade.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class productQuery5 {

	public static void main(String[] args) {
String query="select description from product_table where productName='microwave oven' and quantity=1";
		
		Connection connection=null;
		
	
		
		try {
		connection=	DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		
		
		while(resultSet.next()) {
			System.out.println("description="+ resultSet.getString("description"));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}



}
