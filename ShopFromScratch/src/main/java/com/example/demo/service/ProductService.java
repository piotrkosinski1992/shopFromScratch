package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getUserProducts(int userId) {
		// TODO Auto-generated method stub
		return Arrays.asList(new Product("product from userId " + userId,19999.0,100));
	}

	public List<Product> getProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return  Arrays.asList(new Product("product by category " + category,19999.0,100));
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return Arrays.asList(new Product("all products",19999.0,100));
	}

}
