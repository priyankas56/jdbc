package com.xworkz.desktop.runner;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CountEmailAndDate {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		    EntityManager  em=emf.createEntityManager();
		 EntityTransaction et=  em.getTransaction();
		 
		
			Query query= em.createNamedQuery("getCountByEmailAndDate");
			query.setParameter("getEmail", "delluser@gamil.com");
			query.setParameter("getDate", LocalDate.of(2024, 3, 23));

			Long count = (Long) query.getSingleResult(); 
		    System.out.println("Number of matching records: " + count);		
			
	
	  
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








