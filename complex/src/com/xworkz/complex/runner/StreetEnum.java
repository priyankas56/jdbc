package com.xworkz.complex.runner;

public enum StreetEnum {
	URL("jdbc:mysql://localhost:3306/company"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	 private final String value;
	 
	        private  StreetEnum(String value) {
			this.value=value;
		}

			public String getValue() {
				return value;
			}
	        

	}



