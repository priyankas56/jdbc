package com.xworkz.keyBoard.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.keyBoard.dto.KeyBoardEntity;



public class KeyBoardRunner {
	public static void main(String[] args) {
		
		
		EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager=eMF.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		
		
		try {
			et.begin();
			KeyBoardEntity keyBoardEntity=new KeyBoardEntity();
			keyBoardEntity.setId(1);
			keyBoardEntity.setName("samrat");
			keyBoardEntity.setAge(21);
			keyBoardEntity.setEmail("samrat@gmail.com");
			keyBoardEntity.setAddess("banglore");
			keyBoardEntity.setState("karnataka");
			keyBoardEntity.setCountry("india");
			keyBoardEntity.setCompany("infosys");
			keyBoardEntity.setSalary(25000);
			keyBoardEntity.setPhoneNumber(7760750873L);	
			
			
			KeyBoardEntity keyBoardEntity1=new KeyBoardEntity();
			keyBoardEntity1.setId(2);
			keyBoardEntity1.setName("keerthi");
			keyBoardEntity1.setAge(22);
			keyBoardEntity1.setEmail("keerti@gmail.com");
			keyBoardEntity1.setAddess("banglore");
			keyBoardEntity1.setState("karnataka");
			keyBoardEntity1.setCountry("india");
			keyBoardEntity1.setCompany("wipro");
			keyBoardEntity1.setSalary(55000);
			keyBoardEntity.setPhoneNumber(8866750873L);	
			
			KeyBoardEntity keyBoardEntity2=new KeyBoardEntity();
			keyBoardEntity2.setId(3);
			keyBoardEntity2.setName("priyanka");
			keyBoardEntity2.setAge(22);
			keyBoardEntity2.setEmail("priyanka@gmail.com");
			keyBoardEntity2.setAddess("banglore");
			keyBoardEntity2.setState("karnataka");
			keyBoardEntity2.setCountry("india");
			keyBoardEntity2.setCompany("google");
			keyBoardEntity2.setSalary(80500);
			keyBoardEntity.setPhoneNumber(9988770873L);	
		
			
			KeyBoardEntity keyBoardEntity3=new KeyBoardEntity();
			keyBoardEntity3.setId(4);
			keyBoardEntity3.setName("navya");
			keyBoardEntity3.setAge(21);
			keyBoardEntity3.setEmail("navya@gmail.com");
			keyBoardEntity3.setAddess("banglore");
			keyBoardEntity3.setState("karnataka");
			keyBoardEntity3.setCountry("india");
			keyBoardEntity3.setCompany("mnc");
			keyBoardEntity3.setSalary(35000);
			keyBoardEntity.setPhoneNumber(8869878873L);	
		
			KeyBoardEntity keyBoardEntity4=new KeyBoardEntity();
			keyBoardEntity4.setId(5);
			keyBoardEntity4.setName("nayana");
			keyBoardEntity4.setAge(23);
			keyBoardEntity4.setEmail("nayana@gmail.com");
			keyBoardEntity4.setAddess("banglore");
			keyBoardEntity4.setState("karnataka");
			keyBoardEntity4.setCountry("india");
			keyBoardEntity4.setCompany("mnc");
			keyBoardEntity4.setSalary(45000);
			keyBoardEntity.setPhoneNumber(9966750873L);	
		
		
						
			
			entityManager.persist(keyBoardEntity);
			entityManager.persist(keyBoardEntity1);
			entityManager.persist(keyBoardEntity2);
			entityManager.persist(keyBoardEntity3);
			entityManager.persist(keyBoardEntity4);
			
			et.commit();
			
	
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			entityManager.close();
			eMF.close();
		}
			
		}

	}


