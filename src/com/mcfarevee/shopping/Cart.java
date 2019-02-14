package com.mcfarevee.shopping;

import com.mcfarevee.groceries.*;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Creates a shopping cart for a customer at McFare-Vee
 * 
 * @author Ally Rogers - rogersal@grinnell.edu
 * @author Kedam Habte - habteked@grinnell.edu
 */
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
   * Counter for the total number of packages and other things in the cart
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

  // +-----------+---------------------------------------------------
  // | Accessors |
  // +-----------+

  /**
   * Get the number of things in the cart (e.g. Packages, BulkItems, Non-Foods)
   */
  public int numThings() {} // numThings()

  /**
   * Get the total number of entries in the cart
   */
  public int numEntries() {} // numEntries()

  /**
   * Get the total price of all items in the cart
   */
  public int getPrice() {} // getPrice()

  /**
   * Get the total weight of all items in the cart
   */
  public int[] getWeight() {} // getWeight()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Add given item to cart
   */
  public void addItem(Item item) {} // addItem(Item item)
  missing;

  /**
   * Print the contents of the cart
   */
  public void printContents(PrintWriter pen) {
    int size = this.cart.size();
    for (int i = 0; i < size; i++) {
      pen.println(this.cart.get(i).toString());
    } // for
  } // printContents(PrintWriter pen)

  /**
   * Remove all items with given name from string
   * 
   * @return true if items removed
   * @return false if no items exist with name "name". Cart not changed.
   */
  public boolean remove(String name) {
    for (int i = 0; i < this.cart.size(); i++) {

      if (this.cart.get(i))
        ;
    } // for
  } // remove(String name)

  public void merge() {} // merge()
  missing;

} // Cart class


