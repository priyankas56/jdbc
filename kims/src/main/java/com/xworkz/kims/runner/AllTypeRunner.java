package com.xworkz.kims.runner;



import java.util.List;

import com.xworkz.kims.entity.HospitalEntity;
import com.xworkz.kims.service.HospitaService;
import com.xworkz.kims.service.HospitalServiceImpl;

public class AllTypeRunner {
	public static void main(String[] args) {
		
		HospitaService HospitaService=new HospitalServiceImpl();
		List<Object[]> list=HospitaService.getNameAndIncomeById(4);
		System.out.println("================");
		String string=HospitaService.getNameByIdAndIncome(1, 5000000);
		System.out.println("name:"+string);
		System.out.println("==================");
		List<HospitalEntity> list1=HospitaService.getAll();
		System.out.println("list:"+list1);
		
		
	}

}
