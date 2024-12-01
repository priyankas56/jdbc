package com.xworkz.management.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetUsernameAndEmail {
public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		 EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		
	

		 try {
			 et.begin();
						em.createQuery("update PersonDTO mk set mk.name=:newName, mk.email=:newEmail where mk.phoneNumber='7760750873'")
						.setParameter("newName", "sush").setParameter("newEmail", "sush@gmail.com")
						.executeUpdate();
					
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



