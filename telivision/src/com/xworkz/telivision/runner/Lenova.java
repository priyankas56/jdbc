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
		String inQuery="insert into student_table values(1,'priyanka','be'),(2,'sushmitha','be'),(3,'varsh','bsc')"
				+ ",(4,'rakshitha','bcom'),(5,'sush','bcom'),(6,'kiran','pcmb'),(7,'pradeep','bca'),(8,'preethi','mcom'),(9,'nidhi','bca'),(10,'siri','be'),(11,'ganavi','bsc'),(12,'prakash','be')"
				+ ",(13,'sahana','bcom'),(14,'karna','be'),(15,'shivu','mca'),(16,'shubha','be'),(17,'nidhi','mcom'),(18,'chethan','bca'),(19,'chinmay','be'),(20,'chinthana','be')";
		String updateQuery1="update student_table set student_name='priya' where id=1";
		String updateQuery2="update student_table set student_name='prajwal' where id=2";
		String updateQuery3="update student_table set student_name='keerti' where id=3";
		String updateQuery4="update student_table set student_name='deeraj' where id=4";
		
		String updateQuery5="update student_table set student_name='deekshith' where id=5";
		String updateQuery6="update student_table set student_name='samantha' where id=6";
		String updateQuery7="update student_table set student_name='lav' where id=7";
		String updateQuery8="update student_table set student_name='vidya' where id=8";
		String updateQuery9="update student_table set student_name='navya' where id=9";
		String updateQuery10="update student_table set student_name='gagan' where id=10";
		
		String deleteQuery1="delete from student_table where id=11";
		String deleteQuery2="delete from student_table where id=12";
		String deleteQuery3="delete from student_table where id=13";
		String deleteQuery4="delete from student_table where id=14";
		String deleteQuery5="delete from student_table where id=15";
		String deleteQuery6="delete from student_table where id=16";
		String deleteQuery7="delete from student_table where id=17";
		String deleteQuery8="delete from student_table where id=18";
		String deleteQuery9="delete from student_table where id=29";
		String deleteQuery10="delete from student_table where id=20";


		 
	try {
		Connection connection=DriverManager.getConnection(url, userName, password);
		Statement statement=connection.createStatement();
		int value=statement.executeUpdate(deleteQuery10);
		if(value>0)
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



