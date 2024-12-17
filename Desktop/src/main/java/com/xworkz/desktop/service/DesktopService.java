package com.xworkz.desktop.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.desktop.dto.DesktopEntity;

public interface DesktopService {
	List<DesktopEntity> getAll();
	List<Object[]> findNameAndEmailById(int id);
	String findNameById(int id);
	List<DesktopEntity> getAllByEmailAndNumber(String email,long desktopNumber);
	LocalDateTime finddateTimeById(int id);
	long finddesktopNumberById(int id);
	float findFloatValueByName(String name);

}