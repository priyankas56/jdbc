package com.xworkz.cable.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cable.dto.SportDtO;

public class SportRunner {
	
	public static void main(String[] args) {
		
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	List<SportDtO> dto=new ArrayList<SportDtO>();
	dto.add(new SportDtO("Soccer","Team", 11, "England", true, "100x50 meters", "FIFA", "Ball", 1));
     dto.add(new SportDtO("Basketball", "Team", 5, "USA", true, "28x15 meters",  "FIBA", "Ball", 2)); 
     dto.add(new SportDtO("Cricket", "Team", 11, "England", true, "22-yard pitch","ICC", "Bat, Ball, Stumps", 3)); 
     dto.add(new SportDtO("Tennis", "Individual", 1, "France", true, "78x27 feet", "ITF", "Racket, Ball", 4)); 
     dto.add(new SportDtO("Baseball", "Team", 9, "USA", false, "90-foot diamond",  "MLB", "Bat, Ball, Gloves", 5)); 
     dto.add(new SportDtO("Rugby", "Team", 15, "England", true, "100x70 meters", "World Rugby", "Ball", 6)); 
     dto.add(new SportDtO("Swimming", "Individual", 1, "Greece", true, "50x25 meters pool","FINA", "Swimsuit", 7));
     dto.add(new SportDtO("Boxing", "Individual", 1, "Greece", true, "Ring: 20x20 feet", "AIBA", "Gloves", 5)); 
     dto.add(new SportDtO("Golf", "Individual", 1, "Scotland", true, "18-hole course", "R&A", "Clubs, Ball", 9)); 
     dto.add(new SportDtO("Hockey", "Team", 11, "Canada", true, "100x55 meters", "FIH", "Stick, Ball", 10)); 
     for(SportDtO sportDTO:dto) {
    	 SportDtO sport=new SportDtO();
    	 sport.setSport_name(sport.getSport_name());
    	 sport.setType(sport.getType());
    	 sport.setPlayers_per_team(sport.getPlayers_per_team());
    	 sport.setOrigin_country(sport.getOrigin_country());
    	 sport.setIs_olympic_sport(sport.getIs_olympic_sport());
    	 sport.setField_size(sport.getField_size());
    	 sport.setGoverning_body(sport.getGoverning_body());
    	 sport.setEquipment_needed(sport.getEquipment_needed());
    	 sport.setPopularity_rank(sport.getPopularity_rank());
    	 
    	 em.persist(sportDTO);

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
		em.close();
		emf.close();
	}
	}
}



