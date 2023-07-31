package org.dailycodebuffer.entity;

import org.springframework.stereotype.Component;

/**
 * For different cross-cutting concerns we create different aspects
 */
@Component
public class ShoppingCart {
    //logging aspect

    //Authentication & Authorization aspects
    //Sanitize the Data aspect

    public void checkout(final String status) {
        System.out.println("Checkout method from ShoppingCart called!");
    }
}
