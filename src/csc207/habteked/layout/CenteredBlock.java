package csc207.habteked.layout;

public class CenteredBlock implements TextBlock {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  
  /**
   * The TextBlock to be centered
   */
  TextBlock tb;
  
  /**
   * The width of the new centered block
   */
  int width;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new centered block of the specified width
   * 
   * @pre width > the width of tb
   * @exception Exception if precondition not met
   */
  public CenteredBlock(TextBlock tb, int width) throws Exception {
    if (width < tb.width()) {
      throw new Exception("Invalid width");
    } // if row invalid
    
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
   * @throws Exception if block width greater than given width
   */
  public String row(int i) throws Exception {
    // Check i is a valid row
    if (i < 0 || i >= this.tb.height()) {
      throw new Exception("Invalid row " + i);
    } // if row invalid
    
    // Check width is valid
    if (this.tb.width() > this.width) {    
      throw new Exception("Error: Block width greater than given width");
    } // if
    
    String str = new String(this.tb.row(i));
    int numspace = (this.width - this.tb.width()) / 2;
    String spaces = "";
    // Adding the number of spaces until it reaches numspace
    for (int j = 0; j < numspace; j++) {
      spaces = spaces + " ";
    } // for
    
    // Create a string of the centered row
    String center = spaces + str + spaces;
    if (center.length() < this.width) { // Check result is correct length
      center = center + " ";
    } // if
    
    return center;
  } // row(int i)

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

} // CenteredBlock class
