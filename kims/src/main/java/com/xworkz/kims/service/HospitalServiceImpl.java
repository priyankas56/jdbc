package com.xworkz.kims.service;

import java.util.List;

import com.xworkz.kims.entity.HospitalEntity;
import com.xworkz.kims.repo.HospitalRepo;
import com.xworkz.kims.repo.HospitalRepoImpl;

public class HospitalServiceImpl implements HospitaService{

	@Override
	public List<Object[]> getNameAndIncomeById(int id) {
		HospitalRepo HospitalRepo=new HospitalRepoImpl();
		List<Object[]> list=HospitalRepo.getNameAndIncomeById(id);
		return list;
	}

	@Override
	public String getNameByIdAndIncome(int id, double income) {
		HospitalRepo HospitalRepo=new HospitalRepoImpl();
		String string=HospitalRepo.getNameByIdAndIncome(id, income);
		return string;
	}

	@Override
	public List<HospitalEntity> getAll() {
		HospitalRepo HospitalRepo=new HospitalRepoImpl();
		List<HospitalEntity> list1=HospitalRepo.getAll();
		return list1;
	}

}
