/* 
Darwin Hanson
10/11/21 

Demo showing a method that returns a String and uses an if statement
*/

public class ReturnString {
   public static void main(String[] args) {
      String s = "redivider"; 
      
      String start = firstNLetters(s, 3); 
      System.out.println("start: " + start);
      System.out.println("s: " + s);     
   }
   
   // method called firstNLetters() will tkae a string and an int N
   // as parameters and return the substring containing the
   // first N letters
   public static String firstNLetters(String str, int n) {
      if (n < str.length()) {
         str = str.substring(0, n);
      } 
     
      return str; 
   }
}