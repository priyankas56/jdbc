package com.xworkz.servlet.service;

import com.xworkz.servlet.repo.SignUpRepository;
import com.xworkz.servlet.repo.SignUpRepositoryImpl;
import com.xworkz.servlet.validation.SignUpDTO;

public class SignUpImpleService implements SignUpService{

	@Override
	public boolean validateAndSave(SignUpDTO signUpDTO) {
		System.out.println("start valaditing signupDTO in a service method");
		boolean valid=true;
		if (signUpDTO!= null) {
			System.out.println("signup dto is not null it ill validate the data");
			String UserName = signUpDTO.getUserName();
			if (UserName != null && !UserName.isEmpty() && UserName.length() >= 4 && UserName.length() <= 30) {
				System.out.println("Name is valid");

			} else {
				System.err.println("Name is in-valid");
				valid=false;
			}
			String email = signUpDTO.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@")
					&& (email.endsWith(".com") || email.endsWith("gmail"))) {
				System.out.println("Email is valid");
			} else {
				System.err.println("Email is in-valid");
				valid=false;
			}
			String password = signUpDTO.getPassword();
			String confirmPassword = signUpDTO.getConfirmPassword();
			if (password != null && !password.isEmpty() && password.length() > 3 && password.length() < 10
					&& confirmPassword.equals(password)) {
				System.out.println("password is valid");
			} else {
				valid = false;

				System.out.println("password is invalid");
			}

		}
              SignUpRepository signUpRepository=new SignUpRepositoryImpl();
          int pk= signUpRepository.save(signUpDTO);
          if(pk>0)
          {
        	  System.out.println("data saved to database");
          }else {
        	  System.out.println("data not saved in database");
          }
		return valid;

	}
	}

