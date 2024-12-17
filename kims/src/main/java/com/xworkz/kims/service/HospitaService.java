package com.xworkz.kims.service;

import java.util.List;

import com.xworkz.kims.entity.HospitalEntity;

public interface HospitaService {
	
	List<Object[]> getNameAndIncomeById(int id);
	String getNameByIdAndIncome(int id,double income);
	List<HospitalEntity> getAll();

}
