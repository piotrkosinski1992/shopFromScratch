package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.model.Car;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.InMemoryCartRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Object getBooks() {
		return bookRepository.findAll();
	}

	public Optional<Book> getById(int productId) {
		return bookRepository.findById(productId);
	}
	
	public boolean addBookToCart(Optional<Book> book) {

		int productAmount = book.get().getAmount();
		if(productAmount <= 0) {
			return false;
		} else {
			book.get().setAmount(productAmount - 1);
			bookRepository.save(book.get());
		}
		
		if(InMemoryCartRepository.getProductFromCartByName(book.get().getName()) != null) {
			InMemoryCartRepository.updateProductAmount(book.get());
		} else {
			
			book.get().setAmount(1);
			InMemoryCartRepository.addProductToCart(book.get());
		}
		
		return true;
	}
}
