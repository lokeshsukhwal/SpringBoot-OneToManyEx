package com.app.lokesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.lokesh.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{

}
