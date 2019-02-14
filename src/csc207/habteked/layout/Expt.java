package csc207.habteked.layout;

import java.io.PrintWriter;

public class Expt {
  /**
   * Tests for implementations of TextBlock
   * Not all tests ran are included. For example, Truncate
   * was tested but is not included here.
   */
  public static void main(String[] args) throws Exception {

    // Testing Grid
    Grid test = new Grid(4, 6, '*');
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println("Testing row(i): " + test.row(4));
    TBUtils.print(pen, new BoxedBlock(new Grid(4, 6, '*')));

    // Old tests
    // TextBlock block = new VComposition(new TextLine("Hello"), new TextLine("Goodbye"));
    // TextBlock block2 = new TruncatedBlock(block, 3);
    // TBUtils.print(pen, block);
    // TBUtils.print(pen, block2);

    // Testing RightJustified (also ran with CenteredBlock)
    TextBlock top = new RightJustified(new TextLine("Hello"), 11);
    TextBlock bottom = new RightJustified(new TextLine("Goodbye"), 11);
    TextBlock block = new BoxedBlock(new VComposition(top, bottom));
    TextBlock b2 = new BlockPair(block);
    TBUtils.print(pen, b2);

    TextLine tb1 = new TextLine("Hello");
    TextLine tb2 = new TextLine("World");
    //Old test
    // TextBlock compound = new CenteredBlock(new VComposition(tb1, tb2), 7);
    TextBlock compound = new BoxedBlock(
        new CenteredBlock(new BoxedBlock(new CenteredBlock(new VComposition(tb1, tb2), -3)), 15));
    
    // PART B TESTS: Print and reset contents
    pen.println("ORIGINAL");
    TBUtils.print(pen, compound);
    tb2.setContents("Someone");
    pen.println("UPDATED");
    TBUtils.print(pen, compound);
    tb1.setContents("Nice to meet you,");
    pen.println("RE-UPDATED");
    TBUtils.print(pen, compound);
  } // main

} // Expt class
