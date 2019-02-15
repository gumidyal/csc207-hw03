package com.mcfarevee.groceries;

/**
 * Creates a collection of BulkFood items
 * 
 * @author Ally Rogers - rogersal@grinnell.edu
 * @author Kedam Habte - habteked@grinnell.edu
 */
public class BulkItem implements Item {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  
  /**
   * Information about the BulkItem and store supply
   */
  BulkFood food;

  /**
   * The unit of measurement for the BulkItem
   */
  Unit unit;

  /**
   * The amount of BulkItem desired
   */
  int amount;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new BulkItem of the given type of BulkFood
   * 
   * @pre amount > 0
   */
  public BulkItem(BulkFood food, Unit unit, int amount) {
    this.food = food;
    this.unit = unit;
    this.amount = amount;
  } // BulkItem(BulkFood food, Unit unit, int amount)

  // +-----------+---------------------------------------------------
  // | Accessors |
  // +-----------+
  
  /**
   * Get the name of the food
   */
  public String getName() {
    return this.food.name;
  } // getName()
  
  /**
   * Return a string that contains the number of units of the BulkItem, type of unit, and type of
   * bulk food
   */
  public String toString() {
    String result = this.amount + " " + this.unit.toString() + " of " + this.food.name;
    return result;
  } // toString()
  
  /**
   * Return the total weight of the BulkItem requested
   */
  public Weight getWeight() {
    Weight result = new Weight(this.unit, this.amount);
    return result;
  } // getWeight()

  /**
   * Return the total price of the BulkItem requested
   */
  public int getPrice() {
    return this.amount * this.food.pricePerUnit;
  } // getPrice()
  
  /**
   * Returns the amount of BulkFood items
   */
  public int getCount() {
    return 1;
  } // getCount()
  
  /**
   * Get the food
   */
  public BulkFood getFood() {
    return this.food;
  } // getFood()
  
  /**
   * Get the unit
   */
  public Unit getUnit() {
    return this.unit;
  } // getFood()
  
  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Checks if this BulkItem is identical to other given BulkItem
   * 
   * @return true if identical, otherwise false
   */
  public boolean equals(BulkItem other) {
    if (this.food.equals(other.food) && this.unit.equals(other.unit)
        && this.amount == other.amount) {
      return true;
    } else
      return false;
  } // equals(BulkItem other)
  
  /**
   * Checks if this BulkItem can merge with other BulkItem
   */
  public String canMerge() {
    String result = this.unit.toString() + " of " + this.food.name;
    return result;
  } // canMerge()
  
  /**
   * Merges two identical bulk items 
   */
  public BulkItem merge(BulkItem other) {
    if (this.equals(other)){
      BulkItem result = new BulkItem(this.food, this.unit, (this.amount + other.amount)); 
      return result;
    } // if
    return this;
  } // merge()
 
  /**
   * Cannot merge with non BulkItem
   * 
   * @returns this Item
   */
  public Item merge(Item other) {
    return this;
  } // merge()

} // BulkItem class


