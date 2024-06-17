package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="fb_product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="fbproduct_id")
	private int product_id;
	
	@Column(name="fbproduct_name")
	private String product_name;
	
	@Column(name="fbproduct_description")
	private String product_description;
	
	@Column(name="unit_price")
	private int price;
	
	@Column(name="fbproduct_image")
	private String product_image;
	
	@Column(name="fbproduct_brand")
	private String Product_brand;
	
	@Column(name="fbproduct_quantity")
	private String product_quantity;
	
	@Column(name="active")
	private int active;
	
	@Column(name="fbcategory_id")
	private int category_id;
	
	@ManyToOne(targetEntity = Category.class,fetch = FetchType.EAGER)
	@JoinColumn(name="fbcategory_id",insertable = false, updatable = false)
	private Category food_category;
	public Product() {
		
	}


	public Product(int product_id, String product_name, String product_description, int price, String product_image,
			String product_brand, String product_quantity, int active, int category_id) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.price = price;
		this.product_image = product_image;
		Product_brand = product_brand;
		this.product_quantity = product_quantity;
		this.active = active;
		this.category_id = category_id;
	}


	public int getproduct_id() {
		return product_id;
	}


	public void setproduct_id(int product_id) {
		this.product_id = product_id;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public String getProduct_description() {
		return product_description;
	}


	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getProduct_image() {
		return product_image;
	}


	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}


	public String getProduct_brand() {
		return Product_brand;
	}


	public void setProduct_brand(String product_brand) {
		Product_brand = product_brand;
	}


	public String getProduct_quantity() {
		return product_quantity;
	}


	public void setProduct_quantity(String product_quantity) {
		this.product_quantity = product_quantity;
	}


	public int getActive() {
		return active;
	}


	public void setActive(int active) {
		this.active = active;
	}


	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	
	
}
