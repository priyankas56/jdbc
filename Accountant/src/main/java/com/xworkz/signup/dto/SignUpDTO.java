package com.xworkz.signup.dto;

public class SignUpDTO {
  private String userId;
  private String username;
  private String Email;
  private String Password;
  private String confirmPassword;
public SignUpDTO(String userId, String username, String email, String password, String confirmPassword) {
	super();
	this.userId = userId;
	this.username = username;
	Email = email;
	Password = password;
	this.confirmPassword = confirmPassword;
}
@Override
public String toString() {
	return "SignUpDTO [userId=" + userId + ", username=" + username + ", Email=" + Email + ", Password=" + Password
			+ ", confirmPassword=" + confirmPassword + "]";
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Email == null) ? 0 : Email.hashCode());
	result = prime * result + ((Password == null) ? 0 : Password.hashCode());
	result = prime * result + ((confirmPassword == null) ? 0 : confirmPassword.hashCode());
	result = prime * result + ((userId == null) ? 0 : userId.hashCode());
	result = prime * result + ((username == null) ? 0 : username.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	SignUpDTO other = (SignUpDTO) obj;
	if (Email == null) {
		if (other.Email != null)
			return false;
	} else if (!Email.equals(other.Email))
		return false;
	if (Password == null) {
		if (other.Password != null)
			return false;
	} else if (!Password.equals(other.Password))
		return false;
	if (confirmPassword == null) {
		if (other.confirmPassword != null)
			return false;
	} else if (!confirmPassword.equals(other.confirmPassword))
		return false;
	if (userId == null) {
		if (other.userId != null)
			return false;
	} else if (!userId.equals(other.userId))
		return false;
	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	return true;
}
  
  
}
