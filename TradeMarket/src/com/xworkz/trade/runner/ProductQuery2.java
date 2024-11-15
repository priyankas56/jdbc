package com.xworkz.trade.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductQuery2 {

	public static void main(String[] args) {
		
		String query="select barcode from product_table where productId=2 and material='electronic'";
	Connection connection=null;
	
	try {
		connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
		Statement statement=connection.createStatement();
		ResultSet resultset=statement.executeQuery(query);
		while(resultset.next()) {
			System.out.println("barcode="+resultset.getString("barcode"));
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

	}

}
