package com.xworkz.stackMarket.service;

import com.xworkz.stackMarket.dto.MarketDTO;
import com.xworkz.stackMarket.repo.MarketRepo;
import com.xworkz.stackMarket.repo.MarketRepoImpl;

public class MarketServiceImpl implements MarketService{

	@Override
	public boolean validateAndSave(MarketDTO marketDTO) {
		
		MarketRepo marketRepo=new MarketRepoImpl();
		System.out.println("running in MarketServiceImpl");
		boolean saved=marketRepo.save(marketDTO);
		if(saved)
		{
			System.out.println("data saved");
		}else {
			System.out.println("data not saveds");
		}
		boolean valid=true;
		if(marketDTO!=null) {
			
			String name=marketDTO.getName();
			if(name!=null && name.length()>3)
			{
				System.out.println("Valid name");
			}
			else
			{
				System.err.println("InValid name");	
				valid=false;
			}
			
			String email=marketDTO.getEmail();
			if(email!=null && email.endsWith(".com") && email.contains("@"))
			{
				System.out.println("valid email");
			}
			else
			{
				System.out.println("Invalid email");
				valid=false;
			}
			
			int age=marketDTO.getAge();
			if(age>18)
			{
				System.out.println("valid age");
			}
			else
			{
				System.out.println("invalid age");
				valid=false;
			}
			
			long contact=marketDTO.getContact();
			if(contact>9)
			{
				System.out.println("valid contact number");
			}
			else
			{
				System.out.println("invalid contact number");
				valid=false;
			}
		}
		
		return valid;
	}
}
	