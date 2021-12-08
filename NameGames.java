/*
10/11/2021
Darwin Hanson
Mr. Stutler

This program manipulates a user's name and graduation year. Use static methods to show structure in your program.
*/
import java.util.Scanner; // opens scanner to ask for info

public class NameGames {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter full name: "); // asks for full name
      String fullName = input.nextLine(); // stores full name
      System.out.print("Enter graduation year: "); // asks for grad year
      int gradYear = input.nextInt(); // stores grad year
      String first = firstName (fullName); // finds first name and stores it
      String lastNameLetters = lastName (fullName); // finds last name and stores it
      String initials = inputInitials (fullName); // prints first name and last initial
      int last = lastNameLength (lastNameLetters);
      System.out.println(" ");
      System.out.println("Greetings, " + first + ", your initials are " +
      initials + ".");
      System.out.println("Your last name is " + last + " letters long."); // print number of letters in last name
      int tillGradYear = tillGradYear (gradYear);
      System.out.println("You will graduate in " + tillGradYear + " years."); // prints years till graduation
      String Id = studentId (fullName, gradYear); // finding student ID
      System.out.println("Your student ID is \"" + Id + "\"."); // prints student ID
   }
  
   public static int lastNameLength (String lastNameLetters) {
         int last = lastNameLetters.length();
         return last; // finds length of last name
   }
   
   public static String firstName (String fullName) {
      int firstSpace = fullName.indexOf(" ");
      String firstName = fullName.substring(0, firstSpace);
      return firstName; // identifies and returns first name
   }
  
   public static String lastName (String fullName) {
      int firstSpace = fullName.indexOf(" ");
      String middlePlusLastName = fullName.substring(firstSpace + 1);
      int secondSpace = middlePlusLastName.indexOf(" ");
      String lastName = middlePlusLastName.substring(secondSpace + 1);
      return lastName; // indentifies and returns last name 
   }
  
   public static int tillGradYear (int gradYear) {
      int tillGradYear = gradYear - 2021;
      return tillGradYear; // calculates and returns grad year
   }
  
   public static String inputInitials(String fullName) {
      String firstInitial = fullName.substring(0,1); // finds first initial
      int firstSpace = fullName.indexOf(" ");
      String middlePlusLastName = fullName.substring(firstSpace + 1);
      String secondInitial = middlePlusLastName.substring(0,1); // finds second initial
      String lastName = lastName(fullName);
      String thirdInitial = lastName.substring(0,1); // gets third initial
      String fullInitials = firstInitial + secondInitial + thirdInitial;
      return fullInitials; // returns full initials
   }
  
   public static String studentId (String fullName, int gradYear) {
      int firstSpace = fullName.indexOf(" ");
      String middlePlusLastName = fullName.substring(firstSpace + 1);
      int secondSpace = middlePlusLastName.indexOf(" ");
      String lastNames = middlePlusLastName.substring(secondSpace + 1);
      String lastNameLetters = lastNames.substring(0,4); // finds 4 digits of last name
      String lastNameId = lastNameLetters.toLowerCase();
      String first = fullName.substring(0,3); // finds 3 digits of first name
      String firstNameId = first.toLowerCase();
      String graduationYear = Integer.toString(gradYear);
      String yearsTillGradId = graduationYear.substring(2); // finds last 2 numbers of grad year
      String studentId = lastNameId + firstNameId + yearsTillGradId; // makes student ID
      return studentId;
   }
}    
