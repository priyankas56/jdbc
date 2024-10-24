package com.xworkz.temple.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GaneshTemple {
public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/daimond";
		String userName="root";
		String password="Xworkzodc@123";
	    String inQuery="insert into movie_table values(20,'paramatma','puneeethrajkumar',250)";
	    Connection connection=null;
	    
	    try {
		connection=DriverManager.getConnection(url, userName, password);
			Statement statement=connection.createStatement();
			     int value =statement.executeUpdate(inQuery);
			     if(value>0) {
			    	 System.out.println("this is saved");
			     }else {
			    	 System.out.println("this is not saved");
			     }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	      
}
}


