package com.xworkz.smartwatch.runner;

public enum SmartWatchEnum {
	
	URL("jdbc:mysql://localhost:3306/company"),USERNAME("root"),PASSWORD("Xworkzodc@123");
 private final String value;
 
        private  SmartWatchEnum(String value) {
		this.value=value;
	}

		public String getValue() {
			return value;
		}
        

}
