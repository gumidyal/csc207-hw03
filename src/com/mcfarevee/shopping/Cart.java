package com.mcfarevee.shopping;

import com.mcfarevee.groceries.*;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Cart {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  
  /**
   * The cart of Item types
   */
  ArrayList<Item> cart;
  
  /**
   * The name of the cart
   */
  String name;
  
  /**
   * Counter for the total number of packages in the cart
   */
  int numPackages;
  
  /**
   * Counter for the total price of all items in the cart
   */
  int totPrice;
  
  /**
   * Counter for the total weight of all items in the cart
   */
  int totWeight;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a cart of the given name to hold type Item
   */
  public Cart(String name) {
    this.name = name;
    this.numPackages = 0;
    this.totPrice = 0;
    this.totWeight = 0;
  } // Cart(String name)

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Add given item to cart
   */
  public void addItem(Item item) {

  }

  /**
   * Get the number of things in the cart (e.g. Packages, BulkItems, Non-Foods)
   */
  public int numThings() {

  }

  /**
   * Get the total number of entries in the cart
   */
  public int numEntries() {


  }


  public void printContents(PrintWriter pen) {

  }


  public int getPrice() {

  }


  public int[] getWeight() {


  }



  public void remove(String name) {
    
  }

  public void merge() {

  }

}


