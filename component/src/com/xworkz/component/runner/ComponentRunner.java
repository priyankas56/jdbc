package com.xworkz.component.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComponentRunner {

	public static void main(String[] args) {
	
		
		Connection connection=null;
		PreparedStatement prst=null;
		

		try {
			connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
			prst=connection.prepareStatement("insert into alcohol_table values(?,?,?)");
			 prst.setInt(1, 1);
				prst.setString(2, "black n white");
				prst.setString(3, "600");
				prst.setInt(1, 2);
			    prst.setString(2, "old monk");
			    prst.setString(3, "1000");
			    prst.setInt(1, 3);
			    prst.setString(2, "vodka");
			    prst.setString(3, "300");
			    prst.setInt(1, 4);
			    prst.setString(2, "wine");
			    prst.setString(3, "5000");
			    prst.setInt(1, 5);
			    prst.setString(2, "kingfisher");
			    prst.setString(3, "1000");
			    prst.setInt(1, 6);
			    prst.setString(2,"gin" );
			    prst.setString(3,"500" );
			    prst.setInt(1, 7);
			    prst.setString(2,"gin" );
			    prst.setString(3,"500" );
			    prst.setInt(1, 8);
			    prst.setString(2,"rum" );
			    prst.setString(3,"1500" );
			    prst.setInt(1, 9);
			    prst.setString(2,"brandy" );
			    prst.setString(3,"500" );
			    prst.setInt(1, 10);
			    prst.setString(2,"tenquila" );
			    prst.setString(3,"700" );
			    prst.setInt(1, 11);
			    prst.setString(2,"blenders pride" );
			    prst.setString(3,"1000" );
			    prst.setInt(1, 12);
			    prst.setString(2,"bira beer" );
			    prst.setString(3,"8000" );
			    prst.setInt(1, 13);
			    prst.setString(2,"bira beer" );
			    prst.setString(3,"900" );
			    prst.setInt(1, 14);
			    prst.setString(2,"officers choice" );
			    prst.setString(3,"5000" );
			    prst.setInt(1, 15);
			    prst.setString(2,"royal challengers" );
			    prst.setString(3,"1000" );
			
			   
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
