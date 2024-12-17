package com.xworkz.travelPlace.service;

import org.springframework.stereotype.Service;

import com.xworkz.travelPlace.dto.TravelPlaceDTO;
import com.xworkz.travelPlace.entity.TravelPlaceEntity;
import com.xworkz.travelPlace.repo.TravelPlaceRepo;
import com.xworkz.travelPlace.repo.TravelPlaceRepoImpl;
@Service
public class TravelPlaceServiceImpl implements  TravelPlaceService{

	@Override
	public boolean save(TravelPlaceDTO travelPlaceDTO) {
		System.out.println("running in TravelPlaceServiceImpl");
		System.out.println("travelPlaceDTO:"+travelPlaceDTO.toString());
		
		TravelPlaceEntity travelPlaceEntity=new TravelPlaceEntity();
		travelPlaceEntity.setPlaceName(travelPlaceDTO.getPlaceName());
		travelPlaceEntity.setTravelPrice(travelPlaceDTO.getTravelPrice());
		
		TravelPlaceRepo travelPlaceRepo=new TravelPlaceRepoImpl();
		boolean save=travelPlaceRepo.save(travelPlaceEntity);
		
		System.out.println("entity:"+travelPlaceEntity.toString());
		
		
		return false;
	}

}
