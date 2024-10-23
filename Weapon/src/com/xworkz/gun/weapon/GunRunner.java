package com.xworkz.gun.weapon;

public class GunRunner {

	public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("this is mysql runner");
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}

	}

}
