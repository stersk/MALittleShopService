package com.mainacad.model;

public class Cart {
  private User customer;
  private Order order;

  public Cart(User customer, Order order) {
    this.customer = customer;
    this.order = order;
  }

  public User getCustomer() {
    return customer;
  }

  public void setCustomer(User customer) {
    this.customer = customer;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }
}
