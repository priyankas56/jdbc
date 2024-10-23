package com.xworkz.run.runner;

public class TempleRunner {

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
