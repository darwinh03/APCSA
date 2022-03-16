/*
3/9/22
Darwin Hanson

contains the main() method, creates a HorseBarn object, and calls methods that need to be implemented
*/
import java.util.ArrayList;

public class HorseBarnRunner {

   public static void main(String[] args) {
      // DO NOT MODIFY any of the code in this main() method!
      
      // create and initialize a HorseBarn object
      HorseBarn barn = new HorseBarn();
      
      // get the original list
      ArrayList<Horse> barnSpaces = barn.getSpaces();
      
      // print each horse and its index, one per line
      System.out.println("Original list:");
      printHorsesAndIndexes(barnSpaces);
      
      // calculate and display average weight of horses
      double avgWeight = averageWeight(barnSpaces);
      System.out.println("\nAverage weight: " + avgWeight);
      
//       // find and print the lightest horse
//       Horse lightestHorse = getMinWeightHorse(barnSpaces);
//       System.out.print("Lightest Horse: ");
//       System.out.println(lightestHorse);
// 
//       // find and print the index of the heaviest horse
//       int heavyHorseIndex = getMaxWeightIndex(barnSpaces);
//       System.out.print("Index of heaviest: ");
//       System.out.print(heavyHorseIndex);
//       System.out.println(". " + barnSpaces.get(heavyHorseIndex));
//       
//       // replace Trigger with Buttercup
//       Horse buttercup = new Horse("Buttercup", 1327);
//       replaceHorse(barnSpaces, "Trigger", buttercup);
//       System.out.println("\nAfter replace Trigger with Buttercup:");
//       printHorsesAndIndexes(barnSpaces);
//       
//       // add Coco after Duke
//       Horse coco = new Horse("Coco", 1497);
//       addHorseAfter(barnSpaces, "Duke", coco);
//       System.out.println("\nAdd Coco after Duke:");
//       printHorsesAndIndexes(barnSpaces);
//       
//       // remove horses with even length names
//       removeEvenLength(barnSpaces);
//       System.out.println("\nAfter remove even length names:");
//       printHorsesAndIndexes(barnSpaces);
   }
   
   public static void printHorsesAndIndexes(ArrayList<Horse> list) {
      for (int num = 0; num < list.size(); num++) {
         System.out.println(num + ". " + list.get(num));
         
      }
   }
   
   public static int averageWeight(ArrayList<Horse> list) {
      int sum; 
      for (int num = 0; num < list.size(); num++) {
         sum += list.getWeight(); 
      }
      return sum;
   }

}
