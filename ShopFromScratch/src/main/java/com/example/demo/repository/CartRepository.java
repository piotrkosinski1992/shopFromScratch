package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cart;

@Transactional
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
