package csc207.habteked.layout;

public class TruncatedBlock implements TextBlock {

  TextBlock tb;
  int width;


  /**
   * Create a new truncated block of the specified width.
   */
  public TruncatedBlock(TextBlock tb, int width) {

    this.tb = tb;
    this.width = width;

  } // TruncatedBlock(TextBlock, int)

  /**
   * Get the ith row of the block.
   * 
   * @throws Exception
   */
  public String row(int i) throws Exception {

    String str = new String(this.tb.row(i));

    String trunc = str.substring(0, this.width);

    return trunc;

  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height() {

    return this.tb.height();

  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width() {

    return this.width;

  } // width()
} // class TruncatedBlock


