package com.example.demo.entity;

import java.util.Set;

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
@Table(name ="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="user_password")
	private String password;
	
	@Column(name="user_address")
	private String user_address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private long phone_number;
	
	
	/*@ManyToOne(targetEntity = Cart.class,fetch = FetchType.EAGER)
	@JoinColumn(name="user_id",insertable = false, updatable = false)
	private Cart cart;
	/*@OneToMany(mappedBy="user")
	private Set<Product> product;*/
	
	
	
	public User() {
		
	}
	
	public User(int user_id, String first_name, String last_name, String user_name, String password, String user_address,String email,int phone_number) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_name = user_name;
		this.password = password;
		this.user_address = user_address;
		this.email=email;
		this.phone_number=phone_number;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getuser_address() {
		return user_address;
	}

	public void setuser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	
	
	
	
}
