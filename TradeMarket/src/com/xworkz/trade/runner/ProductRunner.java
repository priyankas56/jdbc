package com.xworkz.trade.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.trade.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
	
		ProductDTO productDTO=new ProductDTO(1,"wireless mouse","123456789012",2000,"electronic",2,"black", 10,"Ergonomic wireless mouse",7);
		ProductDTO productDTO1=new ProductDTO(2,"gaming keypad","123456745612",4500,"electronic",3,"black", 32,"Ergonomic wireless mouse",8);
		ProductDTO productDTO2=new ProductDTO(3,"laptop","123876789012",65000,"Accessories",2,"silver", 2,"High performance laptop",9);
		ProductDTO productDTO3=new ProductDTO(4,"Wireless Earbuds","123556789012",4000,"Accessories",1,"white", 21,"Noise-cancelling earbud",5);
		ProductDTO productDTO4=new ProductDTO(5,"blutooth speaker","187756789012",1500,"audio",2,"black", 22,"Portable Bluetooth speaker",3);
		ProductDTO productDTO5=new ProductDTO(6,"fitness tracker","187456789012",32000,"Wearables",1,"black", 32,"Waterproof fitness tracker",9);
		ProductDTO productDTO6=new ProductDTO(7,"electric drill","103456789012",35000,"tools",3,"black", 33,"Cordless electric drill",4);
		ProductDTO productDTO7=new ProductDTO(8,"microwave oven","193456789012",7000,"heatWave",1,"black", 34,"700W microwave oven",6);
		ProductDTO productDTO8=new ProductDTO(9,"Electric Fan","153986789012",3000,"breezCool",2,"purple", 40,"16-inch pedestal fan",9);
		ProductDTO productDTO9=new ProductDTO(10,"refrijator","133986789012",4000,"breezcool",2,"silver", 40,"16-inch refrizator",2);
		ProductDTO[] dtos= {productDTO,productDTO1,productDTO2,productDTO3,productDTO4,productDTO5,productDTO6,productDTO7,productDTO8,productDTO9};
		
		Connection connection=null;
		PreparedStatement prst=null;
		
		try {
		connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(),ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
		prst=connection.prepareStatement("insert into product_table values(?,?,?,?,?,?,?,?,?,?)");
             for(ProductDTO dto:dtos)
		{
		prst.setInt(1, dto.getProductId());
		prst.setString(2,dto.getProductName());
		prst.setString(3,dto.getBarcode());
		prst.setInt(4, dto.getCost());	
		prst.setString(5, dto.getMaterial());
		prst.setInt(6, dto.getQuantity());
		prst.setString(7, dto.getColor());
		prst.setInt(8, dto.getWeight());
		prst.setString(9, dto.getDescription());
		prst.setInt(10, dto.getTaxRate());
		prst.addBatch();
		}
		int[] count=prst.executeBatch();
		for(int value:count)
		{
	
		 if(value>0)
		 {
			 System.out.println("this is saved");
		 }else {
			 System.out.println("this is not saved");
		 }
		}
		}
		 catch (SQLException e) {
		
			e.printStackTrace();
		}
	
		
	}
}

