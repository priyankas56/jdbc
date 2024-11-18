package com.xworkz.signup.repo;

import com.xworkz.signup.dto.SignUpDTO;

public interface SignUpRepository {
	boolean save(SignUpDTO signUpDTO);

}
