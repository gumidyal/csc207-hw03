package csc207.habteked.layout;

/**
 * Truncates a TextBlock to a certain width
 * 
 * @author Ally Rogers - rogersal@grinnell.edu
 * @author Kedam Habte - habteked@grinnell.edu
 */
public class TruncatedBlock implements TextBlock {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The TextBlock to be truncated
   */
  TextBlock tb;

  /**
   * The width of the new truncated block
   */
  int width;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new truncated block of the specified width.
   */
  public TruncatedBlock(TextBlock tb, int width) throws Exception {
    if (width > 0 && tb.width() > width) {
      throw new Exception("Invalid width");
    } // if width too large

    this.tb = tb;
    this.width = width;
  } // TruncatedBlock(TextBlock, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get the ith row of the block.
   * 
   * @pre 0 <= i < this.tb.height()
   * @throws Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
    // Check i is a valid row
    if (i < 0 || i >= this.tb.height()) {
      throw new Exception("Invalid row " + i);
    } // if row invalid

    String str = new String(this.tb.row(i));
    String trunc = str.substring(0, this.width);
    return trunc;
  } // row(int)

  /**
   * Determine how many rows are in the block
   */
  public int height() {
    return this.tb.height();
  } // height()

  /**
   * Determine how many columns are in the block
   */
  public int width() {
    return this.width;
  } // width()

} // class TruncatedBlock


