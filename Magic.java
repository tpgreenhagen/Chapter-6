

/**
 * Tanner Greenhagen
 * 2/13/17
 * Magic Class 
 * This will test to see if the square is magic
 */
public class Magic
{
    //Initialize variables
    int [] [] square;
    int mn = 0;

    /**
     * Default constructor for objects of class Magic
     * Takes a 2d list
     * Gets the sum of the first row that will only be returned
     * if the square is magic
     */
    public Magic(int [][] square)
    {
       this.square = square;
       
      
        for (int j = 0; j<square[0].length;j++){
            this.mn += square[0][j];
        
        }
        
       
        
    }
    
    /**
     * setMagicSquare
     * Takes a 2D array
     * Sets the square to the new square
     */
     public void setMagicSquare(int [][] array)
    {
        this.square = array;
        this.mn = 0;
        
         for (int j = 0; j<square[0].length;j++){
            this.mn += square[0][j];
        
        }

    }
    
    /**
     * isMagic()
     * Tests to see if the square is magic
     * Returns a boolean response
     */
     public boolean isMagic(){
        Magic sq = new Magic(square);
        //Loops through the rows
        for (int j = 0; j<square.length;j++){
        
        //Loops through the columns
        for (int i = 0;i<square[0].length;i++)
        {
            //Displays 
            System.out.print(square[j][i]+" ");
        }
        //Moves to next line
            System.out.println();
        }
        
        //Returns if the square is magic or not
        if (sq.test_h() == true && sq.test_v() == true && sq.test_d() == true)
        return true;
        else 
        return false;
    }
    
    /**
     * getMagicNumber()
     * Returns the magic number
     */
    public int getMagicNum(){
        return mn;
    }
    
    /**
     * test_h()
     * Tests the rows to see if they add up to the magic number
     * Returns true or false
     */
    public boolean test_h(){
        //Initialize variables
    int test = 0;
    int add = 0;
    
    //Loops through the rows
    for (int j = 0; j<square.length;j++){
        //Loops through the columns
        for (int i = 0;i<square[0].length;i++)
        {
            //Adds up the row
            add += square[j][i];
        }
        //Checks to see if it is magic
        if (add != mn)
            test = 1;
            
            //Resets the total
            add = 0;
    }
    
    //Returns true if the rows are magic
    if (test == 0)
    return true;
    else
    return false;
    }
    
    /**
     * test_v()
     * Tests the columns to see if they add up to the magic number
     * Returns true or false
     */
    public boolean test_v(){
        
        //Initialize variables
    int test = 0;
    int add = 0;
    
    //Loops through the rows
    for (int j = 0; j<square.length;j++){
        
        //Loops through the columns
        for (int i = 0;i<square[0].length;i++)
        {
            //Adds up the columns
            add += square[i][j];
        }
        
        //Checks to see if it is magic
        if (add != mn)
            test = 1;
            
            //Resets the total
            add = 0;
    }
    
    
    //Returns true if the columns are magic
    if (test == 0)
    return true;
    else
    return false;
    }
    
    /**
     * test_d()
     * Tests the diagonals to see if they add up to the magic number
     * Returns true or false
     */
    public boolean test_d(){
     
        //Initialize variables
        int test = 0;
        int add = 0;
        
        //Loops from top left to bottom right
    for (int i = 0,j=0;i<square.length;i++,j++){
        //Adds the numbers up
     add+= square[i][j];
    }
    
    //Checks to see if it is magic
    if (add != mn)
            test = 1;
            
            //Resets the total
            add = 0;
            
            //Loops from top right to bottom left
    for (int i = 0,j=square.length-1;j>-1;i++,j--){
     add+= square[i][j];
    }
    
    //Checks to see if it is magic
    if (add != mn)
            test = 1;
            
    
    //Returns true if the diagonals are magic
    if (test == 0)
    return true;
    else
    return false;
    
    }

}
