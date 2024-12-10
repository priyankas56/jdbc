package com.xworkz.desktop.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.desktop.dto.DesktopEntity;

public class DeleteQuery {
	
public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		    EntityManager  em=emf.createEntityManager();
		 EntityTransaction et=  em.getTransaction();
		 
		

		
		
	  
		 try {
			 et.begin();
				Query query= em.createNamedQuery("deleteRow");
				query.setParameter("getName", "lenova") ; 
				query.setParameter("getNumber", 7658345678L) ; 
				
				int deleted=query.executeUpdate();
				System.out.println("deleted row:"+deleted);

			 
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







	



	


