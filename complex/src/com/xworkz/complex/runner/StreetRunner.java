package com.xworkz.complex.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class StreetRunner {

	public static void main(String[] args) {
	
		
		String insertQuery="insert into customer_details values(1,'sowmya','gowda',21,'sowmya@gmail.com',9876543634,900845,'kanakapura','karnataka',562126,'india',2134),"
				+ "(2,'priya','gowda',21,'priya@gmail.com',7760750873,143456,'banglore','karnataka',662126,'india',9841),"
				+ "(3,'varsh','hegde',21,'varsh@gmail.com',987650873,523456,'banglore','karnataka',562726,'india',9341),"
				+ "(4,'raksh','hegde',21,'raksh@gmail.com',6547750873,823456,'banglore','karnataka',564126,'india',2041),"
				+ "(5,'deeraj','patel',22,'deeraj@gmail.com',9846750873,323456,'banglore','karnataka',862126,'india',0341),"
				+ "(6,'keerti','gowda',21,'keerti@gmail.com',2365750873,983456,'banglore','karnataka',542126,'india',2340),"
				+ "(7,'ganavi','gowda',23,'ganavi@gmail.com',8765750873,987656,'banglore','karnataka',962126,'india',8341),"
				+ "(8,'shiva','nayak',21,'shiva@gmail.com',789650873,23456,'banglore','karnataka',542126,'india',2941),"
				+ "(9,'dhanya','patel',22,'dhanya@gmail.com',7744750873,43456,'banglore','karnataka',362126,'india',5341),"
				+ "(10,'jai','shankar',21,'jai@gmail.com',73460750873,456456,'banglore','karnataka',462126,'india',4341),"
				+ "(11,'vidya','patel',22,'vidya@gmail.com',9745750873,98456,'banglore','karnataka',862126,'india',6341),"
				+ "(12,'spandana','gowda',21,'spnadu@gmail.com',9876750873,56456,'banglore','karnataka',362126,'india',7341),"
				+ "(13,'yoghitha','gowda',21,'yoghitha@gmail.com',8860750873,803456,'banglore','karnataka',562126,'india',3341),"
				+ "(14,'pradeep','kumar',22,'prade@gmail.com',9960750873,876456,'banglore','karnataka',542126,'india',9341),"
				+ "(15,'ariya','patil',21,'ariya@gmail.com',7787650873,456456,'banglore','karnataka',532126,'india',1341),"
				+ "(16,'divya','gowda',21,'divya@gmail.com',8960750873,983456,'banglore','karnataka',962126,'india',2141),"
				+ "(17,'kavya','gowda',22,'kavya@gmail.com',9860750873,456456,'banglore','karnataka',876126,'india',0341),"
				+ "(18,'sanju','patel',21,'sanju@gmail.com',9960750873,345456,'banglore','karnataka',345126,'india',0341),"
				+ "(19,'lav','gowda',22,'lav@gmail.com',7890750873,987456,'banglore','karnataka',980126,'india',2741),"
				+ "(20,'pri','gowda',21,'pri@gmail.com',8970750873,783456,'banglore','karnataka',456126,'india',6341)";
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(StreetEnum.URL.getValue(),StreetEnum.USERNAME.getValue(),StreetEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			int data = statement.executeUpdate(insertQuery);
			if (data > 0) {
				System.out.println("this is saved");
			} else {
				System.err.println("this is not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


