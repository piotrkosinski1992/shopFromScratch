package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.model.Car;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	private ProductRepository productRepository;
	
	
	private static List<Product> products = Arrays.asList(new Book("harry potter", 56.90, 10000, "book"), new Car("ferrarui", 1000000.0, 3, "car"));
	
	//info o produkcie zeby dostac pelna specyfikacje
	//ogarnąc liczbę sztuk zamawianych
	private static List<Product> cart = new ArrayList<>();

	public List<Product> getProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return  products.stream().filter(product -> product.getCategory().equals(category)).collect(Collectors.toList());
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return products;
	}
}
