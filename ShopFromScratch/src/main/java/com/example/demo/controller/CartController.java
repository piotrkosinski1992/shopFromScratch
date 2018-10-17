package com.example.demo.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	
	@GetMapping
//	public String showUserProducts(Principal principal, Model model) {
	public String showUserProducts( Model model) {
		model.addAttribute("products", cartService.getUserProducts());
		return "cart";
	}

	@GetMapping("delete/{productId}")
	public String deleteProductFromCart(@PathVariable int productId, Model model) {
		cartService.deleteProductFromCart(productId);
		model.addAttribute("products", cartService.getUserProducts());
		return "cart";
	}
	
	
}
