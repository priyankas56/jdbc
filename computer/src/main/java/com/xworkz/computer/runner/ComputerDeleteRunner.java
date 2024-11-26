package com.xworkz.computer.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.computer.dto.ComuterDTO;

public class ComputerDeleteRunner {
	
	public static void main(String[] args) {
        
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		try {
			et.begin();
			
			Integer id=5;
			ComuterDTO  comuterDTO=new ComuterDTO();
			ComuterDTO value=em.find(ComuterDTO.class, id);
			em.remove(value);
			
			
			
				
		   et.commit();
		}catch (Exception e) {
			{if (et.isActive()) {
                et.rollback();
            }
		}
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}

	}
}
