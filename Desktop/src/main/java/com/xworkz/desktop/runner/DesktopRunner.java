package com.xworkz.desktop.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.desktop.dto.DesktopEntity;

public class DesktopRunner {

	public static void main(String[] args) {
	
		
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	    EntityManager  em=emf.createEntityManager();
	 EntityTransaction et=  em.getTransaction();
	 
	 List<DesktopEntity> list=new ArrayList<DesktopEntity>();
	 list.add(new DesktopEntity("dell","dell@gmail.com", true, LocalDate.of(2024, 12, 24),LocalDateTime.of(2024, 12,24,10,33),55000,7760750873L,(short)120,(byte)9,'a',25.5f));
	 list.add(new DesktopEntity("hp","hp@gmail.com", true, LocalDate.of(2024, 9, 2),LocalDateTime.of(2024, 9,2,11,43),75000,9876750873L,(short)100,(byte)8,'b',24.5f));
	 list.add(new DesktopEntity("lenova","lenova@gmail.com", false, LocalDate.of(2024, 3, 23),LocalDateTime.of(2024, 3,23,9,45),64000,4536750873L,(short)180,(byte)7,'c',28.5f));
	 list.add(new DesktopEntity("apple","apple@gmail.com", true, LocalDate.of(2024, 5, 4),LocalDateTime.of(2024, 5,4,4,55),100000,9874750873L,(short)130,(byte)6,'d',35.5f));
	 list.add(new DesktopEntity("acer","acer@gmail.com", false, LocalDate.of(2024, 6, 8),LocalDateTime.of(2024, 6,8,10,44),50000,2345750873L,(short)135,(byte)5,'e',45.5f));
	 list.add(new DesktopEntity("asus","asus@gmail.com", true, LocalDate.of(2024, 12, 9),LocalDateTime.of(2024, 12,9,5,23),65000,9846750873L,(short)140,(byte)10,'f',29.5f));
	 list.add(new DesktopEntity("microsoft","microsoft@gmail.com", true, LocalDate.of(2024, 5, 2),LocalDateTime.of(2024, 5,2,9,23),70000,3465750873L,(short)150,(byte)11,'g',38.5f));
	 list.add(new DesktopEntity("sumsung","sumsung@gmail.com", true, LocalDate.of(2024, 11, 18),LocalDateTime.of(2024, 11,18,8,23),85000,4987750873L,(short)160,(byte)12,'h',15.5f));
	 list.add(new DesktopEntity("razer","razor@gmail.com", true, LocalDate.of(2024, 10, 15),LocalDateTime.of(2024, 10,15,4,33),75000,3455750873L,(short)170,(byte)13,'i',33.5f));
	 list.add(new DesktopEntity("toshiba","toshiba@gmail.com", true, LocalDate.of(2024, 2, 22),LocalDateTime.of(2024, 2,22,11,43),65000,234750873L,(short)180,(byte)14,'j',41.5f));
	 
	 for (DesktopEntity desktopEntity : list) {
		 em.persist(desktopEntity);
		
	}
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
		
	}

}
