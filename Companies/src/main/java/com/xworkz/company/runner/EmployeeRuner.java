package com.xworkz.company.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.company.entity.EmployeeEntity;



public class EmployeeRuner {
	public static void main(String[] args) {
		
		
		EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager=eMF.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		
		List<EmployeeEntity> list=new ArrayList<EmployeeEntity>();
		list.add(new EmployeeEntity("priya",21,7760750873L,550000,3.1f));
		list.add(new EmployeeEntity("varsh",21,8864750873L,560000,3.5f));
		list.add(new EmployeeEntity("sowmya",22,9870750873L,650000,2.1f));
		list.add(new EmployeeEntity("keerthi",22,9960750873L,750000,3.5f));
		list.add(new EmployeeEntity("ganavi",24,8860750873L,870000,4.1f));
		list.add(new EmployeeEntity("navya",24,8560750873L,450000,5.1f));
		for (EmployeeEntity employeeEntity : list) {
			
			entityManager.persist(employeeEntity);
			
			
			
		}
				
		try {
			et.begin();
			et.commit();
			
		}catch(Exception e) {
			if(et.isActive()) {
				   et.rollback();
			   }
			e.printStackTrace();
		}finally {
			entityManager.close();
			eMF.close();
		}
			
		}

	}




