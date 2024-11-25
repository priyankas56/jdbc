package com.xworkz.speedan.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.speedan.dto.EmployeeEntity;

public class EmployeeRunner {
	
	public static void main(String[] args) {
		
	EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
     EntityManager  entityManager=eMF.createEntityManager();
   EntityTransaction et= entityManager.getTransaction();
   
   
   try {
	   et.begin();
	   EmployeeEntity employeeEntity=new EmployeeEntity();
	   employeeEntity.setId(1);
	   employeeEntity.setName("priyanka");
	   employeeEntity.setAge(21);
	   employeeEntity.setAddres("banglore");
	   employeeEntity.setCompany("infosys");
	   employeeEntity.setSalary(50000);
	   employeeEntity.setPhnNumber(7760750873L);
	   employeeEntity.setState("karnataka");
	   employeeEntity.setCountry("india");
	   employeeEntity.setPincode(562126);
	   
	   EmployeeEntity employeeEntity4=new EmployeeEntity();
	   employeeEntity4.setId(4);
	   employeeEntity4.setName("prerana");
	   employeeEntity4.setAge(22);
	   employeeEntity4.setAddres("belgavi");
	   employeeEntity4.setCompany("google");
	   employeeEntity4.setSalary(500000);
	   employeeEntity4.setPhnNumber(8860750873L);
	   employeeEntity4.setState("karnataka");
	   employeeEntity4.setCountry("india");
	   employeeEntity4.setPincode(572126);
	   
	   EmployeeEntity employeeEntity1=new EmployeeEntity();
	   employeeEntity1.setId(2);
	   employeeEntity1.setName("nayana");
	   employeeEntity1.setAge(22);
	   employeeEntity1.setAddres("banglore");
	   employeeEntity1.setCompany("infosys");
	   employeeEntity1.setSalary(10000);
	   employeeEntity1.setPhnNumber(8877750873L);
	   employeeEntity1.setState("karnataka");
	   employeeEntity1.setCountry("india");
	   employeeEntity1.setPincode(562126);
	   
	   EmployeeEntity employeeEntity2=new EmployeeEntity();
	   employeeEntity2.setId(3);
	   employeeEntity2.setName("jai");
	   employeeEntity2.setAge(22);
	   employeeEntity2.setAddres("banglore");
	   employeeEntity2.setCompany("mnc");
	   employeeEntity2.setSalary(70000);
	   employeeEntity2.setPhnNumber(6677750873L);
	   employeeEntity2.setState("karnataka");
	   employeeEntity2.setCountry("india");
	   employeeEntity2.setPincode(562126);
	   
	   EmployeeEntity employeeEntity3=new EmployeeEntity();
	   employeeEntity3.setId(5);
	   employeeEntity3.setName("pri");
	   employeeEntity3.setAge(21);
	   employeeEntity3.setAddres("banglore");
	   employeeEntity3.setCompany("infosys");
	   employeeEntity3.setSalary(80000);
	   employeeEntity3.setPhnNumber(9860750873L);
	   employeeEntity3.setState("karnataka");
	   employeeEntity3.setCountry("india");
	   employeeEntity3.setPincode(562126);
	   
	   entityManager.persist(employeeEntity);
	   entityManager.persist(employeeEntity1);
	   entityManager.persist(employeeEntity2);
	   entityManager.persist(employeeEntity3);
	   entityManager.persist(employeeEntity4);
	   et.commit();
	   
	   
   }finally {
	   eMF.close();
	   entityManager.close();
   }
	}

}
