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
		boolean valid=true;
		String name=signUpDTO.getUsername();
		if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<40)
		{
			System.out.println("name valid");
		}else {
			System.out.println("name is invalid");
		}
		
		String userId=signUpDTO.getUserId();
		if(userId!=null && !userId.isEmpty() && userId.length()>4 && userId.length()<40)
		{
			System.out.println("userId valid");
		}else {
			System.out.println("userId invalid");
			valid=false;
		}

		String email=signUpDTO.getEmail();
		if(email!=null && email.endsWith(".com") && email.contains("@"))
		{
			System.out.println("valid email");
		}
		else
		{
			System.out.println("Invalid email");
			valid=false;
		}
		
		String password=signUpDTO.getPassword();
		if(password!=null && password.length()>5)
		{
		System.out.println("password valid");	
		}else {
			System.out.println("password invalid");
			valid=false;
		}
		
		String confirmPassword=signUpDTO.getConfirmPassword();
		if(confirmPassword!=null && confirmPassword.length()>5)
		{
		System.out.println("confirmPassword valid");	
		}else {
			System.out.println("confirmPassword invalid");
			valid=false;
		}
		
		
		
		return valid;
	}

}
