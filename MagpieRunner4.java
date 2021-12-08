/*
10/28/21
Darwin Hanson

This lab the Magpie chatbot looks for keywords and specific phrases in the input and responds with a transformed statement.
 */
import java.util.Scanner;

public class MagpieRunner4 {
   public static void main(String[] args) {
      Magpie4 maggie = new Magpie4();
      Scanner scan = new Scanner(System.in);
   
      System.out.println(maggie.getGreeting() + "\n");
      String statement = scan.nextLine();
   
      while (!statement.equals("Bye")) {
         String response = maggie.getResponse(statement);
         System.out.println(response + "\n");
         statement = scan.nextLine();
      }   

      System.out.println("See you later. I hope we can chat again soon!");
      // System.out.println(maggie.getGoodbye());
   }
}