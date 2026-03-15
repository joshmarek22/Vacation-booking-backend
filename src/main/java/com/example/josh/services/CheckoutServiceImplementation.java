package com.example.josh.services;

import com.example.josh.dao.CartItemRepository;
import com.example.josh.dao.CartRepository;
import com.example.josh.dao.CustomerRepository;
import com.example.josh.entities.Cart;
import com.example.josh.entities.CartItem;
import com.example.josh.entities.Customer;
import com.example.josh.entities.StatusType;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImplementation implements CheckoutService {

    @Autowired
    private CartRepository cartRepo;
    private final CustomerRepository customerRepo;

    @Autowired
    private CartItemRepository cartItemRepo;

    @Transactional
    @Override
    public PurchaseResponse placeOrder(Purchase purchase){

        //Gets info of customer and cart info
        Cart cart = purchase.getCart();
        Customer customer = purchase.getCustomer();
        Set<CartItem> cartItems = purchase.getCartItems();

        //Make unique tracking order number and assign it to tracking number variable
        String orderTrackingNumber = UUID.randomUUID().toString();
        cart.setOrderTrackingNumber(orderTrackingNumber);
        cart.setStatus(StatusType.ordered);

        //link customer to cart
        cart.setCustomer(customer);
        customer.getCarts().add(cart);
        //loop through each item and add them to the cart
        if (cartItems != null) {
            cartItems.forEach(cartItem -> {
                cart.add(cartItem); // Your Cart.java add() handles item.setCart(this)
            });
        }
        //save cart
        customerRepo.save(customer);

        // return the response
        return new PurchaseResponse(orderTrackingNumber);
    }
    @Autowired
    public CheckoutServiceImplementation(CartRepository cartRepo,
                                         CartItemRepository cartItemRepo,
                                         CustomerRepository customerRepo) {
        this.cartRepo = cartRepo;
        this.cartItemRepo = cartItemRepo;
        this.customerRepo = customerRepo;
    }

}
