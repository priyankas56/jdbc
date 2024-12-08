package com.xworkz.product.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="item_table")
@NamedQuery(name="findByProdcutId", query="Select ent From ProductEntity ent where ent.productId=20115")
@NamedQuery(name="findByProductName", query="Select et From ProductEntity et where et.productName='Jockey-InnerWear'")
@NamedQuery(name="findById", query="Select enty From ProductEntity enty where enty.id= 11")
@NamedQuery(name = "findByProductId&ProductName", query = "Select et From ProductEntity et Where et.id =9")
@NamedQuery(name= "findByProductName&Category", query="Select et From ProductEntity et Where et.productId=34560")

public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="productId")
	private int productId;
	@Column(name="productName")
	private String productName;
	@Column(name="price")
	private double price;
	@Column(name="category")
	private String category;

	public ProductEntity() {
	
	}

	public ProductEntity(int productId, String productName, double price, String category) {
		super();

		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", productId=" + productId + ", productName=" + productName + ", price="
				+ price + ", category=" + category + "]";
	}
	
	
}
