package com.xworkz.desktop.runner;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CountNumber {
public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		    EntityManager  em=emf.createEntityManager();
		 EntityTransaction et=  em.getTransaction();
		 
		
			Query query= em.createNamedQuery("getCountByWhereNumber576856475");
			query.setParameter("getNumber", 7658345678L);
			

			Long count = (Long) query.getSingleResult(); 
		    System.out.println("Number of matching records: " + count);		
			
	System.out.println("==================");

	Query query1= em.createNamedQuery("getCountByWhereId");
	
	Long count1 = (Long) query1.getSingleResult(); 
    System.out.println("Number of matching records: " + count1);		
	
	  
		 try {
			 et.begin();
			
			 
			 et.commit();
		 }catch (Exception e) {
			if(et.isActive()) {
				et.rollback();
			}
		}finally {
			em.close();
			emf.close();

		}
			
		}

	}











