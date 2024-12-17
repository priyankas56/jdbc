package com.xworkz.travelPlace.repo;

import org.springframework.stereotype.Service;

import com.xworkz.travelPlace.dto.TravelPlaceDTO;
import com.xworkz.travelPlace.entity.TravelPlaceEntity;
@Service
public interface TravelPlaceRepo {
	
	boolean save(TravelPlaceEntity travelPlaceEntity);

}
