package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.model.Car;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class CartService {

	
	@Autowired
	private ProductRepository productRepository;
	
	
	private static List<Product> products = Arrays.asList(new Book("harry potter", 56.90, 10000, "book"), new Car("ferrarui", 1000000.0, 3, "car"));
	
	//info o produkcie zeby dostac pelna specyfikacje
	//ogarnąc liczbę sztuk zamawianych
	private static List<Product> cart = new ArrayList<>();
	
	
	public List<Product> getUserProducts(int userId) {
		// TODO Auto-generated method stub
		return cart;
	}
	
	public List<Product> addProductToCart(int productId) {
		cart.add(products.get(productId-1));	
		return cart;
	}

}
