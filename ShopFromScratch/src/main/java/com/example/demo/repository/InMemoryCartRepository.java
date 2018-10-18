//package com.example.demo.repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.log4j.Logger;
//
//import com.example.demo.model.Product;
//
//public class InMemoryCartRepository {
//
//	private static Logger LOGGER = Logger.getLogger(InMemoryCartRepository.class.getName());
//	
//	private static List<Product> cart = new ArrayList<>();
//
//	public static List<Product> getCart() {
//		return cart;
//	}
//	
//	public static void addProductToCart(Product product) {
//		LOGGER.info(product.toString());
//		cart.add(product);
//	}
//	
//	public static Product getProductFromCartByName(String name) {
//		for (Product product : cart) {
//			if(product.getName().equals(name)) {
//				return product;
//			}
//		}
//		return null;
//	}
//	
//	public static void updateProductAmount(Product product) {
//		Product productFromCart = cart.stream().filter(productFromList -> productFromList.getName().equals(product.getName())).findFirst().get();
//		productFromCart.setAmount(productFromCart.getAmount() + 1);
//	}
//}
