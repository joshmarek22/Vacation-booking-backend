package com.example.josh.services;

import com.example.josh.entities.Cart;
import com.example.josh.entities.CartItem;
import com.example.josh.entities.Customer;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Purchase {

    private Cart cart;

    private Set<CartItem> cartItems;

    private Customer customer;
}
