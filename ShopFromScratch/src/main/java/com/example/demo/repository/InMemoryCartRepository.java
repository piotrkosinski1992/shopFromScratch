package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Product;

public class InMemoryCartRepository {

	private static List<Product> cart = new ArrayList<>();

	public static List<Product> getCart() {
		return cart;
	}
	
	public static void addProductToCart(Product product) {
		cart.add(product);
	}
}
