package com.xworkz.trade.runner;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ProductQuery {

	public static void main(String[] args) {
			
String query="select * from product_table";
		
		Connection connection=null;
		
		
		try {
		connection=	DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		
		
		while(resultSet.next()) {
			System.out.println("data from table=="+ resultSet.getString("productName"));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
}

		