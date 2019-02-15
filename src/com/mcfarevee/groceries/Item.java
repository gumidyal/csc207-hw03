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
  
  /**
   * Get the name of the Item
   */
  public String getName();
  
  /**
   * Get count of the Item
   */
  public int getCount();
  
  /**
   * Checks if two Items can merge
   */
  public String canMerge();
  
  /**
   * Merge two items if possible
   */
  public Item merge(Item other);
  
} // interface Item
