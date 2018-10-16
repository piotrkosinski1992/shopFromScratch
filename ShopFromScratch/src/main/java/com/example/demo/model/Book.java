package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class Book extends Product {

	private int numberOfPages;
	
	public Book(String name, double price, int amount, int numberOfPages) {
		super(name, price, amount);
		this.numberOfPages = numberOfPages;
	}
	
	protected Book() {
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	
	
}
