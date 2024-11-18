package com.xworkz.stockMarket.repo;

import com.xworkz.stockMarket.dto.MarketDTO;

public interface MarketRepository {
	boolean save(MarketDTO marketDTO);

}
