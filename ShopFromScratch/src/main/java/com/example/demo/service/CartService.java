package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.InMemoryCartRepository;

@Service
public class CartService {
		
	public List<Product> getUserProducts(int userId) {

		return InMemoryCartRepository.getCart();

	}
	
	public List<Product> getUserProducts() {

		return InMemoryCartRepository.getCart();

	}
	
	public void addProductToCart(Product product) {	
		InMemoryCartRepository.addProductToCart(product);

	}
	
	public Product getProductById(int productId) {
		return InMemoryCartRepository.getCart().stream().filter(product -> product.getId() == productId).findFirst().get();
	}

	public void deleteProductFromCart(int productId) {
		InMemoryCartRepository.getCart().removeIf(product -> product.getId() == productId);
	}

}
