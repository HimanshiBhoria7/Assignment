package com.databseproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.databseproject.entity.CartItem;



@Repository
public interface CartItemRepo extends JpaRepository<CartItem, Integer>{

}
