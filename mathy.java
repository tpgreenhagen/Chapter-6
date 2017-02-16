import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
//import javax.swing.*;

public class mathy
{
    private int [][] square;
    int mn = 0;

    /**
        default constructor - stubed in

    */
    public mathy()
    {
        
    }

    public mathy(int [][] array)
    {
        square = array;

    }

     public void setMagicSquare(int [][] array)
    {
        this.square = array;

    }

    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
    */
    public int abs (int x)
    {
        if (x < 0)
            x = -x;

        return x;



    }//end of abs



    public boolean isMagic(){
        Magic sq = new Magic(square);
        if (sq.test_h() == true && sq.test_v() == true && sq.test_d() == true)
        return true;
        else 
        return false;
    }
    
    public int getMagicNum(){
        
        return mn;
    }

//}end of class
    /**
     * display()
     * This will display the nim board
     * Takes a String array
     */
    public void display(String[][] num){
     for ( int i=0; i < num.length; i++)
        {
            System.out.print((i+1)+":  ");
            for ( int j=0; j < num[i].length; j++){
                if(num[i][j] != null)
                System.out.print(num[i][j]);}
            System.out.println("");}
    }



    /**
        takes the odd numbers out of an array
        @param int[] values
        @return int[] odd values in the array
    */

    public  int[] getOdd ( int[] num1)
    {   int i = 0;
        int [] odd = new int[num1.length];
        
        for (int j = num1.length-1;j>=0;j--){
            if (num1[j]%2 != 0)
                odd[j] = num1[j];
            
        
        
        }
        return odd;


    }//end of getOdd


    /**
        takes the even numbers out of an array
        @param int[] values
        @param int[] num
        @return int[] even values in the array
    */

    public void getEven(int[] num, int evennum[]){
        int i = 0;
        int [] even = new int[num.length];
        
        for(;i>num.length-1;i++){
        if (num[i]%2 == 0)
            evennum[i] = num[i];
            
        
        
        }
    
    
    }


    public int[] getEven(int[] num1)
    {
        int i = 0;
        int [] even = new int[num1.length];
        
        for (int j = num1.length-1;j>=0;j--){
            if (num1[j]%2 == 0)
                even[j] = num1[j];
            
        
        
        }
        return even;




    }//end of getEven







    /**
        two int parameters and adds them
        @param 2 int values
        @return int sum of values
    */


    public int add (int x, int y)
    {   //System.out.println(sum );
        int sum;      //sum x and y are local var
        sum = x+y;

        return sum;


    }//end of add


    public double add (double x,double y)
    {

        return x+y;
    }

    /**
            message from Mathy class
            @param none
            @return String message
    */


    public String toString()
    {
        return ("Hi what do you want?, I'm just Mathy");

    }


    public void switchThem (int[] a1, int a2[])
    {
        int [] temp = a1;




    }
    public void count(int[] a1, int[] a2)
    {
        for (int i : a1)
            a2[i] ++;



    }


    public static int sum2DArray(int [][] scores)
    {
         int total = 0;
         for ( int i=0; i < scores.length; i++)
        {
            for ( int j=0; j < scores[i].length; j++)

        total += scores[i][j];}

        return total;


       

    }



    public int sumOneRow2DArray(int i, int [] [] scores)
    {   int total = 0;
        
            for ( int j=0; j < scores[i].length; j++)

            total += scores[i][j];

        return total;}

    
         public int sumOneRow2DArray( int [] [] scores)
    {   int total = 0;
        int i = 0;
            for ( int j=0; j < scores[i].length; j++)

            total += scores[i][j];

        return total;}
        
         public int sumOneCol2DArray(int j, int [] [] scores)
         {
            int total = 0;
            
            for ( int i=0; i < scores.length; i++)
            {
            total += scores[i][j];}
            
            return total;
            
            }
        
    public int sumOneRow2DArray(int [] row)
    {   int total = 0;
        
         for ( int i=0; i < row.length; i++)
        {
            total += row[i];}
        return total;

    }



    public int[] sumall2DArray(int [][] scores)
    {
        int [] temp = {1,2,3,4,};




        return temp;
    }

    /**
        Doubles the size of an array
        @param int []
        @return int [] twice the size, with values copied over
    */
   public static int[] doubleSize(int[] array)
   {
       //make temp 2 times the size of array
       int[] temp = new int[array.length * 2];
       System.out.println(temp.length +"-" );

        //copy all the values over to new array
       for (int i = 0; i < array.length; i++)
            temp[i] = array[i];

        //old array changes reference to new larger array
       array = temp;

        return array;

   }

















}//end of class