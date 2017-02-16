
/**
 * Game_of_Nim 
 * 2/9/17
 * Tanner G./ Sam W.
 * This will allow you to play the game of nim
 */

import java.util.*;
public class Game_of_Nim
{
   public static void main(String [] args){
    
    //Made the scanner   
    Scanner keyboard = new Scanner(System.in);
    
    //Made the board
    String[] [] board = new String [3][8];
    
    //Made the math object
    mathy math = new mathy();
    
    //Initialize number of orbs in each row
    for (int i = 0; i<3;i++){
    board[0][i] = "O";}
     for (int i = 0; i<5;i++){
    board[1][i] = "O";}
     for (int i = 0; i<8;i++){
    board[2][i] = "O";}
    
    //Create player array
    String[][] players =new String [2][2];
    players[0][0] = "1";
    

    //Get player one's name
    System.out.println("Player 1, what would you like your name to be?");
    players [0][1] =keyboard.nextLine();
  
    //Get player two's name
    System.out.println("Player 2, what would you like your name to be?");
    players [1][1] =keyboard.nextLine();

    //Initialize running variable and player index
    int up = 0;
    int go = 1;
    
    
   //Will continue until someone wins
  while (go == 1){
        
      //Initialize variable in charge of allowing players to switch
        int run = 1;
        
        //Continues until correct inputs
    while (run == 1){
        
        //Display player that is up
        System.out.println("It is "+ players[up][1]+"'s turn");
        run = 0;
        
        //Display board
        math.display(board);
        
        //Asks for row and orbs
    System.out.println("What row would you like to take from: ");
    int row = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("How many pieces would you like to take");
    int pick = keyboard.nextInt();
    
    //Checks for invalid row or orb count
    if (row <1 || row >3||pick <1){
        run = 1;
        System.out.println("Bad entry\n");
     }
     
     //Runs if row is correct
    else{
        
        //Initialize variables
        int place = 0;
        row -=1;
        int num = 0;
        
        //Finds how many orbs are in the selected row
        for (int i =0; i<board[0].length; i++){
        if (board[row][i] == "O")
        num ++;
        }
        
        //Checks to see if picked orbs is greater than orbs in the row
        if (num < pick){
        run = 1;
        System.out.println("Bad entry\n");}
        
        //Runs if valid number of orbs
        else{
            
            //Gets location of furthest O from the left
        for (int i = board[row].length-1; i>-1; i--)
            if (board[row][i] == "O"){
                place = i;
                i = -1;}
              
        //Replaces Os with nothing
        for (int i = pick; i>0; i--){
            board [row][place] = "";
            place -=1;
        
        }
        
        }
    
    }
   }
   //Initializes game winning test variables
    int con = 0;
    int row = 0;
    
    //Checks to see if there are Os left in the rows
    for (;row <3; row++){
   for (int i = board[row].length-1; i>-1; i--){
            if (board[row][i] == "O"){
                con +=1;
            }
            
        }}
        
    
    //Switches who is up
    if (up == 1)
    up = 0;
    else
    up = 1;
    
    //Checks to see if someone won
    if (con == 0){
    go = 0;
    
    
    }}
    
    
//Prints the winner and their name
System.out.println(players[up][1]+" WINS");
}
    
    
    
    
    }

