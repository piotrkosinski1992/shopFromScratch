package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class Car extends Product {
	
	
	private int vMax;
	
	private String category = "car";
	
	public Car(String name, double price, int amount, int vMax) {
		super(name, price, amount);
		this.vMax = vMax;
	}
	
	protected Car() {
	}

	public int getvMax() {
		return vMax;
	}

	public void setvMax(int vMax) {
		this.vMax = vMax;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}	
	
	
}
