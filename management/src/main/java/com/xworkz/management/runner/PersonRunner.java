package com.xworkz.management.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.management.dto.PersonDTO;



public class PersonRunner {
	
	public static void main(String[] args) {
		
		
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("xworkz");
	 EntityManager em=emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	
	List<PersonDTO> dto=new ArrayList<PersonDTO>();
	dto.add(new PersonDTO("priyanka","priya@gmail.com","12345","7760750873","banglore",21));
	dto.add(new PersonDTO("sowmya","sowmya@gmail.com","45345","8765750873","bnglore",21));
	dto.add(new PersonDTO("varsha","varsha@gmail.com","34345","9845750873","banglore",21));
	dto.add(new PersonDTO("raksha","raksha@gmail.com","98345","8755750873","banglore",21));
	dto.add(new PersonDTO("shivu","shivu@gmail.com","46345","7890750873","banglore",21));
	for (PersonDTO personDTO : dto) {
		
		PersonDTO person=new PersonDTO();
		person.setName(personDTO.getName());
		person.setEmail(personDTO.getEmail());
		person.setPassword(personDTO.getPassword());
		person.setPhoneNumber(personDTO.getPhoneNumber());
		person.setAddress(personDTO.getAddress());
		person.setAge(personDTO.getAge());
		
		em.persist(person);
		

		List<PersonDTO> list=em.createQuery("select gd from PersonDTO gd",PersonDTO.class).getResultList();
		 for (PersonDTO personDTO1 : list) {
			 System.out.println("personName:" + personDTO1.getName() + "personEmail:"+ personDTO1.getEmail() + "personAddress:" + personDTO1.getAddress() + "personAge:" + personDTO1.getAge());
			
		}

	
	}
	
	
	
	List<PersonDTO> list=em.createQuery("select gd from PersonDTO gd",PersonDTO.class).getResultList();
	 for (PersonDTO personDTO : list) {
		 System.out.println("personName"+personDTO.getName() +"personEmail"+personDTO.getEmail() + "personAddress"+personDTO.getAddress()+ "personAge" +personDTO.getAge());
		
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
