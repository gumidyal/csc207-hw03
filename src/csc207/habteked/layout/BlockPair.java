package csc207.habteked.layout;

public class BlockPair implements TextBlock{
  
  TextBlock tb;
  int width; 
  TextBlock tb2;
 
  
  public BlockPair {
    
   this.width = width;
   this.tb = tb;
   this.tb2 = tb2;
  }
  
  
  

  /**
     * Determine how many rows are in the block.
     */
    public int height() {
      
     return this.tb.height +_this.tb.();
         
    } // height()

  /**
     * Determine how many columns are in the block.
     */
    public int width() {
      
      return this.width;
 
    } // width()
  
  
  
  
  
  
  

}
