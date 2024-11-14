package com.xworkz.component.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComponentRunner3 {

	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement prst=null;
		
		try {
		connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
		   prst=connection.prepareStatement("insert into phone_table values(?,?,?)");
		   
		   prst.setInt(1, 1);
		   prst.setString(2, "samsung");
		   prst.setString(3, "20000");
		   prst.setInt(1, 2);
		   prst.setString(2, "oppo");
		   prst.setString(3, "25000");
		   prst.setInt(1, 3);
		   prst.setString(2, "vivo");
		   prst.setString(3, "30000");
		   prst.setInt(1, 4);
		   prst.setString(2, "real me");
		   prst.setString(3, "50000");
		   prst.setInt(1, 5);
		   prst.setString(2, "I phone");
		   prst.setString(3, "100000");
		   prst.setInt(1, 6);
		   prst.setString(2, "redmi");
		   prst.setString(3, "25000");
		   prst.setInt(1, 7);
		   prst.setString(2, "oneplus");
		   prst.setString(3, "40000");
		   prst.setInt(1, 8);
		   prst.setString(2, "samsung galaxy");
		   prst.setString(3, "16000");
		   prst.setInt(1, 9);
		   prst.setString(2, "realme narzo");
		   prst.setString(3, "22000");
		   prst.setInt(1, 10);
		   prst.setString(2, "moto");
		   prst.setString(3, "19000");
		   prst.setInt(1, 11);
		   prst.setString(2, "infinix");
		   prst.setString(3, "21000");
		   prst.setInt(1, 12);
		   prst.setString(2, "motorola edge");
		   prst.setString(3, "22000");
		   prst.setInt(1, 13);
		   prst.setString(2, "google pixel");
		   prst.setString(3, "49000");
		   prst.setInt(1, 14);
		   prst.setString(2, "redmi note");
		   prst.setString(3, "24000");
		   prst.setInt(1, 15);
		   prst.setString(2, "apple iphone");
		   prst.setString(3, "85000");
		    int pk=prst.executeUpdate();
		    if(pk>0)
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
