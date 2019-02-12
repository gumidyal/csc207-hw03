package csc207.habteked.layout;

public class RightJustified implements TextBlock {

  TextBlock tb;
  int width;

  public RightJustified(TextBlock tb, int width) {

    this.tb = tb;
    this.width = width;

  } // TruncatedBlock(TextBlock, int)


  public String row(int i) throws Exception {

    String str = new String(this.tb.row(i));

    int numspace = (this.width - this.tb.width());

    String spaces = "";

    // adding the number of spaces until it reaches numspace

    for (int j = 0; j < numspace; j++) {
      spaces = spaces + " ";
    }


    String right = spaces + str;

    return right;
  }



  public int height() {

    return this.tb.height();

  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width() {

    return this.width;

  } // width()


}
