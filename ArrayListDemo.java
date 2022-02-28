/*
2/28/22
Darwin Hanson

ArrayList demo program will show:
- create and initialize an ArrayList
- adding elements to the list
- printing the list 
- getting an element using it's index 
- set (replace) an element 
- remove an element
*/

import java.util.ArrayList;

public class ArrayListDemo {
   public static void main(String[] args) {
      //delcare an ArrayList of String 
      ArrayList<String> dinners = new ArrayList<String>();
      
      // add some elements to list
      dinners.add("Pasta");
      dinners.add("Rice");
      dinners.add("Grilled Cheese"); 
      dinners.add("Ice Cream");
      
      // print out the list
      System.out.println(dinners);
      
      // print the number of elements 
      System.out.println("size: " + dinners.size());
      
      // add an element in the middle of list, then print
      dinners.add(2, "Tacos");
      System.out.println(dinners);
      
      // get an element using its index 
      System.out.println("3rd item: " + dinners.get(3));
      
      // set (replace) an item
      dinners.set(2, "Pizza");
      System.out.println(dinners);
      
      // remove an item
      dinners.remove(4);
      System.out.println(dinners);
      
   }
}