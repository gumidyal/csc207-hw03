package com.mcfarevee.shopping;

import com.mcfarevee.groceries.*;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Cart {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  
  ArrayList<Item> cart;
  String name;
  int numPackages;
  //int numItems;
  int totPrice;
  int totWeight;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  public Cart(String name) {
    this.name = name;
    this.numPackages = 0;
    //this.numItems = 0;
    this.totPrice = 0;
    this.totWeight = 0;
  }

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  public void addItem(Item item) {

  }

  public int numThings() {

  }


  public int numEntries() {


  }


  public void printContents(PrintWriter pen) {

  }


  public int getPrice() {

  }


  public int[] getWeight() {


  }



  public void remove(String name) {
    
  }

  public void merge() {

  }

}


