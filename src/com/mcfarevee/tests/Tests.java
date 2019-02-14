package com.mcfarevee.tests;

import com.mcfarevee.groceries.*;
import com.mcfarevee.groceries.Package;
import com.mcfarevee.shopping.Cart;
import java.io.PrintWriter;

public class Tests {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    
    // The store has 20 pounds of bananas, priced at 50 cents per pound
    BulkFood bananas = new BulkFood("bananas", Unit.POUND, 50, 20);
    // The store has 200 grams of saffron, priced at 1000 cents per gram
    BulkFood saffron = new BulkFood("saffron", Unit.GRAM, 1000, 200);
    
    Cart cart = new Cart();
    pen.println("Cart made");

    // The customer adds three pounds of bananas to the cart
    cart.addItem(new BulkItem(bananas, Unit.POUND, 3));
    
    // The customer adds a bag of 1 gram of saffron to the cart
    cart.addItem(new BulkItem(saffron, Unit.GRAM, 1));

    // The customer adds a can opener to the cart, priced $3.489.
    cart.addItem(new NonFood("can opener", new Weight(Unit.OUNCE, 2), 349));

    // The customer adds a box of oreos to the cart
    cart.addItem(new Package("oreos", new Weight(Unit.OUNCE, 12), 399));

    // The customer adds five 6oz packages of macncheez to the cart, each 
    // priced at 77 cents.
    cart.addItem(new ManyPackages(new Package("macncheez", 
        new Weight(Unit.OUNCE, 6), 77), 5));
    pen.println("addItem");

  } // main(String[] args)
} // Tests class
