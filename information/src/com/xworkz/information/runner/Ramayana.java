package com.xworkz.information.runner;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class Ramayana {
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String userName="root";
		String password="Xworkzodc@123";
		
		Connection connection=null;
		
		try {
			connection = DriverManager.getConnection(url, userName, password);

				if(connection!=null)
		{
			System.out.println("this is connected");
		}else {
			System.out.println("this is not connected");
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

}
