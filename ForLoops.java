/*
11/17/21
Darwin Hanson

Uses for loops to create different figures.
*/

public class ForLoops {
   public static void main(String args[] ) {
      method1();
      System.out.println(" ");
      method2();
      System.out.println(" ");
      method3();
      System.out.println(" ");
      method4();
      System.out.println(" ");
      method5();
      System.out.println(" ");
      method6();

     // main method that executes separate methods to print the figures
   }
 
   public static void method1() { // writes FIRST figure
      int size = 6;
      int count = 1;
   
         // outer loop controls the rows
         for (int row = 1; row <= size; row++) {
            // inner loops control the columns          
            for (int col = 1; col <= row; col++) {
               System.out.print(count); // prints inside numbers
            }
         
            count++;
            System.out.println();
         }
   }
 
   public static void method2() { // writes SECOND figure
      int size = 6;
      int count = 1;
   
         // outer loop controls the rows
         for (int row = 1; row <= size; row++) {
            // inner loops control the columns
            for (int col = 1; col <= size - row; col++) {
               System.out.print(" ");
            }
         
            for (int col = 1; col <= row; col++) {
               System.out.print(count); // prints inside numbers
            }
            count++;
            System.out.println();
         }
   }
 
   public static void method3() { // writes THIRD figure
      int count= 0;
   
         // outer loop controls the rows
      while(count < 3) {
         for (int row = 0; row <= 2; row++) {
            // inner loops control the columns
               for (int col = 5; col >= 6 - row; col--) {
                  System.out.print(" ");
               }
             
               for (int col = 5; col >= row; col--) {
                  System.out.print(count); // prints inside numbers
               }
               count++;
               System.out.println();   // divides rows
         }
      }
   
      int digit= 0;
   
      while(digit < 3) {
         for (int row = 3; row <= 5; row++) {
            // inner loops control the columns
               for (int col = 5; col >= 6 - row; col--) {
                  System.out.print(" ");
               }
             
               for (int col = 5; col >= row; col--) {
                  System.out.print(digit); // prints inside numbers
               }
               digit++;
               System.out.println();   // divides rows
         }
      }
   }
 
   public static void method4() { // writes FOURTH figure
        int numRow = 7;
        int rows = 6;
        int columns= 6; // initialize variables
        for (rows = 0; rows < numRow; rows++) { // decides rows
         
            for (rows = 0; rows < 6; rows++) {
                for (columns = numRow - rows; columns < 7; columns++) {
                    System.out.print("/"); // prints slashes for rows 2-6
                }
               
                for (columns = 6; columns > rows; columns--) {
                    System.out.print("*"); // prints half of the stars
                }
               
                for (columns = 5; columns > rows; columns--) {
                    System.out.print("*"); // prints other half of the stars
                }
   
                for (columns = numRow - rows; columns < 7; columns++) {
                    System.out.print("\\"); // prints backslashes after stars
                }
               
                System.out.println(); // divides rows
                }
            }
        }
     
     // these 2 above and below are similar  
    public static void method5() { // writes FIFTH figure
        int numRow = 6;
        int rows = 6;
        int columns = 6; // initializing variables
        for (rows = 0; rows < numRow; rows++) {
           
            for (rows = 0; rows <= 4; rows++)  {
                for (columns = numRow - rows; columns > 2; columns--) {
                    System.out.print(" "); // prints spaces before figure
                }
                // spaces make it a triangle
                System.out.print("/"); // prints slash before dots
             
                for (columns = 0; columns <= rows; columns++) {
                    System.out.print(":"); // prints dots
                }
             
                for (columns = 0; columns < rows; columns++) {
                    System.out.print(":"); // prints opposite side of dots
                }
             
                System.out.print("\\"); // prints slash after the dots
             
                System.out.println(); // moves to the next line
            }  
      }  
    }
   
    public static void method6() { // writes SIXTH figure
       
          for (int rows = 1; rows <= 5; rows++) { // outside loop decides row
         
             for (int columns = 0; columns <= 5; columns++) { // middle loop decides number
             
                for (int num = 0; num < columns; num++) {
                   if (columns >= rows) {
                      System.out.print(columns); // inside loop prints numbers
                   }
                }
             }
             
            System.out.println(); // divides all 5 rows with a line
          }  
        }
    }