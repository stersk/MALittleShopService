package com.mainacad;

import com.mainacad.model.*;
import com.mainacad.service.*;

public class ApplicationRunner {
  public static void main(String[] args) {
    User user = new User("secondUser", "password", "Second", "User", UserGenerationService.getDate(2002, 5, 2), Gender.MALE);
    Item item = new Item("Bike kellys spider 400", "ksl-spk4000", 456.87d);
    Order order = new Order(item, 3);

    Cart newCard = new Cart(user, order);

    System.out.println("Cart information: customer - " + newCard.getCustomer());
    System.out.println(newCard.getOrder().getItem().toString() + " * " + newCard.getOrder().getCount()
            + " = " + CartService.getTotalSum(newCard));
  }
}
