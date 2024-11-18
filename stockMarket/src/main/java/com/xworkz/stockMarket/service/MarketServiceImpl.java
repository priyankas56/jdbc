package com.xworkz.stockMarket.service;

import com.xworkz.stockMarket.dto.MarketDTO;
import com.xworkz.stockMarket.repo.MarketRepository;
import com.xworkz.stockMarket.repo.MarketRepositoryImpl;

public class MarketServiceImpl implements MarketService{

	@Override
	public boolean validateAndSave(MarketDTO marketDTO) {
	System.out.println("validateAndSave running in marketServiceImple");
	
	
	MarketRepository marketRepository=new MarketRepositoryImpl();
	boolean saved=marketRepository.save(marketDTO);
		return false;
	}

}
