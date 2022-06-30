// SKELETON SKELETON SKELETON
/**
 * Mancala game by Team BossCoders
 * First Last
 * collaborators: First Last, First Last
 */

/**
 * gameboard as single array, initialized with 4 stones in each pit
 *
 *  M p p p p p p
 *    p p p p p p M
 *
 *  0 4 4 4 4 4 4
 *    4 4 4 4 4 4 0
 *
 *  13th(p) 12th 11th 10th 9th 8th 7th
 *          0th  1st  2nd  3rd 4th 5th  6th(p)
 */


import java.io.*;
import java.util.*;

public class Mancala
{

  public static void printGameboard( int[] gameBoard )
  {
    System.out.println();

    //Print p2's row
    System.out.print("p2 ");

    /* YOUR CODE HERE */

    //Print a new line and a space before P1's row
    System.out.println();
    System.out.print("     ");

    /* YOUR CODE HERE */

    System.out.println("p1");

    System.out.println();
  }


  public static int askPlayer1( int[] gameBoard )
  {
    Scanner in = new Scanner(System.in);

    int pocketIndex;

    do {
      //Send prompting message.
      /* YOUR CODE HERE */

      //Read in their response.
      /* YOUR CODE HERE */

      //If user enters an invalid number prompt them again to enter a number correctly.
      /* YOUR CODE HERE */

    } while( /* YOUR CODE HERE */ );
    return pocketIndex;
  }


  public static int askPlayer2( int[] gameBoard )
  {
    Scanner in = new Scanner(System.in);

    int pocketIndex;

    do {
      //prompt user
      /* YOUR CODE HERE */

      //read in their response
      /* YOUR CODE HERE */

      //If user enters an invalid number, re-prompt
      /* YOUR CODE HERE */

    } while(     /* YOUR CODE HERE */ );
    return pocketIndex;
  }


  public static int playerMove( int[] gameBoard, int pocketIndex, boolean p1Turn )
  {

    int stones; //number of stones in the pocket that will be moved

    //Go to index specified, output the value of stones, then set the value to 0
    /* YOUR CODE HERE */

    //user picks up all stones from that pocket
    /* YOUR CODE HERE */

    while( stones > 0 ) {
      // first, a series of conditional "housekeeping chores" to maintain a valid gameplay state...

      //wrap around if necessary from p2's pit to p1's row
      /* YOUR CODE HERE */

      //players cannot deposit stones in other player's pit
      /* YOUR CODE HERE */


      // now the mechanics of a move...

      //Drop one stone in each subsequent pit
      /* YOUR CODE HERE */

      //Increment pit index by 1
      /* YOUR CODE HERE */

      //Decrement the stones in your hand by 1
      /* YOUR CODE HERE */

    }
    return pocketIndex;
  }


  public static void main(String[] args)
  {

    //Create a static array to represent the starting gameboard
    /* YOUR CODE HERE */

    //showing users initial game board
    /* YOUR CODE HERE */

    //pocket is index from which we're drawing stones
    //player1Turn indicates whether or not it's p1's turn
    int pocket;
    boolean player1Turn;

    //keep playing until either player has no more stones in their pockets
    while(
          /* YOUR CODE HERE */

)
      {

        //First player's turn.
        player1Turn = true;
        pocket =     /* YOUR CODE HERE */


          //Executing first player's move
          pocket =     /* YOUR CODE HERE */


          //if p1's last stone falls in p1's pit, p1 goes again
          if(     /* YOUR CODE HERE */ ) {
            System.out.println("Good move! Go again.");
            printGameboard(startingBoard);
            pocket = askPlayer1(startingBoard);
            pocket = playerMove(startingBoard, pocket, player1Turn);
          }

        printGameboard( startingBoard );

        //Second player's turn.
        player1Turn = false;
        pocket = askPlayer2( startingBoard );

        //Executing second player's move
        pocket = playerMove(startingBoard, pocket, player1Turn);

        //if p2's last stone falls in p2's pit, p2 goes again
        if(pocket == 13){
          System.out.println("Good move! Go again.");
          printGameboard(startingBoard);
          pocket = askPlayer2(startingBoard);
          pocket = playerMove(startingBoard, pocket, player1Turn);
        }
        printGameboard(startingBoard);

      }
    //If one player has 0 stones in their row the game ends
    System.out.print("Game over! ");

    //Calculate the number of stones each player has
    int p1score =     /* YOUR CODE HERE */
      int p2score =     /* YOUR CODE HERE */


      //Print out the winner
      /* YOUR CODE HERE */

      }
}
