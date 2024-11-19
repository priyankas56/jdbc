package com.xworkz.software.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.software.dto.RegisterDTO;
import com.xworkz.software.service.RegisterService;
import com.xworkz.software.service.RegisterServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/register")
public class RegisterServlet extends HttpServlet{
	
	
	public RegisterServlet()
	{
		System.out.println("running in no args constuctor..");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String phoneNumber=req.getParameter("phoneNumber");
		String email=req.getParameter("email");
		String age=req.getParameter("age");
		String password=req.getParameter("password");
		String confirmPassword=req.getParameter("confirmPassword");
		
		long covertedNumber=Long.valueOf(phoneNumber);
		int convertedAge=Integer.valueOf(age);
		
		RegisterDTO registerDTO=new RegisterDTO(name,covertedNumber,email,convertedAge,password,confirmPassword);
		RegisterService registerService=new RegisterServiceImpl();
	boolean saved=registerService.validateAndSave(registerDTO);
	
	if(saved)
	{
		System.out.println("data valid");
		req.setAttribute("name", registerService);
		req.setAttribute("msg", "register is success");
		
	}else
	{
		System.out.println("data invalid");
		req.setAttribute("msgs", "register is failure");
		
	}
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("/index.jsp");
	dispatcher.forward(req, resp);
		super.doPost(req, resp);
	}
}
