package com.xworkz.mall.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LuluMall {

	public static void main(String[] args) {
	
		String url="jdbc:mysql://localhost:3306/java";
		String userName="root";
		String password="Xworkzodc@123";
		String inQuery="insert into course_table values(21,'web technology',9850)";
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
