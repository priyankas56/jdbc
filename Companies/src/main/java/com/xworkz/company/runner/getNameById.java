package com.xworkz.company.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.company.entity.EmployeeEntity;

public class getNameById {
public static void main(String[] args) {
		
		
		EntityManagerFactory eMF=Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager=eMF.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		
			Query query=entityManager.createNamedQuery("findNameByAge");
			query.setParameter("getNo", 7760750873L);
			Object obj=query.getSingleResult();
			String str=(String)obj;
			System.out.println("name:"+str);
			
			
			
		
			
			
		
				
		try {
			et.begin();
			et.commit();
			
		}catch(Exception e) {
			if(et.isActive()) {
				   et.rollback();
			   }
			e.printStackTrace();
		}finally {
			entityManager.close();
			eMF.close();
		}
			
		}

	}
















