package com.xworkz.platform.runner;

import java.sql.SQLException;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.jsp.tagext.TryCatchFinally;

import org.eclipse.jdt.internal.compiler.ast.TryStatement;

import com.xworkz.platform.dto.DaimondEntity;

public class DaimondRunner {
	
	public static void main(String[] args) {
		
		
	EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
	EntityManager entityManager=eMF.createEntityManager();
	EntityTransaction et=entityManager.getTransaction();
	
	
	try {
		et.begin();
		DaimondEntity daimondEntity=new DaimondEntity();
		daimondEntity.setId(1);
		daimondEntity.setName("priyanka");
		daimondEntity.setEmail("priyankagowda@gmail.com");
		daimondEntity.setPhoneNumber(7760750873L);
		daimondEntity.setAdress("banglore");
		daimondEntity.setPassword("priya");
		daimondEntity.setConfirmPassword("priya");
		daimondEntity.setCountry("india");
		daimondEntity.setState("karnataka");
		daimondEntity.setPincode(562126);
		
		DaimondEntity daimondEntity1=new DaimondEntity();
		daimondEntity1.setId(2);
		daimondEntity1.setName("varsha");
		daimondEntity1.setEmail("varshahegde@gmail.com");
		daimondEntity1.setPhoneNumber(8866750873L);
		daimondEntity1.setAdress("kanakapura");
		daimondEntity1.setPassword("varsh");
		daimondEntity1.setConfirmPassword("varsh");
		daimondEntity1.setCountry("india");
		daimondEntity1.setState("karnataka");
		daimondEntity1.setPincode(523126);
		
		DaimondEntity daimondEntity2=new DaimondEntity();
		daimondEntity2.setId(3);
		daimondEntity2.setName("sowmya");
		daimondEntity2.setEmail("sowmyagowda@gmail.com");
		daimondEntity2.setPhoneNumber(9008750873L);
		daimondEntity2.setAdress("ramanagara");
		daimondEntity2.setPassword("sow");
		daimondEntity2.setConfirmPassword("sow");
		daimondEntity2.setCountry("india");
		daimondEntity2.setState("karnataka");
		daimondEntity2.setPincode(572126);
		
		DaimondEntity daimondEntity3=new DaimondEntity();
		daimondEntity3.setId(4);
		daimondEntity3.setName("rakshitha");
		daimondEntity3.setEmail("raksh@gmail.com");
		daimondEntity3.setPhoneNumber(7760750873L);
		daimondEntity3.setAdress("banglore");
		daimondEntity3.setPassword("raksh");
		daimondEntity3.setConfirmPassword("raksh");
		daimondEntity3.setCountry("india");
		daimondEntity3.setState("karnataka");
		daimondEntity3.setPincode(562126);
		
		DaimondEntity daimondEntity4=new DaimondEntity();
		daimondEntity4.setId(5);
		daimondEntity4.setName("ganavi");
		daimondEntity4.setEmail("ganavi@gmail.com");
		daimondEntity4.setPhoneNumber(8856750873L);
		daimondEntity4.setAdress("ramanagara");
		daimondEntity4.setPassword("gan");
		daimondEntity4.setConfirmPassword("gan");
		daimondEntity4.setCountry("india");
		daimondEntity4.setState("karnataka");
		daimondEntity4.setPincode(532126);
		
		entityManager.persist(daimondEntity);
		entityManager.persist(daimondEntity1);
		entityManager.persist(daimondEntity2);
		entityManager.persist(daimondEntity3);
		entityManager.persist(daimondEntity4);
		et.commit();
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		entityManager.close();
		eMF.close();
	}
		
	}

}

