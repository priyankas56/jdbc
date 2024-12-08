package com.xworkz.company.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="employee_table")
@NamedQuery(name="findByName", query="select et from EmployeeEntity et where et.name= :getName")
@NamedQuery(name="findSalaryByName", query="select ie.salary from EmployeeEntity ie where name= :getName")
@NamedQuery(name="findAll", query="select et from EmployeeEntity et")
@NamedQuery(name="findPhnNoById", query="select em.phNumber from EmployeeEntity em where em.id= :getId")
@NamedQuery(name="findHikeByName", query="select em.hike from EmployeeEntity em where em.name= :getName")
@NamedQuery(name="findNameByAge", query="select em.name from EmployeeEntity em where em.phNumber= :getNo")
@NamedQuery(name="findNameAndAgeByNo", query="select em.name, em.age from EmployeeEntity em where em.phNumber= :getNo")


public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private long phNumber;
	private double salary;
	private float hike;
	public EmployeeEntity() {
		
	}
	public EmployeeEntity(String name, int age, long phNumber, double salary, float hike) {
		super();
		this.name = name;
		this.age = age;
		this.phNumber = phNumber;
		this.salary = salary;
		this.hike = hike;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public float getHike() {
		return hike;
	}
	public void setHike(float hike) {
		this.hike = hike;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", age=" + age + ", phNumber=" + phNumber + ", salary="
				+ salary + ", hike=" + hike + "]";
	}
	

}
