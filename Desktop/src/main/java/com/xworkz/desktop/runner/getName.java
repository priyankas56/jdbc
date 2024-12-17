package com.xworkz.desktop.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class getName {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		    EntityManager  em=emf.createEntityManager();
		 EntityTransaction et=  em.getTransaction();
		 
		
		 
	Query query= em.createNamedQuery("findNameById");
	query.setParameter("getId", 2);

	Object obj=query.getSingleResult();
	String string=(String)obj;
	System.out.println("name:"+string);
	
	  
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









