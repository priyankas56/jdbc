package com.xworkz.kims.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="kimshospital_table")
@NamedQuery(name="getNameAndIncomeById", query="SELECT et.name,et.income from HospitalEntity et where id= :getId")
@NamedQuery(name="getNameByIdAndIncome", query="SELECT et.name from HospitalEntity et where et.id= :getId And et.income= :getIncome")
@NamedQuery(name="getAll", query="SELECT et from HospitalEntity et")
public class HospitalEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int patientId;
	private double income;
	private String address;
	public HospitalEntity() {
		
	}
	public HospitalEntity( String name, int patientId, double income, String address) {
		super();
		
		this.name = name;
		this.patientId = patientId;
		this.income = income;
		this.address = address;
	}
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
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
