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

	public void addCarToCart(Car car) {
		InMemoryCartRepository.addProductToCart(car);
		
	}

	public Optional<Car> getById(long productId) {
		return carRepository.findById(productId);
	}

}
