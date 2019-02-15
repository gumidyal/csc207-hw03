package com.mcfarevee.tests;

import com.mcfarevee.groceries.*;
import com.mcfarevee.groceries.Package;
import com.mcfarevee.shopping.Cart;
import java.io.PrintWriter;

public class Tests {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    
    /*
     * Creating store food amounts (check BulkFood)
     */
    // The store has 20 pounds of bananas, priced at 50 cents per pound
    BulkFood bananas = new BulkFood("bananas", Unit.POUND, 50, 20);
    // The store has 200 grams of saffron, priced at 1000 cents per gram
    BulkFood saffron = new BulkFood("saffron", Unit.GRAM, 1000, 200);
    
    /*
     * Initializing cart
     */
    Cart cart = new Cart();
    pen.println("[Cart made]");
    pen.println();
    
    /*
     * Test of Empty Cart cases (Printing results for all methods)
     */
    pen.println("TESTS WITH EMPTY CART");
    pen.println("numEntries w/ empty cart: " + cart.numEntries());
    pen.println("numThings w/ empty cart: " + cart.numThings());
    pen.println("printContents w/ empty cart: ");
    cart.printContents(pen);
    pen.println("getPrice w/ empty cart: " + cart.getPrice());
    pen.println("getWeight w/ empty cart: ");
    cart.printWeights(pen);
    pen.println();
    pen.println("remove w/ empty cart (should return false): " + cart.remove("bananas"));
    pen.println("Reprint contents: ");
    cart.printContents(pen);
    pen.println("merge w/ empty cart");
    cart.merge();
    pen.println("Reprint contents: ");
    cart.printContents(pen);
    pen.println();
    pen.println();

    /*
     * Adding items to cart (Checking all classes from Part C)
     */
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
  
    /*
     * Printing results for all methods
     */
    pen.println("TESTS AFTER ADDING 5 ENTRIES");
    pen.println("numEntries (should be 5): " + cart.numEntries());
    pen.println("numThings (should be 9): " + cart.numThings());
    pen.println("printContents: ");
    cart.printContents(pen);
    pen.println();
    pen.println("getPrice (price should be 2283 cents): " + cart.getPrice());
    pen.println("   How we calculated price: 50c/lb bananas * 3  +  1000c/g saffron * 1");
    pen.println("           + can opener for 349 + oreos for 399 + 77c/oz macncheez * 5 = 2283c");
    pen.println("getWeight (weight should be 3 lb, 44 oz (2 + 14 + 6*5), 1 g, 0 kg): ");
    cart.printWeights(pen);
    pen.println();
    pen.println("remove (should remove bananas and return true): " + cart.remove("bananas"));
    cart.printContents(pen);
    pen.println("Reprint contents: ");
    pen.println();
    pen.println("merge (nothing should be merged): ");
    cart.merge();
    pen.println("Reprint contents: ");
    cart.printContents(pen);
    pen.println();
    pen.println();
    
    /* 
     * Adding items to cart for merge test. 
     * 
     * - We are adding exactly same items except with one field changed
     *   at a time to test our .equals methods. 
     * - Test merge of two Bulk Items
     * - Test merge of three Bulk Items 
     * - Test merge of two ManyPackages and one Package
     * - Test merge of two Packages
     */
    // The customer adds four pounds of bananas to the cart
    cart.addItem(new BulkItem(bananas, Unit.POUND, 4));

    // The customer adds four grams of bananas to the cart
    cart.addItem(new BulkItem(bananas, Unit.GRAM, 4));
    
    // The customer adds a bag of 4 pounds of saffron to the cart
    cart.addItem(new BulkItem(saffron, Unit.POUND, 4));

    // The customer adds a can opener to the cart, priced 2 cents
    cart.addItem(new NonFood("can opener", new Weight(Unit.OUNCE, 2), 2));

    // The customer adds a box of oreos to the cart
    cart.addItem(new Package("oreos", new Weight(Unit.OUNCE, 12), 100));

    // The customer adds five 12oz packages of oreos to the cart, each 
    // priced at 100 cents.
    cart.addItem(new ManyPackages(new Package("oreos", 
        new Weight(Unit.OUNCE, 12), 100), 5));
    
    // The customer adds two 12oz packages of oreos to the cart, each 
    // priced at 100 cents.
    cart.addItem(new ManyPackages(new Package("oreos", 
        new Weight(Unit.OUNCE, 12), 100), 2));
      
    // The customer adds a box of Cornflakes to the cart
    cart.addItem(new Package("CornFlakes", new Weight(Unit.KILOGRAM, 2), 75));
    
    // The customer adds a box of Cornflakes to the cart
    cart.addItem(new Package("CornFlakes", new Weight(Unit.KILOGRAM, 2), 75));
  
  
    pen.println("TESTS PRE-MERGING");
    pen.println("numEntries (should be 13): " + cart.numEntries());
    pen.println("numThings (should be 22): " + cart.numThings());
    pen.println("printContents: ");
    cart.printContents(pen);
    pen.println();
    pen.println("MERGE");
    pen.println("(see comments in code for details about merge)");
    cart.merge();
    pen.println();
    pen.println("TESTS AFTER MERGING");
    pen.println("numEntries (should be 9): " + cart.numEntries());
    pen.println("numThings (should be 22): " + cart.numThings());
    pen.println("printContents: ");
    cart.printContents(pen);
    
    
    
    
    
    
    
    
    
    

  } // main(String[] args)
} // Tests class
