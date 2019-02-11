package csc207.habteked.layout;

import java.io.PrintWriter;

public class Expt {
  
  
  
  
  public static void main (String[] args) throws Exception {
    
   
    
    Grid test = new Grid(4,6, '*');
   // test.row(3);
    
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println("Testing row(i): " + test.row(9));
    
    
    TBUtils.print(pen, new BoxedBlock(new Grid(4, 6, '*')));

   // TextBlock block = new VComposition(new TextLine("Hello"), new TextLine("Goodbye"));
    
  
   // TextBlock block2 = new TruncatedBlock(block, 3);
   // TBUtils.print(pen, block);
    //TBUtils.print(pen, block2);
    
    TextBlock top = new CenteredBlock(new TextLine("Hello"), 11);
    TextBlock bottom = new CenteredBlock(new TextLine("Goodbye"), 11);
    TextBlock block = new BoxedBlock(new VComposition(top,bottom));
    TBUtils.print(pen, block);

    
    
  }
  
  
  

}
