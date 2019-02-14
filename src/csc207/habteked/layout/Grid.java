package csc207.habteked.layout;

public class Grid implements TextBlock {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The width of the Grid
   */
  int width;

  /**
   * The height of the Grid
   */
  int height;

  /**
   * The character to fill the Grid with
   */
  char ch;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Creates a new grid of the specified dimensions filled with ch characters
   * 
   * @pre width > 0
   * @pre height > 0
   * @throws Exception if preconditions not met
   */
  public Grid(int width, int height, char ch) throws Exception {
    if (width < 0 || height < 0) {
      throw new Exception("Invalid width or height");
    } // if row invalid

    this.width = width;
    this.height = height;
    this.ch = ch;
  } // Grid(int width, int height, char ch)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Return a string containing row i of the Grid
   * 
   * @pre 0 <= i < this.height()
   * @throws Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
    // Check i is a valid row
    if (i < 0 || i >= this.height()) {
      throw new Exception("Invalid row " + i);
    } // if row invalid

    String strRow = "";
    String chStr = Character.toString(this.ch);

    for (int j = 0; j < this.width; j++) {
      strRow = strRow + chStr;
    } // for
    return strRow;
  } // row(int i)

  /**
   * Determine how many rows are in the block
   */
  public int height() {
    return this.height;
  } // height()

  /**
   * Determine how many columns are in the block
   */
  public int width() {
    return this.width;
  } // width()

} // Grid class
