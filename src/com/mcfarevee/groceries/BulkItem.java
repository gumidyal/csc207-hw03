package com.mcfarevee.groceries;

public class BulkItem implements Item {

  BulkFood food;
  Unit unit;
  int amount;

  public Weight getWeight() {

    Weight result = new Weight(this.unit, this.amount);
    return result;
  }


  public int getPrice() {


    return this.amount * this.food.pricePerUnit;
  }



  public String toString() {

    String result = this.amount + " " + this.unit.toString() + " of " + this.food.name;

    return result;
  }


  public boolean equals(BulkItem other) {

    if (this.food.equals(other.food) && this.unit.equals(other.unit)
        && this.amount == other.amount) {
      return true;
 
    } else
      return false;
  }



}


