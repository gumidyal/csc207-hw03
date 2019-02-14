package com.mcfarevee.groceries;

/**
 * Creates a package Item
 * 
 * @author Ally Rogers - rogersal@grinnell.edu
 * @author Kedam Habte - habteked@grinnell.edu
 */
public class Package implements Item {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  
  /**
   * Name of package
   */
  String name;
  
  /**
   * Total weight of package
   */
  Weight weight;
  
  /**
   * Total price of package
   */
  int price;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new Package with the given name
   * 
   * @pre price >= 0
   */
  public Package(String name, Weight weight, int price) {
    this.name = name;
    this.weight = weight;
    this.price = price;
  } // Package(String name, Weight weight, int price)

  // +-----------+---------------------------------------------------
  // | Accessors |
  // +-----------+
  
  /**
   * Get the name of the package
   */
  public String getName() {
    return this.name;
  } // getName()
  
  /**
   * Return a string that contains the weight of the package and its name
   */
  public String toString() {
    String result =
        this.weight.amount + " " + this.weight.unit.toString() + " package of " + this.name;
    return result;
  } // toString()

  /**
   * Returns the weight of the package
   */
  public Weight getWeight() {
    return this.weight;
  } // getWeight()

  /**
   * Returns the price of the package
   */
  public int getPrice() {
    return this.price;
  } // getPrice()
  
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Checks if this Package is identical to other given Package
   * 
   * @return true if identical, otherwise false
   */
  public boolean equals(Package other) {
    if (this.name.equals(other.name) && this.weight.equals(other.weight)
        && this.price == other.price) {
      return true;
    } else {
      return false;
    } // else
  } // equals(Package other)

} // Package class
