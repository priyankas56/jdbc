package com.xworkz.software.servlet;

public enum ConnectionJdbc {
	URL("jdbc:mysql://localhost:3306/jdbc"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	 private final String value;

	private ConnectionJdbc(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	 
}
	        




