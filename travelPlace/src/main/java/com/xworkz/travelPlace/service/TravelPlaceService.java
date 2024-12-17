package com.xworkz.travelPlace.service;

import org.springframework.stereotype.Service;

import com.xworkz.travelPlace.dto.TravelPlaceDTO;
@Service
public interface TravelPlaceService {
	
	boolean save(TravelPlaceDTO travelPlaceDTO);

}
