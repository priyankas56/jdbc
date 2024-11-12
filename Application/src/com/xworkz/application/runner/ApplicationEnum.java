package com.xworkz.application.runner;

public enum ApplicationEnum {
	
	URL("jdbc:mysql://localhost:3306/company"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	 private final String value;
	 
	        private  ApplicationEnum(String value) {
			this.value=value;
		}

			public String getValue() {
				return value;
			}
	        

	}


