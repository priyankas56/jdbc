package com.xworkz.company.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.company.entity.EmployeeEntity;

public class getEmailBySalary {
public static void main(String[] args) {
		
		
		EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager=eMF.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		
					
			Query query=entityManager.createNamedQuery("findSalaryByName");
			query.setParameter("getName", "varsh");
			Object obj=query.getSingleResult();
			Double ref=(Double)obj;
			System.out.println("salary:"+ref);
			
			
			
		
				
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










