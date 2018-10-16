package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

	@Autowired
	CarService carService;
	
	@GetMapping
	public String getCars(Model model) {
		model.addAttribute("products", carService.getCars());
		model.addAttribute("siteHeader", "car list");
		
		return "productList";
	}
	
	@GetMapping("/{productId}")
	public String addProductToCart(@PathVariable int productId, Model model) {
		carService.addCarToCart(carService.getById(productId));
		model.addAttribute("products", cartService.getUserProducts());
		
		return "cart";
	}
}
