package com.example.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.model.Cart;
import com.example.demo.model.User;
import com.example.demo.repository.CartRepository;
import com.example.demo.repository.UserRepository;



@Component
public class ProductBootstrapClass implements ApplicationListener<ContextRefreshedEvent> {

//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private CartRepository cartRepository;
	
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
//		Cart cart = new Cart();
//		User user = new User("piotr");
//		user.setCart(cart);
//		
//		userRepository.save(user);
//
//				
//		Cart cart2 = new Cart();
//		User user2 = new User("piotr");
//		user.setCart(cart2);
//		
//		userRepository.save(user2);
//		cartRepository.save(cart2);
		
	}

	
//	@Autowired
//	private BookRepository bookRepository;
//	
//	@Autowired
//	private CarRepository carRepository;
//	
//	
//	
//	@Override
//	public void onApplicationEvent(ContextRefreshedEvent event) {
//		loadCars();
//		loadBooks();
//		
//	}
//	private void loadBooks() {
//		bookRepository.save(new Book("harry potter",99.99,115,1000));
//		bookRepository.save(new Book("termdynamika",222.50,111,555));
//		bookRepository.save(new Book("java",199.00,5,342));
//		
//	}
//	private void loadCars() {
//		carRepository.save(new Car("volwo",39000.22,3,222));
//		carRepository.save(new Car("bwm",125000.00,2,333));
//		carRepository.save(new Car("opel",64000.00,4,179));	
//	}
}
