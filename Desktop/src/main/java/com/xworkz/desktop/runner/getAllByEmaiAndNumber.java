package com.xworkz.desktop.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.desktop.dto.DesktopEntity;

public class getAllByEmaiAndNumber {
public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		    EntityManager  em=emf.createEntityManager();
		 EntityTransaction et=  em.getTransaction();
		 
		
		 
	Query query= em.createNamedQuery("getAllByEmailAndNumber");
	query.setParameter("getEmail","delluser@gamil.com" );
	query.setParameter("getNumber", 7658345678L);
	List<DesktopEntity> list=query.getResultList();
	for (DesktopEntity ref : list) {
        System.out.println(ref);
       

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







	




