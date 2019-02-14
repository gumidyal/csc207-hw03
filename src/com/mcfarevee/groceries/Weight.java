package com.mcfarevee.groceries;

/**
 * Stores a weight (amount and unit of weight)
 * 
 * @author Ally Rogers - rogersal@grinnell.edu
 * @author Kedam Habte - habteked@grinnell.edu
 */
public class Weight {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  
  /**
   * The unit that the weight is in
   */
  Unit unit;
  
  /**
   * The value of the weight
   */
  int amount;
  
  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new Weight with the given units and amount
   * 
   * @pre amount > 0
   */
  public Weight(Unit unit, int amount) {
    this.unit = unit;
    this.amount = amount;
  } // Weight(Unit unit, int amount)
  
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Checks if this Weight is identical to other given Weight
   * 
   * @return true if identical, otherwise false
   */
  public boolean equals(Weight other) {
    if (this.unit.equals(other.unit) && this.amount == other.amount) {
      return true;
    } else {
      return false;
    } // else
  } // equals(Weight other)

} // Weight class