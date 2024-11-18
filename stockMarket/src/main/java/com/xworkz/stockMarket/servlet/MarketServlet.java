package com.xworkz.stockMarket.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.stockMarket.dto.MarketDTO;
import com.xworkz.stockMarket.service.MarketService;
import com.xworkz.stockMarket.service.MarketServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/register")
public class MarketServlet extends HttpServlet{
	
	
	public MarketServlet()
	{
		System.out.println("running in no arg cons....");
	}
	

           @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	   System.out.println("running in service method");
        	String name=req.getParameter("Name");
        	String email=req.getParameter("Email");
        	String password=req.getParameter("Password");
        	String confirmPassword=req.getParameter("Confirm Password");
        	String phoneNumber=req.getParameter("PhoneNumber");
        	
            long convertedNumber=Long.valueOf(phoneNumber);
        	
        	System.out.println("name:"+name);
        	System.out.println("email:"+email);
        	System.out.println("password:"+password);
        	System.out.println("confirmPassword:"+confirmPassword);
        	System.out.println("phoneNumber:"+convertedNumber);
        	
        	MarketDTO marketDTO=new MarketDTO(name,email,password,confirmPassword,convertedNumber);
        	MarketService marketService=new MarketServiceImpl();
        boolean saved=marketService.validateAndSave(marketDTO);
        if(saved)
        {
        	System.out.println("data valid");
        }else {
        	System.out.println("data invalid");
        }
        	
        	
        }
	

}
