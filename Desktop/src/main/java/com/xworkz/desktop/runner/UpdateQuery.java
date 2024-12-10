package com.xworkz.desktop.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.desktop.dto.DesktopEntity;

public class UpdateQuery {
public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		    EntityManager  em=emf.createEntityManager();
		 EntityTransaction et=  em.getTransaction();
		 
		
			
	  
		 try {
			 et.begin();
			 Query query=em.createNamedQuery("updateByNumberAndActiveOrNot");
				query.setParameter("getNumber", 7760750873L);
				query.setParameter("getActive", false);
				
				query.setParameter("getId", 10);
					
             int updated=query.executeUpdate();
             System.out.println("updated row:"+updated);
             
             System.out.println("======================");
             Query query1=em.createNamedQuery("updateByNameAndEamil");
				query1.setParameter("getName", "HP");
				query1.setParameter("getEmail", "hp@gmail.com");
				
				query1.setParameter("getId", 3);
					
          int updated1=query.executeUpdate();
          System.out.println("updated row:"+updated1);

			 
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







	





