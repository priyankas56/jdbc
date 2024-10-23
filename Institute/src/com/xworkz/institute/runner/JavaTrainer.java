package com.xworkz.institute.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaTrainer {
	
public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/language";
		String userName="root";
		String password="Xworkzodc@123";
		
		Connection connection=null;
		
	try {
		connection=DriverManager.getConnection(url,userName,password);
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



