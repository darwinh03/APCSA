/* 
Darwin Hanson 
9/24/21

Program demonstrates methods that return values
*/ 

public class ReturnValues {
   public static void main(String[] args) { 
      // call multiply method and save the 
      // results in variable x 
      int x = multiply(5, 2);  
      System.out.println("x: " + x);
      System.out.println(" 5 - 2: " + subtract(5, 2)); 
   }
   
   // multiply() method will take 2 parameters 
   // and return the product 
   public static int multiply(int a, int b) {
      int product = a * b; 
      return product; 
 
   }

   // subtract() method will subtract 2 values
   public static int subtract(int a, int b) {
      return a - b; 
   }
}