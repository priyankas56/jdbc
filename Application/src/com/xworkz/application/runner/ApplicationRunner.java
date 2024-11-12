package com.xworkz.application.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		
		String insertQuery="insert into application_table(id,application_firstName,application_lastName,application_age,application_email,application_adress,application_pincode,application_mobileNo,application_adharNo,application_qualification,application_number,application_language)VALUES "
				+ "(1, 'priyanka', 'S', 22, 'priyanka23@gmail.com', 'banglore', 536702, 8122407324, 234509871234, 'BE',32345,'kannada'), "
				+ "(2, 'ganavi', 'B', 22, 'ganavi@gmail.com', 'banglore', 536701, 9845661103, 789043216754, 'EEE', 22345,'kannada'), "
				+ "(3, 'navya', 'M', 21, 'navya54@gmail.com', 'banglore', 526001, 8072235606, 91287340921, 'CSE', 62345,'kannada'), "
				+ "(4, 'sridhar', 'K', 24, 'sridhar034@gmail.com', 'banglore', 526800, 8164409876, 324198706574, 'ECE', 12345,'kannada'), "
				+ "(5, 'shivu', 'B', 25, 'shivu@gmail.com', 'banglore', 536701, 9956022432, 457612098374, 'B.Tech', 42345,'kannada'), "
				+ "(6, 'nayak', 'M', 20, 'nayak@gmail.com', 'banglore', 636701, 8122409234, 654378902610, 'CSC', 32345,'kannada'), "
				+ "(7, 'divya', 'N', 19, 'divya@gmail.com', 'banglore', 536701, 9944664654, 321409876509, 'EEE', 82345,'kannada'), "
				+ "(8, 'nayana', 'T', 20, 'nayana63@gmail.com', 'banglore', 536701, 7765611246, 456372810191, 'B.Com', 12345,'kannada'), "
				+ "(9, 'keerti', 'H', 23, 'keerti@gmail.com', 'banglore', 600001, 8172498832, 152472720908, 'BCA', 92345,'kannada'), "
				+ "(10, 'lav', 'P', 24, 'lav@gmail.com', 'banglore', 523019, 9609255412, 535309081281, 'B.Com.CA', 12345,'kannada'), "
				+ "(11, 'chintana', 'M', 25, 'chinthana401@gmail.com', 'banglore', 636702, 7122509556, 324252629807, 'MSW', 12345,'kannada'), "
				+ "(12, 'kirana', 'A', 27, 'kiran62@gmail.com', 'banglore', 554703, 6381500876, 98743215678, 'B.Sc.Maths', 52345,'kannada'), "
				+ "(13, 'likith', 'A', 21, 'likhith@gmail.com', 'banglore', 516900, 6522509143, 767685850302, 'EEE', 84345,'kannada'), "
				+ "(14, 'shivaraj', 'U', 20, 'shivaraj@gmail.com','banglore', 654231, 8065512657, 242325262710, 'BA.Eng', 62345,'kannada'), "
				+ "(15, 'dhanu', 'D', 19, 'dhanu@gmail.com', 'banglore', 536701, 7655309271, 101090879767, 'BCA', 12345,'kannada'), "
				+ "(16, 'sushmitha', 'R', 20, 'sushmitha@gmail.com', 'banglore', 736801, 6522416465, 454346420989, 'BSC', 22345,'kannada'), "
				+ "(17, 'jai', 'L', 22, 'jai002@gmail.com', 'banglore', 736801, 9698224963, 123767698083, 'MCA', 52345,'kannada'), "
				+ "(18, 'pradeep', 'A', 19, 'pradeep@gmail.com', 'banglore', 536701, 9952644012, 890812657693, 'ECE', 53345,'kannada'), "
				+ "(19, 'prajwal', 'A', 18, 'prajwal@gmail.com', 'banglore', 536701, 9047500110, 240256784318, 'B.Tech', 32345,'kannada'), "
				+ "(20, 'prathap', 'A', 24, 'prathap@gmail.com','banglore', 526001, 6522410933, 786509123403, 'MBA', 43345,'kannada')";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(ApplicationEnum.URL.getValue(),ApplicationEnum.USERNAME.getValue(),ApplicationEnum.PASSWORD.getValue());
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

