package com.xworkz.kims.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.xworkz.kims.entity.HospitalEntity;

public class HospitalRunner {


	public static void main(String[] args) {
		
		 EntityManagerFactory emf= Persistence.createEntityManagerFactory("xworkz");
		    EntityManager em=emf.createEntityManager();
		   EntityTransaction et=em.getTransaction();
		   
		   List<HospitalEntity> list=new ArrayList<HospitalEntity>();
		   list.add(new HospitalEntity("kempegowda hospital",2435,5000000,"banglore"));
		   list.add(new HospitalEntity("GM hospital",3435,6500000,"banglore"));
		   list.add(new HospitalEntity("sagar hospital",4435,7500000,"mandya"));
		   list.add(new HospitalEntity("sakregowda hospital",5535,2400000,"banglore"));
		   list.add(new HospitalEntity("ESI hospital",8735,4200000,"rajajinagar"));
		   for (HospitalEntity hospitalEntity : list) {
			   em.persist(hospitalEntity);
			
		}
		
		   
		   try {
			   et.begin();
			   
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


