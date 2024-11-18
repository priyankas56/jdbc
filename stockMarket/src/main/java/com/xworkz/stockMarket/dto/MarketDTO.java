package com.xworkz.stockMarket.dto;

public class MarketDTO {
	private String Name;
	private String Eamil;
	private String Password;
	private String ConfirmPassword;
	private long phoneNumber;
	public MarketDTO(String name, String eamil, String password, String confirmPassword, long phoneNumber) {
		super();
		Name = name;
		Eamil = eamil;
		Password = password;
		ConfirmPassword = confirmPassword;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "MarketDTO [Name=" + Name + ", Eamil=" + Eamil + ", Password=" + Password + ", ConfirmPassword="
				+ ConfirmPassword + ", phoneNumber=" + phoneNumber + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEamil() {
		return Eamil;
	}
	public void setEamil(String eamil) {
		Eamil = eamil;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ConfirmPassword == null) ? 0 : ConfirmPassword.hashCode());
		result = prime * result + ((Eamil == null) ? 0 : Eamil.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
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
		MarketDTO other = (MarketDTO) obj;
		if (ConfirmPassword == null) {
			if (other.ConfirmPassword != null)
				return false;
		} else if (!ConfirmPassword.equals(other.ConfirmPassword))
			return false;
		if (Eamil == null) {
			if (other.Eamil != null)
				return false;
		} else if (!Eamil.equals(other.Eamil))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		return true;
	}
	
}
