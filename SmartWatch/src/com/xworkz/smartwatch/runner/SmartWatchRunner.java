package com.xworkz.smartwatch.runner;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SmartWatchRunner {
	public static void main(String[] args) {
	
	
			String insertQurey ="insert into employee_table values(1, 'priya', '22', 'banglore', 'priya23@gmail.com', 636702,'BE','ibm','chief executive',6000000, 81224,  'kannada'), "
			+ "(2, 'varsh', '22', 'banglore', 'varsh@gmail.com', 636701,'BE','infosys','product manager',7500000, 98456,  'kannada'), "
			+ "(3, 'raksh', '21', 'banglore', 'raksh254@gmail.com', 626001,'CA','accenture',' project manager',6500000,98445,'Urdu'), "
			+ "(4, 'Ashif', '21', 'banglore', 'ashif34@gmail.com', 626800,'CA','infosys',' finance manager',5500000, 81644, 'Tamil'), "
			+ "(5, 'keerthi', '22', 'banglore', 'keerti@gmail.com', 636701,'Bsc','infosys','accountant',8500000, 99560,'Tamil'), "
			+ "(6, 'Farook', '22', 'banglore', 'farook@gmail.com',  636701,'BE','dell','manager',9500000, 81224,'Telugu'), "
			+ "(7, 'siri', '24', 'banglore', 'siri@gmail.com',  636701,'BE','infosys','sales executive',9000000, 99446,'kannada'), "
			+ "(8, 'ganavi', '22', 'banglore', 'ganavi63@gmail.com', 636701,'Bsc','ibm','manager',2000000, 77656,'Tamil'), "
			+ "(9, 'Samrat', '23', 'banglore', 'samrat@gmail.com',  600001,'BE','akshay','HR',800000, 81724, 'kannada'), "
			+ "(10, 'kavitha', '22', 'banglore', 'kavitha@gmail.com',  623019,'BE','ibm','manager',6000000, 96092,'kannada'), "
			+ "(11, 'anusha', '21', 'banglore', 'anusha401@gmail.com',  636702,'Bsc','captumani','CEO',5000000, 71225, 'Tamil'), "
			+ "(12, 'bhavya', '21', 'banglore', 'bhavyad62@gmail.com',  654703,'BEd','infosys','manager',7600000, 63815,  'kannada'), "
			+ "(13, 'keerti', '22', 'banglore', 'keerti@gmail.com',  616900,'Bsc','wipro','manager',7600000, 65225,'kannada'), "
			+ "(14, 'lav', '22', 'banglore', 'lav@gmail.com',  654231,'mca','infosys','CEO',3000000, 24232, 'kannada'), "
			+ "(15, 'Sadiq', '24', 'banglore', 'sadiq062@gmail.com', 636701,'Bca','dell','technical support',4000000, 76553, 'kannada'), "
			+ "(16, 'kavya', '23', 'banglore', 'kavya@gmail.com',  736801,'Bca','wipro','HR',4500000, 65224, 'Kanada'), "
			+ "(17, 'divya', '25', 'banglore', 'divya002@gmail.com',  736801,'BE','infosys','manager',800000, 96982,'Kanada'), "
			+ "(18, 'jai', '23', 'banglore', 'jai@gmail.com',  636701,'Bcom','infosys','employee',9500000,95264,'kannada'), "
			+ "(19, 'prathap', '25', 'banglore', 'prathap@gmail.com',  636701,'BE','accenture','executive',7000000, 90475, 'kannada'), "
			+ "(20, 'sahana', '21', 'banglore', 'sahan@gmail.com',  626001,'Bcom','ibm','HR',6500000, 65224,'Kannada')";
	
	
			Connection connection = null;
			
			try {
				connection = DriverManager.getConnection(SmartWatchEnum.URL.getValue(),SmartWatchEnum.USERNAME.getValue(),SmartWatchEnum.PASSWORD.getValue());
				Statement statement = connection.createStatement();
				int data = statement.executeUpdate(insertQurey);
				if (data > 0) {
					System.out.println("Connected Successfull");
				} else {
					System.err.println("Not connected");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


