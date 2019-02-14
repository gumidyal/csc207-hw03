package csc207.habteked.layout;

public class BlockPair implements TextBlock {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  
  /**
   * The left TextBlock
   */
  TextBlock right;
  
  /**
   * The right TextBlock
   */
  TextBlock left;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  
  /**
   * Create a new BlockPair
   */
  public BlockPair(TextBlock tb) {
    this.right = tb;
    this.left = tb;
  } // BlockPair

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  /**
   * Return the given row of the BlockPair
   * 
   * @pre i is a valid row number
   * @exception Exception if the precondition is not met
   * @post result is a string of the contents of the entire row i
   */
  public String row(int i) throws Exception {
    if ((i < 0) || (i >= this.left.height())) {
      throw new Exception("Invalid row " + i);
    } // if the row is invalid
    String result;
    result = (this.left.row(i)).concat(this.right.row(i));
    return result;
  } // row(int i)

  /**
   * Determine how many rows are in the block
   */
  public int height() {
    return this.right.height();
  } // height()

  /**
   * Determine how many columns are in the block
   */
  public int width() {
    return this.right.width() + this.left.width();
  } // width()
  
} // BlockPair class
