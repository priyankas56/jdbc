package com.xworkz.computer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="computer_table")
public class ComuterDTO {
	
	
	 @Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	
	@Column(name="computerBrand")
	private String computerBrand;
	
	@Column(name="price")
	private double price;
	
	public ComuterDTO()
	{
		
	}
	
	    public ComuterDTO(String computerBrand, double price) {
	        this.computerBrand = computerBrand;
	        this.price = price;
	    }
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComputerBrand() {
		return computerBrand;
	}
	public void setComputerBrand(String computerBrand) {
		this.computerBrand = computerBrand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
