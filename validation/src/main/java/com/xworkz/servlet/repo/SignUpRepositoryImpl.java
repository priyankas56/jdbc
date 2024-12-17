package com.xworkz.servlet.repo;

import com.xworkz.servlet.validation.SignUpDTO;

public class SignUpRepositoryImpl implements SignUpRepository{

	@Override
	public int save(SignUpDTO signUpDTO) {
	System.out.println("running in SignUpRepository");
		return 1;
	}

}
