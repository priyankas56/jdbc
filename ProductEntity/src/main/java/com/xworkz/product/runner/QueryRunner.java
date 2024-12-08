package com.xworkz.product.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.product.Entity.ProductEntity;

public class QueryRunner {
public static void main(String[] args) {
		
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
	
		
		Query query=eManager.createNamedQuery("findByProdcutId");
		Object obj=query.getSingleResult();
		
		ProductEntity entity=(ProductEntity) obj;
		System.out.println("Value : "+entity.toString());
		System.out.println("--------------");
		
		Query query2=eManager.createNamedQuery("findByProductName");
		Object obj2=query2.getSingleResult();
		
		ProductEntity entity2=(ProductEntity) obj2;
		System.out.println("Value :"+entity2.toString());
		System.out.println("---------------");
		
		Query query3=eManager.createNamedQuery("findById");
		Object obj3=query3.getSingleResult();
		
		ProductEntity entity3=(ProductEntity) obj3;
		System.out.println("Value :"+entity3.toString());
		System.out.println("----------------");
		
		Query query4=eManager.createNamedQuery("findByProductId&ProductName");
		Object obj4= query4.getResultList();
		
		List<ProductEntity> res = query4.getResultList();
		
		for(ProductEntity ecom : res) {
			System.out.println("Values :"+ecom.getProductId() + " , " + ecom.getProductName());
		}
		System.out.println("-----------------");
		
		Query query5=eManager.createNamedQuery("findByProductName&Category");
		Object obj5=query5.getResultList();
		
		List<ProductEntity> res2=query5.getResultList();
		
		for(ProductEntity ecomm : res2) {
			System.out.println("Values :"+ ecomm.getProductName() + " , "+ ecomm.getCategory());
		}
		

		try {
			eTrans.begin();
			eTrans.commit();
			
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
		}finally {
			eManager.close();
			emFactory.close();
		}

}
}



