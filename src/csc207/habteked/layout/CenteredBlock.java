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
    // Check width is valid
    
    if (this.tb.width() > this.width) {
     // System.out.println("tb wid: " + this.tb.width() + "wid: " + this.width());      
      throw new Exception("Error: String length greater than given width");
    }
    
    String str = new String(this.tb.row(i));

    int numspace = (this.width - this.tb.width()) / 2;

    String spaces = "";

    // adding the number of spaces until it reaches numspace

    for (int j = 0; j < numspace; j++) {
      spaces = spaces + " ";
    }


    String center = spaces + str + spaces;
    
    if (center.length() < this.width) { // Check result is correct lenght
      center = center + " ";
    } // if

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
