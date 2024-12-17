package com.xworkz.desktop.repo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.desktop.dto.DesktopEntity;

public class DestopRepoImpl implements DesktopRepo{

	@Override
	public List<DesktopEntity> getAll() {
		
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	    EntityManager em= emf.createEntityManager();
	     EntityTransaction et=  em.getTransaction();
	     
	     List<DesktopEntity> list=null;
	     Query query=em.createNamedQuery("getAll");
	        list= query.getResultList();
	  for (DesktopEntity desktopEntity : list) {
		  System.out.println("desktopEntity:"+desktopEntity);
		
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
	public List<Object[]> findNameAndEmailById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	    EntityManager em= emf.createEntityManager();
	     EntityTransaction et=  em.getTransaction();
	     
	     List<Object[]> list1=null;
	     Query query=em.createNamedQuery("findNameAndEmailById");
	        query.setParameter("getId", id);	
	    list1= query.getResultList();
	   for (Object[] objects : list1) {
		   System.out.println("name:"+objects[0]);
		   System.out.println("email:"+objects[1]);
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
		
	

	
		return list1;
	}

	@Override
	public String findNameById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	    EntityManager  em=emf.createEntityManager();
	 EntityTransaction et=  em.getTransaction();
	 
	
	 String string=null;
       Query query= em.createNamedQuery("findNameById");
        query.setParameter("getId", id);

          Object obj=query.getSingleResult();
           string=(String)obj;
          

  
	 try {
		 et.begin();
		 
		 et.commit();
	 }catch (Exception e) {
		if(et.isActive()) {
			et.rollback();
		}
	}finally {
		em.close();
		emf.close();

	}
	
		return string;
	}

	@Override
	public List<DesktopEntity> getAllByEmailAndNumber(String email,long desktopNumber) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	    EntityManager em= emf.createEntityManager();
	     EntityTransaction et=  em.getTransaction();
	     
	     List<DesktopEntity> list2=null;
	     Query query=em.createNamedQuery("getAllByEmailAndNumber");
	        query.setParameter("getEmail", email);
	        query.setParameter("getNumber", desktopNumber);
	    list2= query.getResultList();
	    for (DesktopEntity desktopEntity : list2) {
			System.out.println("desktopEntity"+desktopEntity);
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
		
	

		return list2;
	}

	@Override
	public LocalDateTime finddateTimeById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	    EntityManager em= emf.createEntityManager();
	     EntityTransaction et=  em.getTransaction();
	     
	   LocalDateTime str=null;
	 Query query=em.createNamedQuery("finddateTimeById");
	 query.setParameter("getId", id);
	   Object obj = query.getSingleResult();
	    str=(LocalDateTime)obj;
	   
	  
	
	  
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
		
	
		
		return str;
	}

	@Override
	public long finddesktopNumberById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	    EntityManager em= emf.createEntityManager();
	     EntityTransaction et=  em.getTransaction();
	     
	   long number=1000;
	 Query query=em.createNamedQuery("finddesktopNumberById");
	 query.setParameter("getId", id);
	   Object obj = query.getSingleResult();
	    number=(long)obj;
	   
	  
	
	  
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
		
		return number;
	}

	@Override
	public float findFloatValueByName(String name) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	    EntityManager em= emf.createEntityManager();
	     EntityTransaction et=  em.getTransaction();
	     
	     float value=5;
	     Query query=em.createNamedQuery("findFloatValueByName");
	     query.setParameter("getName", name);
	     
	     Object obj=query.getSingleResult();
	     value=(float)obj;
	   
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

		return value;
	}

}
