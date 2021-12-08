/* 
11/29/21
Darwin Hanson

Lab 7: Loops and Arrays Algorithms
This lab uses loops and array to demonstrate perform several algorithms.  
   * prints array
   * finds sum of array
   * finds average
   * find maximum element
   * find index of minimum value
   * create and return new array based off of old
   * multiply original array by 5 and return new array
*/
public class LoopArrayAlgorithms {
   public static void main(String[] args) {
      // declare and initialize an array of int
      int[] nums = { 3, 9, 7, 4, 5, -1, 13, 2 };

      // print original array
      System.out.print("original array: ");
      printArray(nums);
      
      // finds and prints sum of all nums in array
      // can use for each
      // declare and initialize sum to 0
      // implement for-each loop
      // add value to sum
      // return the sum
      int sum = getSum(nums);
      System.out.println("sum: " + sum);

      // finds and prints average of all nums
      // average = sum / number of elements
      // can be implemented without loop in one or 2 lines
      double average = getAverage(nums);
      System.out.println("average: " + average);
      
      // finds maximum value out of all values in array
      // use for-each
      //intialize and declare a maximum to the value of the first element in the array
      // must have if statement inside the loop 
      int max = getMax(nums);
      System.out.println("max: " + max);

      // finds minimum value and prints index
      // use standard for-loop
      // similar to getMax alg 
      int indexOfMin = getIndexOfMin(nums);
      System.out.println("index of min: " + indexOfMin);
      
      // combines 2 consecutive values and returns 4 combined values 
      int[] combined = combinedElements(nums);
      System.out.print("combined array: ");
      printArray(combined); 

      // multiplies arrays by 5 and gives changed values
      int factor = 5;
      multiplyArray(nums);
      System.out.print("after multiply by " + factor + ": ");
      printArray(nums);
    }
   
   // printArray method will print elements of array on one line of output
   public static void printArray(int[] input) {
      // use for each to get each value
      for (int value : input) {
         System.out.print(value + " ");
        
      }
      System.out.println();
   }
   
   // getSum method prints sums of all values in an array
   public static int getSum(int[] input) {
      int sum = 0; 
      for (int value : input) {
         sum += value;
      } 
      return sum;
   }
   
   // getAverage method prints average of all nums in array
   public static double getAverage(int [] input) {
      double sum = getSum(input);
      double average = sum / (input.length);
      return average;
   }
   
   // getMax method prints the maximum value of the array
   public static int getMax(int[] input) {
      int max = input[0];
      for (int value : input) {
         if (max < value) {
            max = value;
         }
      }
      return max;
   }
   
   // getIndexOfMin method prints the index of the smallest value in an array
   public static int getIndexOfMin(int[] input) {
       int indexOfMin = 0;
       int min = input[indexOfMin];
       for (int i = 1; i < input.length; i++){
           if (input[i] <= min){
           min = input[i];
           indexOfMin = i;
           }
       }
       return indexOfMin;
   }
   
   // combineElements method combines 2 consecutive values and returns 4 values
   public static int[] combinedElements(int[] input) {
        int[] combined = new int[input.length / 2];
        int count = 0;
        int combinedCount = 0;
        int sum1 = 0; 
        int sum2 = 0;  
        for (int k = 0; k <= input.length - 1 ; k++) {
         input[count] = sum1;
         input[count + 1] = sum2;
         combinedCount = sum1 + sum2;
         combined[count] = combinedCount;
         count++; 
        } 
      return combined;
   }
   
   // multiplyArray method multiplies all values of an array by a factor and returns array
   public static void multiplyArray(int[] input) {
      for (int i = 0; i < input.length; i++) {
        input[i] = input[i] * 5;
      }
   }
   
}