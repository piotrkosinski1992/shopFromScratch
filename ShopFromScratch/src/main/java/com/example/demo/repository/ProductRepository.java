package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Product;


@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

}
