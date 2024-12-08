package com.xworkz.company.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class getHikeByName {
public static void main(String[] args) {
		
		
		EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager=eMF.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		
			Query query=entityManager.createNamedQuery("findHikeByName");
			query.setParameter("getName", "priya");
			Object obj=query.getSingleResult();
			Float res=(Float)obj;
			System.out.println("hike:"+res);
			
				
			
			
		
				
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


















