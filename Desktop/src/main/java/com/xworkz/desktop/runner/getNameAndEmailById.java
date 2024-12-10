package com.xworkz.desktop.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class getNameAndEmailById {
		public static void main(String[] args) {
			
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
			    EntityManager  em=emf.createEntityManager();
			 EntityTransaction et=  em.getTransaction();
			 
			
			 
		Query query= em.createNamedQuery("findNameAndEmailById");
		query.setParameter("getId", 2);

		
		List<Object[]> list=query.getResultList();
		for (Object[] objects : list) {
			System.out.println("name:"+objects[0]);
			System.out.println("email:"+objects[1]);
			
		}
		
			
		  
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






