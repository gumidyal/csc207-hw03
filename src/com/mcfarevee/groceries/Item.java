package com.mcfarevee.groceries;

/**
 * Grocery organization for McFare-Vee
 * 
 * @author Ally Rogers - rogersal@grinnell.edu
 * @author Kedam Habte - habteked@grinnell.edu
 */
public interface Item {
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Return the name of the Item and other pertinent information
   */
  public String toString();
  
  /**
   * Get the weight of the Item
   */
  public Weight getWeight();
  
  /**
   * Get the price of the Item
   */
  public int getPrice();
  
} // interface Item
