/* 
11/4/21
Darwin Hanson

This is sort-of an in-class code-along based on the 4.1.5. Programming Challenge: Guessing Game (Links to an external site.) in section 4.1. While Loops (Links to an external site.) in CSAwesome.
*/
import java.util.Scanner;

public class GuessingGame {
   public static void main(String[] args)   {
      Scanner scan = new Scanner(System.in);
      // Choose a random number from 0-100 
      double randomNumber = (int) (Math.random() *100);
      // Ask the user to guess a number from 0 to 100 
      System.out.println("Guess a number 0 to 100: ");
      int numberOfGuesses = 0;
      numberOfGuesses++;
      // Get the first guess using scan.nextInt();
      int userGuess = scan.nextInt();
      // Loop while the guess does not equal the random number,
      while (!(randomNumber == userGuess)) {
         // If the guess is less than the random number, print out "Too low!"
         if ((randomNumber > userGuess)) {
            System.out.println("Too low!");
         }
         // If the guess is greater than the random number, print out "Too high!"
         if ((randomNumber < userGuess)) {
            System.out.println("Too high!");
         }
         // Get a new guess (save it into the same variable)
         System.out.println("Guess a new number: ");
         userGuess = scan.nextInt();
         numberOfGuesses++;
      }
      // After loop, print out something like "You got it!"
      System.out.println("You guessed it!!");
      // Also print how many guesses it took
      System.out.println("It took you " + numberOfGuesses + " guesses to guess the right number.");
   }
}