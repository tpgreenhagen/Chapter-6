/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;

public class ch6intro_to_array

{
    final static int MAX = 15;

public static void main (String[] args)
{

    //<>indicates the type of ArrayList
// ArrayList <String> farm = new ArrayList<>();
// 
// // farm.add("Buffalo");
// // farm.add("Yak");
// for (int i = 0; i<20; i++){
// farm.add("Ox");
// farm.add("Buffalo");
// farm.add("Buffalo");
// farm.add("Buffalo");
// farm.add("Buffalo");
// farm.add("Yak");
// farm.add("Bison");
// 
// 
// }
// 
// System.out.println(farm);
// int count = 0;
// for (int i = 0; i<farm.size();){
// if (farm.get(i).equals("Buffalo")){
// count++;
// }
// if(farm.get(i).equals("Buffalo")){//while
// farm.remove(i);
// //i--;
// 
// }
// else
// i++;
// }
// System.out.println("There were "+count+" Buffalos");
// 
// System.out.println(farm);

        ArrayList <CD> List = new ArrayList<>();
        List.add(new CD("Buffalo","Da Bills",12,12));
        System.out.println(List);
        int [][] list = new int[10][10];
//         mathy math = new mathy();
//         int x = 50;
//         int[] num = new int[8];
//         int[] num5 = new int[10000];
//         int[] values = new int[20];
//         int[] oddnum = new int[num.length];
//         int[] evennum = new int[num.length];
//         int[] negnum = new int[MAX];
//         
//        Random gen = new Random();
//        //int[] num = new int[20];
// // pop with random numbers range -50 to 50
// 
//        for(int i =0; i<num.length; i++)
//        {
//             num[i] = gen.nextInt(100)-50;
//         }
// 
// //        for(int i =num.length -20; i<num.length; i++)
// //        {
// //             System.out.println( num[i] );
// //         }
// //         System.out.println("----------SORTING-----------"  );
//         
// //         foo(num);
// //             System.out.println(num[0]);
//             
// //        oddnum = math.getOdd(num);
//        //evennum = math.getEven(num);
//        //evennum = math.getEven(num, evennum);
// // 
// //        for (int s : oddnum)
// //         {
// //             if (s != 0)
// //             System.out.println(s);
// //         }
// // 
// //         System.out.println("\n\n"  );
// //         for (int s : evennum)
// //         {
// //             if (s != 0)
// //             System.out.println(s);
// //         }
// 
// //     for (int s : evennum)
// //         {
// //             
// //             System.out.println(s);
// //         }
// 
// //         int look = 5;
// // 
// //      
// //          System.out.println(Searches.linearSearch(num5,look)  );
// //          Sorts.selectionSort(num5);
// //          System.out.println(Searches.binarySearch(num5,look)  );
// 
// 
// //        for(int i =num.length -20; i<num.length; i++)
// //        {
// //             System.out.println( num[i] );
// //         }
// //         System.out.println("\n\n"  );
// //         Sorts.selectionSort(num);
//         //Sorts.insertionSort(num);
// //          for(int i =num.length -20; i<num.length; i++)
// //        {
// //             System.out.println( num[i] );
// //         }
// /**
// 
// /*
// 
//         //Sorts.selectionSort(num);
//         System.out.println(num.length  );
//         num = doubleSize(num);
// 
// 
//         for (int s : num)
//         {
//         }
// 
// 
// /*      odd(num,oddnum);
// 
//         System.out.println("---------------");
// 
//         for (int s : oddnum)
//             System.out.println(s);
// 
// 
// 
// /*
//         System.out.println("Enter a number");
//         int find = Keyboard.readInt();
// 
//         System.out.println(Searches. binarySearch(num,find));
// 
//    /*
// //searching for 412
//           for (int i = 0; i < MAX; i++)
//           x++;
// 
//       // for (int i = 0; i < MAX; i++)
//         //  values[num[i]+25] ++;
//         //  x++;
//         //how do you count the #of times each value comes up?
// 
//        for( int i =0; i<num.length; i++)
//             System.out.print("\t" + num[i]);
// 
//        //for (int i = 0; i<50;i++)
//        //   System.out.println("The number of times" + (i-25) +"is" +
//        //                       "\t" + values[i]);
// 
// 
// 
// 
// /*
//        //   foo(num[7]);
// 
//        System.out.println(oddnum[7]);
// 
//        odd(num,oddnum);
// 
//        negnum = neg(num);
// 
//  */
// 
// 
// int [][] scores = {{1,2,3},{2,2,3},{3,2,3},{4,2,3}};
// System.out.println(scores[1][0]);
// System.out.println(scores[0].length);
// System.out.println(scores[3].length);
// 
// 
// int [][] table = new int [5][10];
// for (int i = 0; i <scores.length;i++){
// for (int j = 0; j <scores[i].length;j++)
//     System.out.print(scores[i][j]+" ");
//     System.out.println();}
//     System.out.println("\n");
//     
// for (int i = 0; i <table.length;i++){
// for (int j = 0; j <table[i].length;j++)
// table[i][j] = i * 10 + j;
// 
// 
// }
// 
// for (int i = 0; i <table.length;i++){
// for (int j = 0; j <table[i].length;j++)
//     System.out.print(table[i][j]+" ");
//     System.out.println();}
// int total = 0;
//     for (int i = 0; i <table.length;i++){
// for (int j = 0; j <table[i].length;j++)
//     total += table[i][j];
// }
// System.out.println(total);
// 
// System.out.println(math.sum2DArray(scores));
// 
// System.out.println("\n");
// System.out.println(math.sumOneRow2DArray(scores[0]));
// System.out.println(math.sumOneRow2DArray(scores));
// System.out.println(math.sumOneRow2DArray(0,scores));
// 
// System.out.println("\n");
//   int i = 0;
// for (int j = 0; j <scores[i].length;j++)
// System.out.println(math.sumOneCol2DArray(j,scores));

}// end of main

   public static int[] doubleSize(int[] array)
   {


        return array;


   }
    
   //Passing int by value
   public static void foo(int x)
   {
       x=100;

   }


   //arrays are passed by reference
    public static void foo(int [] num)
      {
          num[0] = 10000;
      }




   public static void odd(int[] m_num, int[] m_odd)
   {

       int count =0;


   }// end of odd

 //====================================================
//      public static int[] neg(int[] m_num)
//       {
// 
// 
//        return negarray;
//    }//end of neg

    /*  */
}// end of class











