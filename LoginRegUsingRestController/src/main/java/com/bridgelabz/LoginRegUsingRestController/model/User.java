package com.bridgelabz.LoginRegUsingRestController.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "USER_TABLE")
public class User implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	private int    id;
	private String name;
	private String email;
	private String password;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk")
	private List<Product> product;
	
	public List<Product> getProduct()
	{
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
