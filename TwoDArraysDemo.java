/*
Darwin Hanson
12/16/2021
   
Two-D Arrays demo will show declaring a 2-dimensional
and accessing its elements.
*/
import java.util.Arrays;

public class TwoDArraysDemo {
   public static void main(String[] args) {
      // declare a 2D array using "new" keyword
      int rows = 2;
      int cols = 3;
      int[][] first = new int[rows][cols];
      
      // assign some values to the 2D array
      first[0][0] = 1;
      first[0][1] = 2;
      first[0][2] = 3;
      first[1][0] = 4;
      first[1][1] = 5;
      
      // print out the array using deepToString() method
      System.out.println(Arrays.deepToString(first));
      
      // create a 2D array using the { } initializer list syntax
      int[][] second = { { 1, 3, 5, 7 },
                         { 2, 4, 6, 8 },
                         { 0, 1, 2, 3 } };

      // print out the array using deepToString() method
      System.out.println(Arrays.deepToString(second));
   }
}
