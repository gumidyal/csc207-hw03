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
  int price;

  /**
   * Counter for the total weight of all items in the cart weight[0] is pounds weight[1] is ounces
   * weight[2] is grams weight[3] is kilograms
   */
  Weight[] weight;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a cart of the given name to hold type Item
   */
  public Cart(String name) {
    this.name = name;
    this.numPackages = 0;
    this.price = 0;
    this.weight = new Weight[] {new Weight(Unit.POUND, 0), new Weight(Unit.GRAM, 0),
        new Weight(Unit.OUNCE, 0), new Weight(Unit.KILOGRAM, 0)};
  } // Cart(String name)

  // +-----------+---------------------------------------------------
  // | Accessors |
  // +-----------+

  /**
   * Get the number of things in the cart (e.g. Packages, BulkItems, Non-Foods)
   */
  public int numThings() {
    return this.numPackages;
  } // numThings()

  /**
   * Get the total number of entries in the cart
   */
  public int numEntries() {
    return this.cart.size();
  } // numEntries()

  /**
   * Get the total price of all items in the cart
   */
  public int getPrice() {
    return this.price;
  } // getPrice()

  /**
   * Get the total weight of all items in the cart
   */
  public Weight[] getWeight() {
    return this.weight;
  } // getWeight()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Add given item to cart
   */
  public void addItem(Item item) {
    this.numPackages += item.getCount();
    this.price += item.getPrice();

    if (item.getWeight().getUnit().toString().equals("pound")) {
      int resamount;
      resamount = this.weight[0].getAmount() + item.getWeight().getAmount();
      Weight result = new Weight(Unit.POUND, resamount);
      this.weight[0] = result;
    } else if (item.getWeight().getUnit().toString().equals("ounce")) {
      int resamount;
      resamount = this.weight[1].getAmount() + item.getWeight().getAmount();
      Weight result = new Weight(Unit.OUNCE, resamount);
      this.weight[1] = result;
    } else if (item.getWeight().getUnit().toString().equals("gram")) {
      int resamount;
      resamount = this.weight[2].getAmount() + item.getWeight().getAmount();
      Weight result = new Weight(Unit.GRAM, resamount);
      this.weight[2] = result;
    } else {
      int resamount;
      resamount = this.weight[3].getAmount() + item.getWeight().getAmount();
      Weight result = new Weight(Unit.KILOGRAM, resamount);
      this.weight[3] = result;
    } // else
    cart.add(item);
  } // addItem(Item item)

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
    boolean removed = false;

    for (int i = 0; i < this.cart.size(); i++) {

      if (this.cart.get(i).getName().equals(name)) {
        this.numPackages -= cart.get(i).getCount();
        this.price -= cart.get(i).getPrice();

        if (cart.get(i).getWeight().getUnit().toString().equals("pound")) {
          int resamount;
          resamount = this.weight[0].getAmount() - cart.get(i).getWeight().getAmount();
          Weight result = new Weight(Unit.POUND, resamount);
          this.weight[0] = result;
        } else if (cart.get(i).getWeight().getUnit().toString().equals("ounce")) {
          int resamount;
          resamount = this.weight[1].getAmount() - cart.get(i).getWeight().getAmount();
          Weight result = new Weight(Unit.OUNCE, resamount);
          this.weight[1] = result;
        } else if (cart.get(i).getWeight().getUnit().toString().equals("gram")) {
          int resamount;
          resamount = this.weight[2].getAmount() - cart.get(i).getWeight().getAmount();
          Weight result = new Weight(Unit.GRAM, resamount);
          this.weight[2] = result;
        } else {
          int resamount;
          resamount = this.weight[3].getAmount() - cart.get(i).getWeight().getAmount();
          Weight result = new Weight(Unit.KILOGRAM, resamount);
          this.weight[3] = result;
        } // else
        cart.remove(i);
        removed = true;
      } // if

    } // for
    return removed;
  } // remove(String name)

  public void merge() {
    for (int i = 0; i < this.cart.size(); i++) {
      for (int k = i + 1; k < this.cart.size(); k++) {
        if (this.cart.get(i).canMerge(this.cart.get(k))) {
          cart.add(this.cart.get(i).merge(this.cart.get(k)));
          cart.remove(this.cart.get(i));
          cart.remove(this.cart.get(k));
        } // if merge possible
      } // for
    } // for
  } // merge()

} // Cart class
