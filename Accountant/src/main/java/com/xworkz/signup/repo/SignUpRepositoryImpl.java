package com.xworkz.signup.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.signup.dto.SignUpDTO;
import com.xworkz.signup.servlet.ConnectionEnum;


public class SignUpRepositoryImpl implements SignUpRepository{

	@Override
	public boolean save(SignUpDTO signUpDTO) {
		System.out.println("running in signUpRepositoryImpl");

			Connection connection=null;
			PreparedStatement prst=null;
			boolean ifsaved=false;
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
                } catch(ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			try {
			
			connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
			prst=connection.prepareStatement("insert into person_table values(?,?,?,?,?)");
	         prst.setString(1, signUpDTO.getUsername());
		     prst.setString(2, signUpDTO.getUsername());
		     prst.setString(3, signUpDTO.getEmail());
		     prst.setString(4, signUpDTO.getPassword());
		     prst.setString(5, signUpDTO.getConfirmPassword());
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

		
