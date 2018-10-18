package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {

}
