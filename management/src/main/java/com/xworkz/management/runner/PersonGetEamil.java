package com.xworkz.management.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.management.dto.PersonDTO;

public class PersonGetEamil {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		 EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		
		List<String> emails = em
				.createQuery("SELECT gd.email FROM PersonDTO gd WHERE gd.name LIKE 'S%' OR gd.name LIKE 'N%'", String.class)
				.getResultList();
		for (String email : emails) {
			System.out.println("Email: " + email);
		}

		
	
 
		 try {
			 et.begin();
			 et.commit();
		}catch (Exception e) {
		   if(et.isActive()) {
			   et.rollback();
		   }
		   e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}
			
		}

	


}
