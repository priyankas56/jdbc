package com.xworkz.cable.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cable.dto.ProductDTO;
import com.xworkz.cable.dto.SportDtO;

public class ProductDeleteRunner {
	
	public static void main(String[] args) {
		
		 EntityManagerFactory emf= Persistence.createEntityManagerFactory("xworkz");
		    EntityManager em=emf.createEntityManager();
		   EntityTransaction et=em.getTransaction();
		
		   
		   try {
			   et.begin();
			   Integer id=7;
			   
			   ProductDTO dto=em.find(ProductDTO.class, id);
			   
			   System.out.print("dto=="+dto.getProductName());
			   
			   System.out.println("====================");
			   
			   Integer id1=1;
			   
			   SportDtO sportDTO=em.find(SportDtO.class, id1);
			   
			   System.out.print("dto=="+sportDTO.getEquipment_needed());
			   
			   
			   System.out.println("====================");
			   
			   Integer id2=2;
			   
	            SportDtO sportDTO1=em.find(SportDtO.class, id2);
			   
			   System.out.print("dto=="+sportDTO1.getSport_name());
			    
			   
			   et.commit();
			   
			   
			   
		   }catch (Exception e) {
			   if(et.isActive()) {
				   et.rollback();
			   }
		e.printStackTrace();
		}finally {
			
			emf.close();
			em.close();
		}
	}

}
