package com.xworkz.stackMarket.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.stackMarket.dto.MarketDTO;
import com.xworkz.stackMarket.servlet.ConnectionJdbc;

public class MarketRepoImpl implements MarketRepo{

	@Override
	public boolean save(MarketDTO marketDTO) {
		System.out.println("running in MarketRepoIm");
	
		Connection connection = null;
		PreparedStatement prep = null;
		boolean isValid=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
                } catch(ClassNotFoundException e) {
				
				e.printStackTrace();
			}

		
		try {
			connection = DriverManager.getConnection(ConnectionJdbc.URL.getValue(), ConnectionJdbc.USERNAME.getValue(),
					ConnectionJdbc.PASSWORD.getValue());
			prep = connection.prepareStatement("INSERT INTO form_table (name, email, age, contact) VALUES (?, ?, ?, ?)");
			prep.setString(1,marketDTO.getName());
			prep.setString(2,marketDTO.getEmail());
			prep.setInt(3,marketDTO.getAge());
			prep.setLong(4,marketDTO.getContact());
			
			int value = prep.executeUpdate();
			if (value > 0) {
				System.out.println("data saved");
				isValid=true;
			} else {
				System.out.println("data not saved");
				isValid=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isValid;
	}
}
		
