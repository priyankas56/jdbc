package com.xworkz.speedan.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.speedan.dto.SpeakerEntity;

public class SpeakerRunner {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager=eMF.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		
		
		try {
			et.begin();
			SpeakerEntity speakerEntity=new SpeakerEntity();
			speakerEntity.setId(1);
			speakerEntity.setName("computer");
			speakerEntity.setBrand("hp");
			speakerEntity.setCost(60000);
			speakerEntity.setCompany("hp company");
			speakerEntity.setProfit(12000);
			speakerEntity.setDiscount(20);
			speakerEntity.setDecription("computer are good");
			speakerEntity.setTax(2);
			speakerEntity.setQuality("good");
			
			SpeakerEntity speakerEntity1=new SpeakerEntity();
			speakerEntity1.setId(2);
			speakerEntity1.setName("samrtPhone");
			speakerEntity1.setBrand("iphone");
			speakerEntity1.setCost(60000);
			speakerEntity1.setCompany("iphone company");
			speakerEntity1.setProfit(13000);
			speakerEntity1.setDiscount(22);
			speakerEntity1.setDecription("smartphones");
			speakerEntity1.setTax(3);
			speakerEntity1.setQuality("good");
			
			SpeakerEntity speakerEntity2=new SpeakerEntity();
			speakerEntity2.setId(3);
			speakerEntity2.setName("dove");
			speakerEntity2.setBrand("shapoo");
			speakerEntity2.setCost(3000);
			speakerEntity2.setCompany("wipro");
			speakerEntity2.setProfit(5000);
			speakerEntity2.setDiscount(20);
			speakerEntity2.setDecription("shapoo advertisement");
			speakerEntity2.setTax(4);
			speakerEntity2.setQuality("good");
			
			
			SpeakerEntity speakerEntity3=new SpeakerEntity();
			speakerEntity3.setId(4);
			speakerEntity3.setName("fan");
			speakerEntity3.setBrand("bajaj");
			speakerEntity3.setCost(5000);
			speakerEntity3.setCompany("galaxy");
			speakerEntity3.setProfit(86000);
			speakerEntity3.setDiscount(21);
			speakerEntity3.setDecription("smart fans");
			speakerEntity3.setTax(3);
			speakerEntity3.setQuality("good");
			
			
			SpeakerEntity speakerEntity4=new SpeakerEntity();
			speakerEntity4.setId(5);
			speakerEntity4.setName("laptop");
			speakerEntity4.setBrand("dell");
			speakerEntity4.setCost(60000);
			speakerEntity4.setCompany("dell company");
			speakerEntity4.setProfit(50000);
			speakerEntity4.setDiscount(24);
			speakerEntity4.setDecription("excelent laptops");
			speakerEntity4.setTax(2);
			speakerEntity4.setQuality("good");
			
			
			entityManager.persist(speakerEntity);
			entityManager.persist(speakerEntity1);
			entityManager.persist(speakerEntity2);
			entityManager.persist(speakerEntity3);
			entityManager.persist(speakerEntity4);
			System.out.println("speaker data successfully run");
			et.commit();

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			eMF.close();
			entityManager.close();
	                         
		
		}
		
	}

}
