package csc207.habteked.layout;

public class CenteredBlock implements TextBlock {

  TextBlock tb;
  int width;



  /**
   * Create a new truncated block of the specified width.
   */
  public CenteredBlock(TextBlock tb, int width) {

    this.tb = tb;
    this.width = width;

  } // TruncatedBlock(TextBlock, int)


  public String row(int i) throws Exception {

    String str = new String(this.tb.row(i));

    int numspace = (this.width - this.tb.width()) / 2;
    // what if space is negative?
    // what if dividing by odd #? -- will give wrong width
    //    e.g. (10 - 5) / 2 = 2, and won't add up to equal 10

    String spaces = "";

    // adding the number of spaces until it reaches numspace

    for (int j = 0; j < numspace; j++) {
      spaces = spaces + " ";
    }


    String center = spaces + str + spaces;

    return center;
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
