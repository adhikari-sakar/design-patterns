package com.example.design.oo.example.shoppingcart;

import java.util.List;
import java.util.function.BiFunction;

public class ShoppingApp implements API {

    @Override
    public Cart buy(List<Item> items) {
        return null;
    }

    @Override
    public Order order(Cart cart) {
        return null;
    }

    @Override
    public Delivery deliver(Order order) {
        return null;
    }

    public static void main(String[] args) {
        ShoppingApp app = new ShoppingApp();
        Cart cart = app.buy(List.of(new Item()));
        Order order = app.order(cart);
        Delivery delivery = app.deliver(order);
    }
}
