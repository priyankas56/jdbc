package com.xworkz.desktop.runner;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.desktop.dto.DesktopEntity;

public class getALLDatatypes {
public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		    EntityManager  em=emf.createEntityManager();
		 EntityTransaction et=  em.getTransaction();
		 
		
		 
	Query query= em.createNamedQuery("getAllDatatypesByNameAndDate");
	query.setParameter("getName", "dell");
	query.setParameter("getDate", LocalDate.of(2024, 12, 24));

	
	List<Object[]> list=query.getResultList();
	for (Object[] objects : list) {
		System.out.println("name:"+objects[0]);
		System.out.println("email:"+objects[1]);
		System.out.println("isActive:"+objects[2]);
		System.out.println("price:"+objects[3]);
		System.out.println("desktopNumber:"+objects[4]);
		System.out.println("shortValue:"+objects[5]);
		System.out.println("byteValue:"+objects[6]);
		System.out.println("charValue:"+objects[7]);
		System.out.println("floatValue:"+objects[8]);
		
		
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







	



	


