package csc207.habteked.layout;

import java.io.PrintWriter;

public class Expt {



  public static void main(String[] args) throws Exception {



    Grid test = new Grid(4, 6, '*');
    // test.row(3);

    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println("Testing row(i): " + test.row(9));


    TBUtils.print(pen, new BoxedBlock(new Grid(4, 6, '*')));

    // TextBlock block = new VComposition(new TextLine("Hello"), new TextLine("Goodbye"));


    // TextBlock block2 = new TruncatedBlock(block, 3);
    // TBUtils.print(pen, block);
    // TBUtils.print(pen, block2);

    TextBlock top = new RightJustified(new TextLine("Hello"), 11);
    TextBlock bottom = new RightJustified(new TextLine("Goodbye"), 11);
    TextBlock block = new BoxedBlock(new VComposition(top, bottom));
    TextBlock b2 = new BlockPair(block);
    TBUtils.print(pen, b2);

    TextLine tb1 = new TextLine("Hello");
    TextLine tb2 = new TextLine("World");
    // TextBlock compound = new CenteredBlock(new VComposition(tb1, tb2), 7);
    TextBlock compound = new BoxedBlock(
        new CenteredBlock(new BoxedBlock(new CenteredBlock(new VComposition(tb1, tb2), -3)), 15));
    pen.println("ORIGINAL");
    TBUtils.print(pen, compound);

    

    
    
    
    
    
    tb2.setContents("Someone");
    pen.println("UPDATED");
    TBUtils.print(pen, compound);
    tb1.setContents("Nice to meet you,");
    pen.println("RE-UPDATED");
    TBUtils.print(pen, compound);

  }



}
