package com.xworkz.duplex.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class floor {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String userName="root";
		String password="Xworkzodc@123";
		String inQuery="insert into employee_table values(1,'priyanka',900000),(2,'sushmitha',450000),(3,'varsh',500000)"
				+ ",(4,'rakshitha',600000),(5,'sush',700000),(6,'kiran',800000),(7,'pradeep',75000),(8,'preethi',85000),(9,'nidhi',233000),(10,'siri',300000),(11,'ganavi',35000),(12,'prakash',400000)"
				+ ",(13,'sahana',450000),(14,'karna',500000),(15,'shivu',550000),(16,'shubha',900000),(17,'nidhi',230000),(18,'chethan',450000),(19,'chinmay',98765),(20,'chinthana',34000)";
		String updateQuery1="update employee_table set employee_name='priya' where id=1";
		String updateQuery2="update employee_table set employee_name='prajwal' where id=2";
		String updateQuery3="update employee_table set employee_name='keerti' where id=3";
		String updateQuery4="update employee_table set employee_name='deeraj' where id=4";
		
		String updateQuery5="update employee_table set employee_name='deekshith' where id=5";
		String updateQuery6="update employee_table set employee_name='samantha' where id=6";
		String updateQuery7="update employee_table set employee_name='lav' where id=7";
		String updateQuery8="update employee_table set employee_name='vidya' where id=8";
		String updateQuery9="update employee_table set employee_name='navya' where id=9";
		String updateQuery10="update employee_table set employee_name='gagan' where id=10";
		
		String deleteQuery1="delete from employee_table where id=11";
		String deleteQuery2="delete from employee_table where id=12";
		String deleteQuery3="delete from employee_table where id=13";
		String deleteQuery4="delete from employee_table where id=14";
		String deleteQuery5="delete from employee_table where id=15";
		String deleteQuery6="delete from employee_table where id=16";
		String deleteQuery7="delete from employee_table where id=17";
		String deleteQuery8="delete from employee_table where id=18";
		String deleteQuery9="delete from employee_table where id=19";
		String deleteQuery10="delete from employee_table where id=20";


		 
	try {
		Connection connection=DriverManager.getConnection(url, userName, password);
		Statement statement=connection.createStatement();
		int value=statement.executeUpdate(deleteQuery5);
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


