package com.xworkz.software.service;




import com.xworkz.software.dto.RegisterDTO;
import com.xworkz.software.repo.RegisterRepo;
import com.xworkz.software.repo.RegisterRepoImpl;


public class RegisterServiceImpl implements RegisterService{

	
	@Override
	public boolean validateAndSave(RegisterDTO registerDTO) {
		RegisterRepo registerRepo=new RegisterRepoImpl();
		boolean saved=registerRepo.save(registerDTO);
	if(saved)
	{
		System.out.println("data saved");
	}else {
		System.out.println("data not saved");
	}
	
	boolean valid=true;
	String name=registerDTO.getName();
	if(name!=null && name.length()>6 && name.length()<14)
	{
		System.out.println("name valid");
	}else {
		System.out.println("invalid name");
		valid=false;
	}
	
	long phonenumber=registerDTO.getPhoneNumber();

      if(phonenumber>9)
      {
    	  System.out.println("valid phonenumber");
      }else {
    	  System.out.println("invalid phonenumber");
    	  valid=false;
      }
      
      String email=registerDTO.getEmail();
	if(email == null && (email.contains("@") && email.endsWith(".com") && email.indexOf('@') == 8))
  	{
  		System.out.println("valid email");
  	}else {
  		System.out.println("invalid email");
  		valid=false;
  	}
  	
  	int age=registerDTO.getAge();
    if(age>5)
    {
  	  System.out.println("valid age");
    }else if(age<5){
  	  System.out.println("invalid age");
  	  valid=false;
    }
   
    	
	
    
				return valid;
	}

}
