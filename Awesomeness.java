/*
Darwin Hanson
9/10/21
This program uses primitive data types, a String variable, print() and println() 
methods, a Scanner object, and arithmetic expressions.
*/
import java.util.Scanner; // Import Scanner class
public class Awesomeness { // Class header and class named Awesomeness
   public static void main(String[] args) { // main() method as we've done so far
      Scanner scan = new Scanner(System.in); // create new scanner object
      System.out.print("What is your name? "); // ask for their name
      String name = scan.nextLine();  // save name in String called name           
      System.out.println("Hello, " + name);     // say Hello to them using their 
name
      System.out.println(); // print blank line
      System.out.print("What is your age? "); //ask for their age
      int age = scan.nextInt(); // store age
      System.out.println("You are " + age + " years old."); //tell them what age 
they are  
      System.out.println();                       
      System.out.print("What is your level of awesomeness from 1 to 10? "); // ask 
them their level of awesomeness from 1 to 10
      int awesomeness = scan.nextInt(); // store level of awesomeness
      System.out.println("Your level of awesomeness from 1 to 10 is a " + 
awesomeness + "."); // tell them how awesome they are
      System.out.println();
      scan.close(); //close scanner
      double ageSquared = (age * age); // (age^2) 
      double ageTimesAwesomenessSquared = ((ageSquared / awesomeness) * (ageSquared
/ awesomeness)); // (/ awesomeness)^2 
      double salary = (ageTimesAwesomenessSquared * 52); // *52 (calculate salary)
      System.out.println("Your salary is " + salary); // print salary
     
   }
}