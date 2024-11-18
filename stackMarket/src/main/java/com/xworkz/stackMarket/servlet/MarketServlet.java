package com.xworkz.stackMarket.servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.stackMarket.dto.MarketDTO;
import com.xworkz.stackMarket.service.MarketService;
import com.xworkz.stackMarket.service.MarketServiceImpl;
@WebServlet(loadOnStartup = 1,urlPatterns = "/register")
public class MarketServlet extends HttpServlet{
		
		public MarketServlet() {
			System.out.println("no arg const of FormServlet");
		}
		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name=req.getParameter("name");
			String email=req.getParameter("email");
			String age=req.getParameter("age");
			String contact=req.getParameter("contact");
			
			int convertedAge=Integer.valueOf(age);
			long convertedContact=Long.valueOf(contact);
			
			MarketService marketService=new MarketServiceImpl();
			MarketDTO marketDTO=new MarketDTO(name, email, convertedAge, convertedContact);
			boolean check=marketService.validateAndSave(marketDTO);
			if(check)
			{
				System.out.println("valid Form");
				req.setAttribute("name", marketDTO);
				req.setAttribute("success", "register is saved");
			}
			else
			{
				System.out.println("invalid form");
				req.setAttribute("failure", "register is notsaved");
			}
			
			RequestDispatcher requestDispatcher= req.getRequestDispatcher("./index.jsp");
			requestDispatcher.forward(req, resp);
			
		}
	}


