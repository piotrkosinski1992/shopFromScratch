package com.example.demo.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.ProductService;

@Controller
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired
	private ProductService productService;

	@GetMapping
	public String shopHomePage() {
		return "shopHomePage";
	}
	
	@GetMapping("/userId")
	@ResponseBody
	public String getUserId(Principal principal) {
		return principal.getName();	
	}
	
	@GetMapping("/cart")
	public String getUserProducts(Principal principal, Model model) {
		model.addAttribute("products", productService.getUserProducts(Integer.parseInt(principal.getName())));
		return "productList";
	}
	
	@GetMapping("/products/{category}")
	public String getProductsByCategory(@PathVariable String category, Model model) {
		model.addAttribute("products", productService.getProductsByCategory(category));
		
		return "productList";
	}
	
	@GetMapping("/products")
	public String getAllProducts(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		
		return "productList";
	}
	
	
	
}
