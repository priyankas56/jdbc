package com.xworkz.kims.repo;

import java.util.List;

import com.xworkz.kims.entity.HospitalEntity;

public interface HospitalRepo {
	
	List<Object[]> getNameAndIncomeById(int id);
	String getNameByIdAndIncome(int id,double income);
	List<HospitalEntity> getAll();

}
