package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.BookService;
import com.example.demo.service.CarService;

@Controller
@RequestMapping("/books")
public class BookController {


		@Autowired
		BookService bookService;
		
		@GetMapping
		public String getCars(Model model) {
			model.addAttribute("products", bookService.getBooks());
			model.addAttribute("siteHeader", "car list");
			
			return "productList";
		}
}
