package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.BookService;
import com.example.demo.service.CarService;
import com.example.demo.service.CartService;

@Controller
@RequestMapping("/book")
public class BookController {


		@Autowired
		BookService bookService;
		
		@Autowired
		CartService cartService;
		
		@GetMapping
		public String getBooks(Model model) {
			model.addAttribute("products", bookService.getBooks());
			model.addAttribute("siteHeader", "car list");
			
			return "productList";
		}
		
		@GetMapping("/{productId}")
		public String addProductToCart(@PathVariable int productId, Model model) {
			bookService.addBookToCart(bookService.getById(productId));
			model.addAttribute("products", cartService.getUserProducts());
			
			return "cart";
		}
}
