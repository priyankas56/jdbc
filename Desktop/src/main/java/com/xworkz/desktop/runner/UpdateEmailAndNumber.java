package com.xworkz.desktop.runner;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class UpdateEmailAndNumber {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		    EntityManager  em=emf.createEntityManager();
		 EntityTransaction et=  em.getTransaction();
		 
		
		
	  
		 try {
			 et.begin();

				Query query= em.createNamedQuery("updateByEmailAndNumber");
				query.setParameter("getEmail", "user@gamil.com");
				query.setParameter("getNumber", 8758345678L);
				int list=query.executeUpdate();
                System.out.println("number of rows updated"+list);
			 
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



