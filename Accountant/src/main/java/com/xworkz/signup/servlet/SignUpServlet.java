package com.xworkz.signup.servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.signup.dto.SignUpDTO;
import com.xworkz.signup.service.SignUpService;
import com.xworkz.signup.service.SignUpServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/signUp")


public class SignUpServlet extends HttpServlet{
	

			public SignUpServlet()
			{
				System.out.println("creating no -args const....");
			}
			
			
			protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
			{
				System.out.println("Running service in SignupServlet");
				
				String userId=req.getParameter("userId");
				String username=req.getParameter("username");
				String Email=req.getParameter("email");
				String Password=req.getParameter("password");
				String confirmPassword=req.getParameter("confirmpassword");
				
				System.out.println("userId :" + userId);
				System.out.println("username :" + username);
				System.out.println("Email :" + Email);
				System.out.println("Password :" + Password);
				System.out.println("confirmPassword :" + confirmPassword);
				
				

				SignUpDTO signUpDTO=new SignUpDTO(userId,username, Email, Password, confirmPassword);
				SignUpService service=new SignUpServiceImpl();
				boolean valid=service.validateAndSave(signUpDTO);
				if(valid)
				{
					System.out.println("data valid");
					req.setAttribute("username", signUpDTO);
					req.setAttribute("msg", "msgSaved");
				}else{
					System.out.println("data invalid");
					req.setAttribute("msgs", "msgNotSaved");
				}						
				
					RequestDispatcher dispatcher=req.getRequestDispatcher("/index.jsp");	
                           dispatcher.forward(req, resp);
			}
				


			
		}






