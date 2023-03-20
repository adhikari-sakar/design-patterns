package com.example.design.fp.example.shoppingcart;

import com.example.design.oo.example.shoppingcart.Cart;
import com.example.design.oo.example.shoppingcart.Delivery;
import com.example.design.oo.example.shoppingcart.Item;

import java.util.List;
import java.util.function.Function;

public class ShoppingApp {

    public static void main(String[] args) {

        Function<List<Item>, Delivery> onClickBuyFunction = ((Function<List<Item>, Cart>) API::buy)
                .andThen(API::order)
                .andThen(API::deliver);

        Delivery delivery = onClickBuyFunction.apply(List.of(new Item()));
    }
}
