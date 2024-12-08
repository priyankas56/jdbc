package com.xworkz.company.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class geyPhnNoById {
public static void main(String[] args) {
		
		
		EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager=eMF.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		
			Query query=entityManager.createNamedQuery("findPhnNoById");	
				query.setParameter("getAge", 3);
				Object obj=query.getSingleResult();
				
				Long ref=(Long)obj;
				System.out.println("phnNumber:"+ref);
		
			
			
		
				
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















