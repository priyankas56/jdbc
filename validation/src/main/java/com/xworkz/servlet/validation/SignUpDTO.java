package com.xworkz.servlet.validation;

public class SignUpDTO {
	
	private String UserName;
	private String Email;
	private String password;
	private String confirmPassword;
	public SignUpDTO(String userName, String email, String password, String confirmPassword) {
		super();
		UserName = userName;
		Email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "SignUpDTO [UserName=" + UserName + ", Email=" + Email + ", password=" + password + ", confirmPassword="
				+ confirmPassword + "]";
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	
	

}
