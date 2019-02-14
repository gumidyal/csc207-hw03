package com.mcfarevee.groceries;

/**
 * Creates non-food Item
 * 
 * @author Ally Rogers - rogersal@grinnell.edu
 * @author Kedam Habte - habteked@grinnell.edu
 */
public class NonFood implements Item {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  
  /**
   * Name of the non-food item
   */
  String name;
  
  /**
   * Weight of the non-food item
   */
  Weight weight;
  
  /**
   * Price of the non-food item
   */
  int price;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create new non-food item
   * 
   * @pre price >= 0
   */
  public NonFood(String name, Weight weight, int price) {
    this.name = name;
    this.weight = weight;
    this.price = price;
  } // NonFood(String name, Weight weight, int price)

  // +-----------+---------------------------------------------------
  // | Accessors |
  // +-----------+
  
  /**
   * Get the name of the non-food
   */
  public String getName() {
    return this.name;
  } // getName()
  
  /**
   * Returns a string that contains the name of the non-food item
   */
  public String toString() {
  return this.name;
  } // toString()

  /**
   * Returns the weight of the non-food item
   */
  public Weight getWeight() {
  return this.weight;
  } // getWeight()

  /**
   * Returns the price of the non-food item
   */
  public int getPrice() {
    return this.price;
  } // getPrice()
  
  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Checks if this NonFood is identical to other given NonFood
   * 
   * @return true if identical, otherwise false
   */
  public boolean equals(NonFood other) {
    if (this.name.equals(other.name) && this.weight.equals(other.weight)
        && this.price == other.price) {
      return true;
    } else {
      return false;
    } // else
  } // equals(NonFood other)

} // NonFood class
