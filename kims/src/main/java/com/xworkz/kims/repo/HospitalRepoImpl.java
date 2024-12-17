package com.xworkz.kims.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.kims.entity.HospitalEntity;

public class HospitalRepoImpl implements HospitalRepo{

	@Override
	public List<Object[]> getNameAndIncomeById(int id) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
		    EntityManager em= emf.createEntityManager();
		    EntityTransaction et=em.getTransaction();
		    
		    
		    List<Object[]> list=null;
		        Query query=em.createNamedQuery("getNameAndIncomeById");
		        query.setParameter("getId", id);
		       list=  query.getResultList();
		      for (Object[] objects : list) {
		    	  System.out.println("name:"+objects[0]);
		    	  System.out.println("income:"+objects[1]);
		    	 
			}
		    
		    try {
		    	et.begin();
		    	et.commit();
		    }catch (Exception e) {
		    	if(et.isActive()) {
		    		et.rollback();
		    		e.printStackTrace();
		    	}
				
			}finally {
				emf.close();
				em.close();
			}
		return list;
	}

	@Override
	public String getNameByIdAndIncome(int id, double income) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	    EntityManager em= emf.createEntityManager();
	    EntityTransaction et=em.getTransaction();
	    
	    
	String string=null; 
	Query query=em.createNamedQuery("getNameByIdAndIncome");
	query.setParameter("getId", id);
	query.setParameter("getIncome", income);
	Object obj=query.getSingleResult();
	string=(String)obj;
	
	    
	    try {
	    	et.begin();
	    	et.commit();
	    }catch (Exception e) {
	    	if(et.isActive()) {
	    		et.rollback();
	    		e.printStackTrace();
	    	}
			
		}finally {
			emf.close();
			em.close();
		}

		return string;
	}

	@Override
	public List<HospitalEntity> getAll() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	    EntityManager em= emf.createEntityManager();
	    EntityTransaction et=em.getTransaction();
	    
	    
	    List<HospitalEntity> list1=null;
	Query query=em.createNamedQuery("getAll");
     list1=query.getResultList();
     
	
	    
	    try {
	    	et.begin();
	    	et.commit();
	    }catch (Exception e) {
	    	if(et.isActive()) {
	    		et.rollback();
	    		e.printStackTrace();
	    	}
			
		}finally {
			emf.close();
			em.close();
		}

		return list1;
	}

}
