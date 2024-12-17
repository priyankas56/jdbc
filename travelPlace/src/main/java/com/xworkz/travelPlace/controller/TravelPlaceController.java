package com.xworkz.travelPlace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.travelPlace.dto.TravelPlaceDTO;
import com.xworkz.travelPlace.service.TravelPlaceService;
import com.xworkz.travelPlace.service.TravelPlaceServiceImpl;
@Controller
@RequestMapping("/")
public class TravelPlaceController {

	 public TravelPlaceController() {
		 System.out.println("craeting TravelPlaceController");
	 }
	 @GetMapping("/save")
	 private String onPress(TravelPlaceDTO travelPlaceDTO) {
		 
		 System.out.println("travelPlaceDTO:"+travelPlaceDTO.toString());
		 TravelPlaceService travelPlaceService=new TravelPlaceServiceImpl();
		boolean save= travelPlaceService.save(travelPlaceDTO);
		 return "index.jsp";
	 }

	 @PostMapping("/save")
	 private String onSave(TravelPlaceDTO travelPlaceDTO) {
		 
		 System.out.println("travelPlaceDTO:"+travelPlaceDTO.toString());
		 TravelPlaceService travelPlaceService=new TravelPlaceServiceImpl();
		boolean save= travelPlaceService.save(travelPlaceDTO);
		 return "index.jsp";
	 }

}
