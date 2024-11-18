package com.xworkz.stockMarket.service;

import com.xworkz.stockMarket.dto.MarketDTO;

public interface MarketService {
	boolean validateAndSave(MarketDTO marketDTO);

}
