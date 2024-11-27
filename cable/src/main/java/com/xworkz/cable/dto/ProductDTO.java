package com.xworkz.cable.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_table")
public class ProductDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	@Column(name="productName")
	private String productName;
	@Column(name="brand")
	private String brand;
	@Column(name="category")
	private String category;
	@Column(name="description")
	private String description;
	@Column(name="price")
	private double price;
	@Column(name="stockQuantity")
	private int stockQuantity;
	@Column(name="isActive")
	private boolean isActive;
	@Column(name="rating")
	private double rating;
	@Column(name="totalReviews")
	private int totalReviews;
	
	public ProductDTO() {
		
	}
	public ProductDTO(String productName, String brand, String category, String description, double price,
			int stockQuantity, boolean isActive, double rating, int totalReviews) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.category = category;
		this.description = description;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.isActive = isActive;
		this.rating = rating;
		this.totalReviews = totalReviews;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getTotalReviews() {
		return totalReviews;
	}
	public void setTotalReviews(int totalReviews) {
		this.totalReviews = totalReviews;
	}
	
	

}
