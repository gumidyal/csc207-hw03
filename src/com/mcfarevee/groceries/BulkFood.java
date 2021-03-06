package com.mcfarevee.groceries;

/**
 * Creates a BulkFood item
 * 
 * @author Ally Rogers - rogersal@grinnell.edu
 * @author Kedam Habte - habteked@grinnell.edu
 */
public class BulkFood {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  
  /**
   * The name of the food
   */
  String name;
  
  /**
   * The unit of measurement for the food
   */
  Unit unit;
  
  /**
   * The price (in cents) for one unit of food
   */
  int pricePerUnit;
  
  /**
   * The amount of the food currently in supply
   */
  int supply;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new BulkFood with the given name
   * 
   * @pre supply > 0
   * @pre pricePerUnit >= 0
   */
  public BulkFood(String name, Unit unit, int pricePerUnit, int supply) {
    this.name = name;
    this.unit = unit;
    this.pricePerUnit = pricePerUnit;
    this.supply = supply;
  } // BulkFood(String name, Unit unit, int pricePerUnit, int supply)

  // +-----------+---------------------------------------------------
  // | Accessors |
  // +-----------+
  
  /**
   * Get the name of the food
   */
  public String getName() {
    return this.name;
  } // getName()
  
  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Checks if this BulkFood is identical to other given BulkFood
   * 
   * @return true if identical, otherwise false
   */
  public boolean equals(BulkFood other) {
    if (this.name.equals(other.name) && this.unit.equals(other.unit)
        && this.pricePerUnit == other.pricePerUnit && this.supply == other.supply) {
      return true;
    } else {
      return false;
    } // else
  } // equals(BulkFood other)

} // BulkFood class
