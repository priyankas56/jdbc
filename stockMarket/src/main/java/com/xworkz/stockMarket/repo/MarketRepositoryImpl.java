package com.xworkz.stockMarket.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.stockMarket.dto.MarketDTO;
import com.xworkz.stockMarket.servlet.ConnectonEnum;

public class MarketRepositoryImpl implements MarketRepository{

	@Override
	public boolean save(MarketDTO marketDTO) {
		System.out.println("running in MarketRepositoryImpl");

		Connection connection=null;
		PreparedStatement prst=null;
		boolean ifsaved=false;
		
		
		try {
		connection=DriverManager.getConnection(ConnectonEnum.URL.getValue(),ConnectonEnum.USERNAME.getValue(),ConnectonEnum.PASSWORD.getValue());
		prst=connection.prepareStatement("insert into market_table values(?,?,?,?,?)");
	     prst.setString(1, marketDTO.getName());
	     prst.setString(1, marketDTO.getEamil());
	     prst.setString(1, marketDTO.getPassword());
	     prst.setString(1, marketDTO.getConfirmPassword());
	     prst.setLong(1, marketDTO.getPhoneNumber());
		int value=prst.executeUpdate();
		if(value>0)
		{
			System.out.println("this is saved");
			ifsaved=true;
		}else {
			System.out.println("this is not saved");
			ifsaved=false;
		}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return ifsaved;
	}

}
