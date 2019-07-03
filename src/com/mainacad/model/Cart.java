package com.mainacad.model;

public class Cart {
  private String customer;
  private Order order;

  public Cart(String customer, Order order) {
    this.customer = customer;
    this.order = order;
  }

  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }
}
