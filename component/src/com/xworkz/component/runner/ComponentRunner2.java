package com.xworkz.component.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComponentRunner2 {

	public static void main(String[] args) {
	
		
		Connection connection=null;
		PreparedStatement prst=null;
		
		try {
			connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
			
	      prst=connection.prepareStatement("insert into foodstatus_table values(?,?,?)");
	      
	    prst.setInt(1, 1);
	    prst.setString(2,"pizza");
	    prst.setString(3,"deliver");
	    prst.setInt(1, 2);
	    prst.setString(2,"burger");
	    prst.setString(3,"pending");
	    prst.setInt(1, 3);
	    prst.setString(2,"veg role");
	    prst.setString(3,"deliver");
	    prst.setInt(1, 4);
	    prst.setString(2,"paneer");
	    prst.setString(3,"deliver");
	    prst.setInt(1, 5);
	    prst.setString(2,"roti");
	    prst.setString(3,"pending");
	    prst.setInt(1, 6);
	    prst.setString(2,"biriyani");
	    prst.setString(3,"deliver");
	    prst.setInt(1, 7);
	    prst.setString(2,"pasta");
	    prst.setString(3,"pending");
	    prst.setInt(1, 8);
	    prst.setString(2,"sandwich");
	    prst.setString(3,"deliver");
	    prst.setInt(1, 9);
	    prst.setString(2,"kebab");
	    prst.setString(3,"pending");
	    prst.setInt(1, 10);
	    prst.setString(2,"steak");
	    prst.setString(3,"deliver");
	    prst.setInt(1, 11);
	    prst.setString(2,"sour cream");
	    prst.setString(3,"pending");
	    prst.setInt(1, 12);
	    prst.setString(2,"samosa");
	    prst.setString(3,"deliver");
	    prst.setInt(1, 13);
	    prst.setString(2,"dosa");
	    prst.setString(3,"deliver");
	    prst.setInt(1, 14);
	    prst.setString(2,"papad");
	    prst.setString(3,"pending");
	    prst.setInt(1, 15);
	    prst.setString(2,"khichidi");
	    prst.setString(3,"deliver");
	   
	  
	    
	   int value=prst.executeUpdate();
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
