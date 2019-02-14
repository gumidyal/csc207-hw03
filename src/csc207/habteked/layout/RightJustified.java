package csc207.habteked.layout;

public class RightJustified implements TextBlock {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  
  /**
   * The TextBlock to be right-justified
   */
  TextBlock tb;
  
  /**
   * The width of the new right-justified TextBlock
   */
  int width;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Justify the TextBlock to the right within a larger box of given width
   * 
   * @pre width > tb.width()
   * @exception Exception if preconition not met
   */
  public RightJustified(TextBlock tb, int width) throws Exception {
    if (width < tb.width()) {
      throw new Exception("Invalid width");
    } // if precondition not met
    this.tb = tb;
    this.width = width;
  } // TruncatedBlock(TextBlock, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Return a string containing the row at i in the text block
   * 
   * @pre 0 < i <= this.tb.height()
   * @exception Exception if preconiditon not met
   * @exception Exception if block width greater than given width
   */
  public String row(int i) throws Exception {
    if (this.tb.width() > this.width) {
      throw new Exception("Error: String length greater than given width");
    } // if width too small
    
    String str = new String(this.tb.row(i));
    int numspace = (this.width - this.tb.width());
    String spaces = "";

    // adding the number of spaces until it reaches numspace
    for (int j = 0; j < numspace; j++) {
      spaces = spaces + " ";
    } // for
    String right = spaces + str;
    return right;
  } // row(int i)

  /**
   * Return the height of the TextBlock
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

} // RightJustified class
