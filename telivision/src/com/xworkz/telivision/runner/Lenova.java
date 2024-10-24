package com.xworkz.telivision.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Lenova {
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/dress";
		String userName="root";
		String password="Xworkzodc@123";
		String inQuery="insert into student_table values(21,'priyanka','be'),(2,'sushmitha','be'),(3,'varsh','bsc')"
				+ ",(4,'rakshitha','bcom'),(5,'sush','bcom'),(6,'kiran','pcmb'),(7,'pradeep','bca'),(8,'preethi','mcom'),(9,'nidhi','bca'),(10,'siri','be'),(11,'ganavi','bsc'),(12,'prakash','be')"
				+ ",(13,'sahana','bcom'),(14,'karna','be'),(15,'shivu','mca'),(16,'shubha','be'),(17,'nidhi','mcom'),(18,'chethan','bca'),(19,'chinmay','be'),(20,'chinthana','be')";
		 Connection connection=null;
		 
	try {
		connection=DriverManager.getConnection(url, userName, password);
		Statement statement=connection.createStatement();
		int updateQuery=statement.executeUpdate(inQuery);
		if(updateQuery>0)
		{
			System.out.println("this is saved");
		}else {
			System.out.println("this is not saved");
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

	}

}



