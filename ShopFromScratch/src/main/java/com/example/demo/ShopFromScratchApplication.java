package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Book;
import com.example.demo.model.Cart;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class ShopFromScratchApplication implements CommandLineRunner {

	
	@Autowired
	private UserRepository userRepository;
////	
////	@Autowired
////	private CartRepository cartRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ShopFromScratchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Book book1 = new Book("Harry",11.11,22,123);
		Book book2 = new Book("Harry2",121.11,222,2123);
		
		
		User user = new User("piotr");	
		Cart cart = new Cart();
		
		cart.getBooks().add(book1);
		cart.getBooks().add(book2);
		
		book1.getCartList().add(cart);
		
		user.setCart(cart);
		cart.setUser(user);
		
		userRepository.save(user);
		
		
		User user2 = new User("piotr2");
		Cart cart2 = new Cart();
		user.setCart(cart2);
		cart.setUser(user2);

		userRepository.save(user2);

		for(Book book : userRepository.findById(1).get().getCart().getBooks()) {
			System.out.println(book.toString());
		}
	}
}
