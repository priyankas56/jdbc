package com.xworkz.servlet.repo;

import com.xworkz.servlet.validation.SignUpDTO;

public interface SignUpRepository {
	
	int save(SignUpDTO signUpDTO);

}
