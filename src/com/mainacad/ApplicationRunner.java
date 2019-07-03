package com.mainacad;

import com.mainacad.model.Cart;
import com.mainacad.model.Item;
import com.mainacad.model.Order;
import com.mainacad.service.CartService;

public class ApplicationRunner {
  public static void main(String[] args) {
    Item item = new Item("Bike kellys spider 400", "ksl-spk4000", 456.87d);
    Order order = new Order(item, 3);

    Cart newCard = new Cart("Vasiliy Pyatochkin", order);

    System.out.println("Cart information: customer - " + newCard.getCustomer());
    System.out.println(newCard.getOrder().getItem().toString() + " * " + newCard.getOrder().getCount()
            + " = " + CartService.getTotalSum(newCard));
  }
}
