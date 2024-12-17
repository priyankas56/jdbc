package com.xworkz.servlet.service;

import com.xworkz.servlet.validation.SignUpDTO;

public interface SignUpService {

	boolean validateAndSave(SignUpDTO signUpDTO);
}
