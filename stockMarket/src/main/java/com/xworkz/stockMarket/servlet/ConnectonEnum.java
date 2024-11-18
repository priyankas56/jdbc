package com.xworkz.stockMarket.servlet;

public enum ConnectonEnum {
	

	URL("jdbc:mysql://localhost:3306/market"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	 private final String value;
	 
	        private  ConnectonEnum(String value) {
			this.value=value;
		}

			public String getValue() {
				return value;
			}
	        

	}





