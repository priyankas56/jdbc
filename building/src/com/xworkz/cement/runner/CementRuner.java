package com.xworkz.cement.runner;

public class CementRuner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("this is mysql runner");
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
