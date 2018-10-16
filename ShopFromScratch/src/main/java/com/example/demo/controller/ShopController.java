package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopController {
	
//	@Autowired
//	private ProductService productService;

	@GetMapping
	public String shopHomePage() {
		return "shopHomePage";
	}
		
//	@GetMapping("/products/{category}")
//	public String getProductsByCategory(@PathVariable String category, Model model) {
//		model.addAttribute("products", productService.getProductsByCategory(category));
//		model.addAttribute("siteHeader", category + " list");
//		
//		return "productList";
//	}
//	
//	@GetMapping("/products")
//	public String getAllProducts(Model model) {
//		model.addAttribute("products", productService.getAllProducts());
//		model.addAttribute("siteHeader", "all products");
//		
//		return "productList";
//	}
	
	
	
}
