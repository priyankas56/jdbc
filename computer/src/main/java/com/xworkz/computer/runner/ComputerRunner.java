package com.xworkz.computer.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.computer.dto.ComuterDTO;

public class ComputerRunner {

	public static void main(String[] args) {
		         
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	try {
		et.begin();
		
		ComuterDTO comuterDTO=new ComuterDTO("dell",5000000);
		ComuterDTO comuterDTO1=new ComuterDTO("HP",60000);
		ComuterDTO comuterDTO2=new ComuterDTO("lenovo",55000);
		ComuterDTO comuterDTO3=new ComuterDTO("acer",75000);
		ComuterDTO comuterDTO4=new ComuterDTO("apple",100000);
		ComuterDTO comuterDTO5=new ComuterDTO("sumsung",57000);
		ComuterDTO comuterDTO6=new ComuterDTO("MSI",60000);
		ComuterDTO comuterDTO7=new ComuterDTO("razor",80000);
		ComuterDTO comuterDTO8=new ComuterDTO("asus",85000);
		ComuterDTO comuterDTO9=new ComuterDTO("microsoft",50000);
		
		em.persist(comuterDTO);
		em.persist(comuterDTO1);
		em.persist(comuterDTO2);
		em.persist(comuterDTO3);
		em.persist(comuterDTO4);
		em.persist(comuterDTO5);
		em.persist(comuterDTO6);
		em.persist(comuterDTO7);
		em.persist(comuterDTO8);
		em.persist(comuterDTO9);
		et.commit();
		
		
	}catch (Exception e) {
		  if (et.isActive()) {
              et.rollback();
	}
		  e.printStackTrace();
	}finally {
		em.close();
		emf.close();
	}
	
	}

}
