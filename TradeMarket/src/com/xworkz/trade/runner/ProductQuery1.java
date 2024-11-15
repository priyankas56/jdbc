package com.xworkz.trade.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ProductQuery1 {

	public static void main(String[] args) {

		
String query="select productName from product_table where barcode='123456745612' and cost=4500";
		
		Connection connection=null;
		
		
		try {
		connection=	DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		
		
		while(resultSet.next()) {
			System.out.println("productName="+ resultSet.getString("productName"));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

	}


