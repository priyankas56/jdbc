package com.xworkz.speedan.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class EmployeeEntity {
	@Id
	private int id;
	private String name;
	private int agel;
	private String addres;
	private String company;
	private double salary;
	private long phnNumber;
	private String state;
	private String country;
	private int pincode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return agel;
	}
	public void setAge(int agel) {
		this.agel = agel;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPhnNumber() {
		return phnNumber;
	}
	public void setPhnNumber(long phnNumber) {
		this.phnNumber = phnNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
}
