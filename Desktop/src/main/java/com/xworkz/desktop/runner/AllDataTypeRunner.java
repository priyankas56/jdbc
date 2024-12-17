package com.xworkz.desktop.runner;


import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.desktop.dto.DesktopEntity;
import com.xworkz.desktop.service.DesktopService;
import com.xworkz.desktop.service.DesktopServiceImpl;

public class AllDataTypeRunner {
	public static void main(String[] args) {
		
		
		DesktopService  DesktopService=new DesktopServiceImpl();
		List<DesktopEntity> list=DesktopService.getAll();
		System.out.println("list:"+list);
		
		System.out.println("===================");
		List<Object[]> list1=DesktopService.findNameAndEmailById(6);
		System.out.println("nameAndemail:"+list1);
		
		System.out.println("=====================");
	    String string=DesktopService.findNameById(5);
	    System.out.println("name:"+string);
	    
	    System.out.println("=====================");
	    List<DesktopEntity> list2=   DesktopService.getAllByEmailAndNumber("delluser@gamil.com", 7658345678L);
	    System.out.println("list2:"+list2);
	    
	    System.out.println("=====================");
	    LocalDateTime date= DesktopService.finddateTimeById(5);
	    System.out.println("DateTime:"+date);
	    
	    System.out.println("=====================");
	    long number= DesktopService.finddesktopNumberById(5);
	    System.out.println("desktopNumber:"+number);
	    
	    System.out.println("=====================");
	    float value=DesktopService.findFloatValueByName("apple");
	    System.out.println("floatValue:"+value);
	    
	}

}
