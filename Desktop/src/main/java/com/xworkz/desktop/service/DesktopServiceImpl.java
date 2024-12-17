package com.xworkz.desktop.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.desktop.dto.DesktopEntity;
import com.xworkz.desktop.repo.DesktopRepo;
import com.xworkz.desktop.repo.DestopRepoImpl;

public class DesktopServiceImpl implements DesktopService{

	@Override
	public List<DesktopEntity> getAll() {
		
		DesktopRepo DesktopRepo=new DestopRepoImpl();
		
		List<DesktopEntity> list=DesktopRepo.getAll();
		
		return list;
	}

	@Override
	public List<Object[]> findNameAndEmailById(int id) {
		DesktopRepo DesktopRepo=new DestopRepoImpl();
		List<Object[]> list1=DesktopRepo.findNameAndEmailById(id);
		return list1;
	}

	@Override
	public String findNameById(int id) {
		DesktopRepo DesktopRepo=new DestopRepoImpl();
		String string=DesktopRepo.findNameById(id);
				return string;
	}

	@Override
	public List<DesktopEntity> getAllByEmailAndNumber(String email, long desktopNumber) {
		DesktopRepo DesktopRepo=new DestopRepoImpl();
		List<DesktopEntity> list2=DesktopRepo.getAllByEmailAndNumber(email, desktopNumber);
		return list2;
	}

	@Override
	public LocalDateTime finddateTimeById(int id) {
		DesktopRepo DesktopRepo=new DestopRepoImpl();
	LocalDateTime str=DesktopRepo.finddateTimeById(id);
		return str;
	}

	@Override
	public long finddesktopNumberById(int id) {
		DesktopRepo DesktopRepo=new DestopRepoImpl();
		long number=DesktopRepo.finddesktopNumberById(id);
		return number;
	}

	@Override
	public float findFloatValueByName(String name) {
		DesktopRepo DesktopRepo=new DestopRepoImpl();
		float value=DesktopRepo.findFloatValueByName(name);
		return value;
	}

}
