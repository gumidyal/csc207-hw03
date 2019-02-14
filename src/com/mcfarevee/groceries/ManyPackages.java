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
  public int getCount() {
    return this.count;
  } // getCount()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Checks if this ManyPackages is identical to other given ManyPackages
   * 
   * @return true if identical, otherwise false
   */
  public boolean equals(ManyPackages other) {
    if (this == other) {
      return true;
    } else
      return false;
  } // equals(ManyPackages other)
  
  /**
   * Checks if this ManyPackages can merge with other Package
   */
  public boolean canMerge(Package other) {
    if (this.type.equals(other)) {
      return true;
    }
    else return false;
  } // canMerge(Package other)
  
  /**
   * Checks if this ManyPackages can merge with other ManyPackages
   */
  public boolean canMerge(ManyPackages other) {
    if (this.equals(other)) {
      return true;
    }
    else return false;
  } // canMerge(ManyPackages other)
  
  /**
   * Checks if this ManyPackages can merge with non-Package or ManyPackages
   * 
   * @returns false
   */
  public boolean canMerge(Item other) {
    return false;
  } // canMerge(Item other)
  
  /**
   * Merges a ManyPackages item with an identical Package item
   */
  public ManyPackages merge(Package other) {
    if (this.type.equals(other)){
      ManyPackages result = this;
      result.count++;
      return result;
    } // if 
    return this;
  } // merge()
 
  /**
   * Merges two identical ManyPackage items
   */
  public ManyPackages merge(ManyPackages other) {
    if (this.equals(other)){
      ManyPackages result = this;
      result.count += other.getCount();
      return result;
    } // if
    return this;
  } // merge()
  
  /**
   * Cannot merge with non Package or ManyPackages
   * 
   * @returns this Item
   */
  public Item merge(Item other) {
    return this;
  } // merge()

} // ManyPackages class
