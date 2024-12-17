package com.xworkz.travelPlace.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Service;

import com.xworkz.travelPlace.dto.TravelPlaceDTO;
import com.xworkz.travelPlace.entity.TravelPlaceEntity;

@Service
public class TravelPlaceRepoImpl implements TravelPlaceRepo{

	@Override
	public boolean save(TravelPlaceEntity travelPlaceEntity) {
	

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	 EntityManager em=emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	


	 try {
		 et.begin();
		 em.persist(travelPlaceEntity);
		 et.commit();
	}catch (Exception e) {
	   if(et.isActive()) {
		   et.rollback();
	   }
	   e.printStackTrace();
	}finally {
		em.close();
		emf.close();
	}

		return true;
	}

}
