/**
 * SuperArray by Team MarvelvsDC
 * First Last
 * collaborators: First Last, First Last
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    data = new int[size];

    //init instance vars
    numberElements = 0;

  }


  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
    data = new int[10];

    //init instance vars
    numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    if (data.length == numberElements) {
      grow();
    }

    // add item
    data[numberElements] = value;

    // increment numberElements
    numberElements++;

  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    return numberElements < 1;
  }


  public int get(int index)
  {
    //return item at index
    return data[index];
  }


  public String toString()
  {
    //return stringified version of this Object
    String s = "";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    // shift items down to remove the item at index
    for( int p = index; p < numberElements; p++ ) {
      if (p+1 < numberElements) { //make sure there is more array to the right...
        data[p] = data[p+1];
      }
    }

    // subtract fom numElements;
    numberElements--;
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    if (data.length == numberElements) {
      //if not, add capacity
      grow();
    }

    // shift elements toward the end of the array
    for( int p = numberElements; p > 0; p-- ) {
      data[p] = data[p-1];
    }

    // insert new element
    data[index] = value;

    // increment numElements
    numberElements++;
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    // A: magicks
    int[] newArr = new int[2*data.length];

    // copy over all the elements from the old array to the new one
    for( int i = 0; i < numberElements; i++ ) {
      newArr[i] = data[i];
    }

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    // A: erase one arrow, draw another
    data = newArr;
  }//end grow()

}//end class
