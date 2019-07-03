package com.mainacad.service;

import com.mainacad.model.Cart;
import com.mainacad.model.Order;

import javax.sound.midi.Soundbank;

public class CartService {
  public static double getTotalSum(Cart cart) {
    Order order = cart.getOrder();
    return order.getCount() * order.getItem().getPrice();
  }
}
