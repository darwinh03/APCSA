/* 
10/21/21
Darwin Hanson

Code along game during class!!!
*/
import java.util.Scanner;
public class IfElseAdventureGame {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("You are on an island surrounded by water.");
      System.out.println("There's a path to the north that goes to the jungle, to the east that goes into the mountains, to the south that follows a trail full of lava to a plane,");
      System.out.println(" and to a bouncy house in the west.");
      System.out.print("Which way do you want to go (n,e,s,w)? ");
      
      String command = scan.nextLine();
      
      String adventure = "";
      
      if (command.equals("n")) { // if they click NORTH
         adventure = goNorth();
      }
      else if (command.equals("e")) { // if they click EAST
         adventure = goEast(); 
      }
      else if (command.equals("s")) { // if they click SOUTH
           adventure = goSouth();
      }
      else if (command.equals("w")) { // if they click WEST
         adventure = goWest();
      }
      else 
         System.out.println("Looks like you didn't choose one of the directions, try again!");

      System.out.println(adventure + "\n");
      System.out.println("Whew, that was a crazy adventure!!! "); // end of adventure
      scan.close();
   }
   
   public static String goNorth() { // method for heading NORTH
      System.out.println("");
      String result = "You enter the jungle to the north and you are jumped by ruthless monkeys.";
      result += "\nThey took everything but half a pound of pecans. So sad.";
      return result;
   }
   public static String goEast() { // method for heading EAST
      System.out.println("");
      String result = "You go to the mountains and, no surprise here, it's cold as hell.";
      result += "\nYou die from frostbite but that's just natural selection at this point.";
      return result;
   }
   public static String goSouth() { // method for heading SOUTH
      System.out.println("");
      String result = "You decide to try and be cool and follow the trail of lava.";
      result += "\nFortunately the trail of lava is safe but unfortunately the plane is piloted by a pirate with a fear of height.";
      result += "\nYou get kidnapped by monkeys when the pilot won't fly away from the herd!";
      return result;
   }
   public static String goWest() { // method for going WEST
      System.out.println("");
      String result = "You are smart and make a b-line to the bouncy house.";
      result += "\nYou spend the rest of your days bouncing happily ever after!";
      return result;
   }
}