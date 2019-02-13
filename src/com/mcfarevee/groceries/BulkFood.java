package com.mcfarevee.groceries;

public class BulkFood {

  String name;
  Unit unit;
  int pricePerUnit;
  int supply;

  public BulkFood(String name, Unit unit, int pricePerUnit, int supply) {


    this.name = name;
    this.unit = unit;
    this.pricePerUnit = pricePerUnit;
    this.supply = supply;


  }


  public boolean equals(BulkFood other) {

    if (this.name.equals(other.name) && this.unit.equals(other.unit)
        && this.pricePerUnit == other.pricePerUnit && this.supply == other.supply) {
      return true;
    } else
      return false;
  }



}
