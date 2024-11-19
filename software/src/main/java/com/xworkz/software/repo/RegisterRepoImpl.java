package com.xworkz.software.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.software.dto.RegisterDTO;
import com.xworkz.software.servlet.ConnectionJdbc;

public class RegisterRepoImpl implements RegisterRepo{

	@Override
	public boolean save(RegisterDTO registerDTO) {
	
             boolean ifsaved=false;

		Connection connection=null;
		PreparedStatement prst=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
                } catch(ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		
		
	try {
		connection=DriverManager.getConnection(ConnectionJdbc.URL.getValue(),ConnectionJdbc.USERNAME.getValue(),ConnectionJdbc.PASSWORD.getValue());
		prst=connection.prepareStatement("insert into register_data values(?,?,?,?,?,?)");
		
		
		prst.setString(1, registerDTO.getName());
		prst.setLong(2, registerDTO.getPhoneNumber());
		prst.setString(3, registerDTO.getEmail());
		prst.setInt(4, registerDTO.getAge());
		prst.setString(5, registerDTO.getPassword());
		prst.setString(6, registerDTO.getConfirmPassword());
		
	   int value=prst.executeUpdate();
	   if(value>0)
	   {
		   System.out.println("data connected");
		   ifsaved=true;
	   }else {
		   System.out.println("data not connected");
		   ifsaved=false;
	   }
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

		return ifsaved;
	}

}
