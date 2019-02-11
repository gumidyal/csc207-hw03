package csc207.habteked.layout;

public class Grid implements TextBlock{

  int width;
  int height;
  char ch;
  
 public Grid(int width, int height, char ch) {
    
    this.width = width; 
    this.height = height;
    this.ch = ch;
    
    
  }
  
  

  public String row(int i) throws Exception{
    //throw an exception here 
    //Exception exception = new Exception("Invalid integer");
 
    String strRow = "";
    String chStr = Character.toString(this.ch);
   
    
    for (int j = 0; j < this.width; j++)
    {
        strRow = strRow + chStr;
    } 
    
    return strRow; 
  }

  /**
   * Determine how many rows are in the block.
   */
  public int height() {
    
    return this.height;
  }

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    return this.width;
  }

  
  
  
  
  
  
  
  
  

  
  

}
