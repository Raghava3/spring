package com.bridgelabz.LoginRegUsingRestController.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PROD_PURCHASE_TRANS")
public class ProductPurchaseTransaction {
	
	@ManyToOne(cascade=CascadeType.DETACH)
	private User user;
	
	@ManyToOne(cascade=CascadeType.DETACH)
	private Product boughtProduct;

	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	private int id;
	
	private long amt;
	private int discount;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getBoughtProduct() {
		return boughtProduct;
	}
	public void setBoughtProduct(Product boughtProduct) {
		this.boughtProduct = boughtProduct;
	}
	public long getAmt() {
		return amt;
	}
	public void setAmt(long amt) {
		this.amt = amt;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
