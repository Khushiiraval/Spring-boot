package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class flightModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String name;
	private String num;
	private String fare;
	
	public Integer getid() 
	{
		return id;
	}
	public void setid(Integer id) 
	{
		this.id = id;
	}
	public String getname() 
	{
		return name;
	}
	public void setname(String name) 
	{
		this.name = name;
	}
	public String getnum() 
	{
		return num;
	}
	public void setnum(String num) 
	{
		this.num = num;
	}
	public String getfare() 
	{
		return fare;
	}
	public void setfare(String fare) 
	{
		this.fare = fare;
	}
	

}
