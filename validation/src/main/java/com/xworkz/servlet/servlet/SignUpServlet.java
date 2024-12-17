package com.xworkz.servlet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.service.SignUpImpleService;
import com.xworkz.servlet.service.SignUpService;
import com.xworkz.servlet.validation.SignUpDTO;
@WebServlet(loadOnStartup = 1,urlPatterns = "/signin")
public class SignUpServlet extends HttpServlet{
	
	public SignUpServlet()
	{
	System.out.println("running in signupservlet");
	}
	@Override
	public void init() throws ServletException{
	System.out.println("no-arg const of ConcertTicketServlet");			
super.init();
		}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in collageServlet...");
		String name=req.getParameter("username");
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        String confirmPassword=req.getParameter("confirm password");

		System.out.println("username :" +name);
		System.out.println("Email :" + email);
		System.out.println("Password :" + password);
		System.out.println("confirmPassword :" + confirmPassword);
        
        System.out.println("after getting all parameter");
        
        SignUpDTO signupDTO=new SignUpDTO(name,email,password,confirmPassword);
        SignUpService signUpService=new SignUpImpleService();
         boolean validateDTO=signUpService.validateAndSave(signupDTO);
      
        		if(validateDTO) {
        			System.out.println("signup is valid");
        			req.setAttribute(name, signupDTO);
        			req.setAttribute("success", "register is success");
        		}else {
        			System.out.println("signup is in valid");
        			req.setAttribute("failure", "register is failure");
        		}
        	     RequestDispatcher dispatcher=req.getRequestDispatcher("/signup.jsp");
        	     dispatcher.forward(req, resp);
         }
	}

