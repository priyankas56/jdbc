package com.xworkz.company.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class getNameAndAge {
public static void main(String[] args) {
		
		
		EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager=eMF.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		
			Query query=entityManager.createNamedQuery("findNameAndAgeByNo");
			query.setParameter("getNo", 7760750873L);
			
			
			List<Object[]> list=query.getResultList();
			for (Object[] objects : list) {
				System.out.println("name:"+objects[0]);
				System.out.println("age:"+objects[1]);
				
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


















