package com.example.design.oo.example.shoppingcart;

import java.util.List;

public interface API {

    Cart buy(List<Item> items);

    Order order(Cart cart);

    Delivery deliver(Order order);
}
