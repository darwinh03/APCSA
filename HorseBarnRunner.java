/*
3/9/22
Darwin Hanson
contains the main() method for testing and print 
and calls/creates methods that need to be implemented
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
      
      // find and print the lightest horse
      Horse lightestHorse = getMinWeightHorse(barnSpaces);
      System.out.print("Lightest Horse: ");
      System.out.println(lightestHorse);
      
      // find and print the index of the heaviest horse
      int heavyHorseIndex = getMaxWeightIndex(barnSpaces);
      System.out.print("Index of heaviest: ");
      System.out.print(heavyHorseIndex);
      System.out.println(". " + barnSpaces.get(heavyHorseIndex));
      
      // replace Trigger with Buttercup
      Horse buttercup = new Horse("Buttercup", 1327);
      replaceHorse(barnSpaces, "Trigger", buttercup);
      System.out.println("\nAfter replace Trigger with Buttercup:");
      printHorsesAndIndexes(barnSpaces);
      
      // add Coco after Duke
      Horse coco = new Horse("Coco", 1497);
      addHorseAfter(barnSpaces, "Duke", coco);
      System.out.println("\nAdd Coco after Duke:");
      printHorsesAndIndexes(barnSpaces);
     
      // remove horses with even length names
      removeEvenLength(barnSpaces);
      System.out.println("\nAfter remove even length names:");
      printHorsesAndIndexes(barnSpaces);
   }
   
   public static void printHorsesAndIndexes(ArrayList<Horse> list) {
      for (int num = 0; num < list.size(); num++) {
         System.out.println(num + ". " + list.get(num));
         
      }
   }
   
   public static double averageWeight(ArrayList<Horse> list) {
      double sum = 0.0; 
      int counter = 0;
      for (Horse h : list) {
         sum += list.get(counter).getWeight();
         counter++; 
      }
      return sum / list.size();
   }
   
   public static Horse getMinWeightHorse(ArrayList<Horse> list) {
      Horse min = list.get(0);
      for (int i = 1; i < list.size(); i++) {
         if (list.get(i).getWeight() < min.getWeight()) {
            min = list.get(i);
         }
      } 
      return min;
   }
   
   public static int getMaxWeightIndex(ArrayList<Horse> list) {
      int max = 0;
      for (int i = 1; i < list.size(); i++) {
         if (list.get(i).getWeight() > list.get(max).getWeight()) {
            max = i;
         }
      } 
      return max;
   }
   
   public static void replaceHorse(ArrayList<Horse> list, String oldHorseName, Horse newHorseObject) {
      for (int num = 0; num < list.size(); num++) {
         Horse currentHorse = list.get(num);
         if (oldHorseName.equals(currentHorse.getName())) {
            list.set(num, newHorseObject);
         }
      }       
   }

   public static void addHorseAfter(ArrayList<Horse> list, String oldHorseName, Horse newHorseObject) {
      for (int num = 0; num < list.size(); num++) {
         Horse currentHorse = list.get(num);
         if (oldHorseName.equals(currentHorse.getName())) {
            list.add(num + 1, newHorseObject);
         }
      }
   }
   
   public static void removeEvenLength(ArrayList<Horse> list) {
      for (int num = 0; num < list.size(); num++) {
         String name = list.get(num).getName();
         if (name.length() % 2 == 0) {
            list.remove(num); 
            num--;
         }
      }
   }
    
}
