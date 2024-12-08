package com.xworkz.product.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.product.Entity.ProductEntity;

public class ProductRunner {
public static void main(String[] args) {
		
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		List<ProductEntity> list=new ArrayList<ProductEntity>();
		list.add(new ProductEntity(20115,  "parachute oil", 213, "HairCare"));
		list.add(new ProductEntity(28012, "Wellcore-Creatine", 600, "Supplements"));
		list.add(new ProductEntity(30012, "Jockey-InnerWear", 400, "Undergarments"));
		list.add(new ProductEntity(40518, "Nothing 2A +", 21999, "Mobiles"));
		list.add(new ProductEntity(10316, "Milton-Flask", 999, "Kitchenware"));
		list.add(new ProductEntity(70518, "CakeTins", 249, "Kitchenware"));
		list.add(new ProductEntity(00510, "Drone E88 Pro", 2640, "Cameras"));
		list.add(new ProductEntity(80745, "HDMI Cable", 499, "Accessories"));
		list.add(new ProductEntity(10505, "Vim liquid", 470, "Kitchenware"));
		list.add(new ProductEntity(19087, "U-shape Neck Pillow", 210, "Home Accessories"));
		list.add(new ProductEntity(10102, "Hamaam Soap", 100, "Bath&Body"));
		list.add(new ProductEntity(34560, "DSLR Camera", 52999, "Electronics"));
		list.add(new ProductEntity(10135, "Fitness Tracker", 1000, "Sports"));
		list.add(new ProductEntity(19084, "Desk Lamp", 699, "Furniture"));
		list.add(new ProductEntity(67686, "Running Shoes", 1499, "Footwear"));
		
for (ProductEntity productEntity : list) {
	
		    eManager.persist(productEntity);
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
