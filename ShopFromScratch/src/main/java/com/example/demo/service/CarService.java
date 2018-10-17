package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import com.example.demo.repository.InMemoryCartRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;
	
	public List<Car> getCars() {
		return carRepository.findAll();
	}

	public void addCarToCart(Optional<Car> car) {

		if(InMemoryCartRepository.getProductFromCartByName(car.get().getName()) != null) {
			InMemoryCartRepository.updateProductAmount(car.get());
		} else {
			
			car.get().setAmount(1);
			InMemoryCartRepository.addProductToCart(car.get());
		}
	}

	public Optional<Car> getById(int productId) {
		return carRepository.findById(productId);
	}

}
