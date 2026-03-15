package com.example.josh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.josh.entities.CartItem;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
