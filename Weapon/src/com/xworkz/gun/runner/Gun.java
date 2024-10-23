package com.xworkz.gun.runner;

public class Gun {
	static {
		System.out.println("this is static block");
	}
	{
		System.out.println("this is instance block");
	}

}
