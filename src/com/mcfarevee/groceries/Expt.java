package com.mcfarevee.groceries;

import java.util.ArrayList;
import java.io.PrintWriter;

public class Expt {

  public static void main(String[] args) throws Exception {
    ArrayList<String> lst = new ArrayList<String>();
    PrintWriter pen = new PrintWriter(System.out, true);
    lst.add("hello");
    lst.add("something");
    lst.add("another thing");
    pen.println(lst.get(0));
    pen.println(lst.get(1));
    pen.println(lst.get(2));
    pen.println(lst.size());
    lst.remove(1);
    pen.println(lst.size());
    pen.println(lst.get(0));
    pen.println(lst.get(1));
    pen.println(lst.get(2));
  }
}
