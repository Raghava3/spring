package com.bridgelabz.countryprojectdb.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="COUNTRY_DETAILS")
public class Country implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name="abc", strategy="increment")
	@GeneratedValue(generator="abc")
	@Column(name="DB_ID")
	private Integer id;
	
	@Column(name="CTRY_ID")
	private int ctryid;
	
	@Column(name="CTRY_NAME")
	private String name;
	 
	@Column(name="CTRY_AREA")
	private Integer area;
	 
	@Column(name="CTRY_POP")
	private Long population;
	 
	
	 
	@Column(name="CURRENCY")
	private String currency;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}
	 
	public void setId(Integer id) {
	this.id = id;
	}
	 
	public Integer getId() {
	return id;
	}
	 
	public void setName(String name) {
	this.name = name;
	}
	 
	public String getName() {
	return name;
	}
	 
	public void setArea(Integer area) {
	this.area = area;
	}
	 
	public Integer getArea() {
	return area;
	}
	 
	public void setPopulation(Long population) {
	this.population = population;
	}
	 
	public Long getPopulation() {
	return population;
	}
	 
	
	 
	public void setCurrency(String currency) {
	this.currency = currency;
	}
	 
	public String getCurrency() {
	return currency;
	}

	public int getCtryid() {
		return ctryid;
	}

	public void setCtryid(int ctryid) {
		this.ctryid = ctryid;
	}

}
