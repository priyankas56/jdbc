package com.xworkz.cable.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cable.dto.ProductDTO;



public class ProductRunner {
	      
	
	public static void main(String[] args) {
	     EntityManagerFactory emf= Persistence.createEntityManagerFactory("xworkz");
	    EntityManager em=emf.createEntityManager();
	   EntityTransaction et=em.getTransaction();
	   
	   
	   
	   List<ProductDTO> dto=new ArrayList<ProductDTO>();
	   dto.add(new ProductDTO("earbuds","techbrand","electronics","high quality earbuds",3000,2,true,20,40));
	   dto.add(new ProductDTO("smartphone","techbrand","electronics","latest model smartphones",30000,2,true,22,500));
	   dto.add(new ProductDTO("laptop","dell","electronics","latest model laptop",60000,1,true,23,5000));
	   dto.add(new ProductDTO("cable Wired","techbrand","wire","hign quality cable wires",3000,1,true,23,800));
	   dto.add(new ProductDTO("doveShapoo","dove","shapoo","hairfall shapooo",6000,2,true,22,700));
	   dto.add(new ProductDTO("hairDrier","nyka","electronics","hairDrier for hairs",1000,2,true,22,6000));
	   dto.add(new ProductDTO("Face Cleanser","fresh","electronics","Fresh Soy Face Cleanser",3000,2,true,24,5000));
	   dto.add(new ProductDTO("Water Cream ","tatcha","electronics","Tatcha The Water Cream ",30000,2,true,22,500));
	   dto.add(new ProductDTO("Renewal Serum ","Murad","electronics","Murad Retinol Youth Renewal Serum ",8000,1,true,24,8000));
	   dto.add(new ProductDTO("Exfoliating Toner","pixi","electronics","Pixi Glow Tonic Exfoliating Toner ",7000,2,true,23,700));
	   
	   for(ProductDTO productDTO:dto) {
		   ProductDTO product=new ProductDTO();
		   product.setProductName(product.getProductName());
		   product.setBrand(product.getBrand());
		   product.setBrand(product.getCategory());
		   product.setDescription(product.getDescription());
		   product.setPrice(product.getPrice());
		   product.setStockQuantity(product.getStockQuantity());
		   product.setActive(product.getIsActive());
		   product.setRating(product.getRating());
		   product.setTotalReviews(product.getTotalReviews());
		   
		   em.persist(productDTO);
	   }try {
		   et.begin();
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
