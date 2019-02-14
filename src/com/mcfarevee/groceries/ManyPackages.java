package com.mcfarevee.groceries;

/**
 * Creates a collection of Packages
 * 
 * @author Ally Rogers - rogersal@grinnell.edu
 * @author Kedam Habte - habteked@grinnell.edu
 */
public class ManyPackages implements Item {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The type of package contained by ManyPackages
   */
  Package type;

  /**
   * The number of packages in ManyPackages
   */
  int count;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Creates new collection of packages
   * 
   * @pre count > 0
   */
  public ManyPackages(Package type, int count) {
    this.type = type;
    this.count = count;
  } // ManyPackages(Package type, int count)
  
  // +-----------+---------------------------------------------------
  // | Accessors |
  // +-----------+
  
  /**
   * Get the name of the package
   */
  public String getName() {
    return this.type.name;
  } // getName()

  /**
   * Returns a string that contains the number of packages, and information about a given package
   * (number of units, type of unit, type of food)
   */
  public String toString() {
    String result = new String(this.count + " x " + this.type.toString());
    return result;
  } // toString()

  /**
   * Returns the total weight of ManyPackages: Package weight * number of packages
   */
  public Weight getWeight() {
    Weight result = new Weight(this.type.weight.unit, this.type.weight.amount);
    result.amount *= this.count;
    return result;
  } // getWeight()

  /**
   * Return the total price of all packages within ManyPackages
   */
  public int getPrice() {
    return this.type.price * this.count;
  } // getPrice()
  
  /**
   * Returns the number of packages
   */
  public int getNum() {
    return this.count;
  } // getNum()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Checks if this ManyPackages is identical to other given ManyPackages
   * 
   * @return true if identical, otherwise false
   */
  public boolean equals(ManyPackages other) {
    if (this.type.equals(other.type) && this.count == other.count) {
      return true;
    } else
      return false;
  } // equals(ManyPackages other)

} // ManyPackages class
