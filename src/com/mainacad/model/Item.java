package com.mainacad.model;

public class Item {
  private String name;
  private String articul;
  private double price;

  public Item(String name, String articul, double price) {
    this.name = name;
    this.articul = articul;
    this.price = price;
  }

  public Item() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getArticul() {
    return articul;
  }

  public void setArticul(String articul) {
    this.articul = articul;
  }

  @Override
  public String toString() {
    return name + " (" + articul + ")";
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
