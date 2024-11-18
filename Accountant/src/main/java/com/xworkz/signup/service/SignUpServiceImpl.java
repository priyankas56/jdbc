package com.xworkz.signup.service;

import com.xworkz.signup.dto.SignUpDTO;
import com.xworkz.signup.repo.SignUpRepository;
import com.xworkz.signup.repo.SignUpRepositoryImpl;

public class SignUpServiceImpl implements SignUpService{

	@Override
	public boolean validateAndSave(SignUpDTO signUpDTO) {
		System.out.println("running in signUpServiceImple");
		
		SignUpRepository SignUpRepository=new SignUpRepositoryImpl();
		boolean saved=SignUpRepository.save(signUpDTO);
		if(saved)
		{
		System.out.println("data saved");	
		}else {
			System.out.println("data not saved");
		}
		return false;
	}

}
