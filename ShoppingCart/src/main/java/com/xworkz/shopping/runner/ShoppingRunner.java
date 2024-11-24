package com.xworkz.shopping.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.shopping.dto.ShoppingEntity;

public class ShoppingRunner {

	public static void main(String[] args) {
		
EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
    EntityManager entityManager=eMF.createEntityManager();
   EntityTransaction et=entityManager.getTransaction();
   
   
   try {
	   
	   et.begin();
	   ShoppingEntity ShoppingEntity=new ShoppingEntity();
	   ShoppingEntity.setId(1);
	   ShoppingEntity.setProductName("laptop");
	   ShoppingEntity.setCardId(1);
	   ShoppingEntity.setProductId(1);
	   ShoppingEntity.setQuantity(2);
	   ShoppingEntity.setPrice(150000);
	   ShoppingEntity.setPaymentStatus("success");
	   ShoppingEntity.setDiscount(2);
	   ShoppingEntity.setPurchased(false);
	   ShoppingEntity.setTax(3);
	   
	   ShoppingEntity ShoppingEntity1=new ShoppingEntity();
	   ShoppingEntity1.setId(2);
	   ShoppingEntity1.setProductName("smartphone");
	   ShoppingEntity1.setCardId(2);
	   ShoppingEntity1.setProductId(2);
	   ShoppingEntity1.setQuantity(3);
	   ShoppingEntity1.setPrice(250000);
	   ShoppingEntity1.setPaymentStatus("success");
	   ShoppingEntity1.setDiscount(2);
	   ShoppingEntity1.setPurchased(true);
	   ShoppingEntity1.setTax(4);
	
	   
	   ShoppingEntity ShoppingEntity2=new ShoppingEntity();
	   ShoppingEntity2.setId(3);
	   ShoppingEntity2.setProductName("watch");
	   ShoppingEntity2.setCardId(3);
	   ShoppingEntity2.setProductId(3);
	   ShoppingEntity2.setQuantity(2);
	   ShoppingEntity2.setPrice(45000);
	   ShoppingEntity2.setPaymentStatus("success");
	   ShoppingEntity2.setDiscount(3);
	   ShoppingEntity2.setPurchased(true);
	   ShoppingEntity2.setTax(3);
	 
	   
	   ShoppingEntity ShoppingEntity3=new ShoppingEntity();
	   ShoppingEntity3.setId(4);
	   ShoppingEntity3.setProductName("suger");
	   ShoppingEntity3.setCardId(1);
	   ShoppingEntity3.setProductId(2);
	   ShoppingEntity3.setQuantity(3);
	   ShoppingEntity3.setPrice(50000);
	   ShoppingEntity3.setPaymentStatus("success");
	   ShoppingEntity3.setDiscount(3);
	   ShoppingEntity3.setPurchased(true);
	   ShoppingEntity3.setTax(2);
	 
	   
	   ShoppingEntity ShoppingEntity4=new ShoppingEntity();
	   ShoppingEntity4.setId(5);
	   ShoppingEntity4.setProductName("bag");
	   ShoppingEntity4.setCardId(1);
	   ShoppingEntity4.setProductId(1);
	   ShoppingEntity4.setQuantity(3);
	   ShoppingEntity4.setPrice(4000);
	   ShoppingEntity4.setPaymentStatus("success");
	   ShoppingEntity4.setDiscount(4);
	   ShoppingEntity4.setPurchased(false);
	   ShoppingEntity4.setTax(3);
	   	   
	   
	   entityManager.persist(ShoppingEntity);
	   entityManager.persist(ShoppingEntity1);
	   entityManager.persist(ShoppingEntity2);
	   entityManager.persist(ShoppingEntity3);
	   entityManager.persist(ShoppingEntity4);
	   et.commit();
	   
   }catch(Exception e) {
	   e.printStackTrace();
   }finally {
	  entityManager.close();
	   eMF.close();
   }
             
	}

}
