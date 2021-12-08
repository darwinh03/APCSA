/*
9/27/21
Darwin Hanson

This program uses static methods to show structure and eliminate redundancy in the program.
*/

public class StaticMethod {
   public static void main(String[] args) { // method and class as we always have it
 
      fullBox(); // print one full box
      littleLineThingy(); // print line thing
      fullBox(); // print another full box
      littleLineThingy(); // print line thing
      bottomOfBox(); // prints bottom of box
      topOfBox(); // prints top of box
      littleLineThingy(); // print line thing
      bottomOfBox(); // prints bottom of box
 
   }
 
   public static void topOfBox()    { // call method to create the top of the box
 
      System.out.println("  _______\n /       \\\n/         \\"); // prints top of the box
 
   }
 
   public static void bottomOfBox()   { // call method to create the bottom of the box
 
      System.out.println("\\         /\n \\_______/ "); // print bottom of box
 
   }
 
   public static void littleLineThingy()    { // call method to create the line with dashes and quotes
 
      System.out.println("-\"-'-\"-'-\"-");
 
   }
 
   public static void fullBox() { // call method to create full box
 
      topOfBox();
      bottomOfBox();
   
   }
}



