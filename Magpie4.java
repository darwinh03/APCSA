/*
10/28/21
Darwin Hanson

This lab the Magpie chatbot looks for keywords and specific phrases in the input and responds with a transformed statement.
 */
public class Magpie4
{
   public String getGreeting() // return greeting
   {
      return "Hello, let's talk.";
   }
   
   public String getResponse(String statement) // give response to user statement
   {
      String response = ""; // if they say nothing
      if (statement.length() == 0)
      {
         response = "Say something, please.";
      }

      else if (findKeyword(statement, "no") >= 0) // if they say no 
      {
         response = "Why so negative?";
      }
      else if (findKeyword(statement, "mother") >= 0 
               || findKeyword(statement, "father") >= 0
               || findKeyword(statement, "sister") >= 0
               || findKeyword(statement, "brother") >= 0)
      {
         response = "Tell me more about your family."; // talking about family
      }
      else if (findKeyword(statement, "I want to", 0) >= 0)
      {
         response = transformIWantToStatement(statement);
      }
      else if (findKeyword(statement, "I want", 0) >= 0)
      {
         response = transformIWantStatement(statement);
      }

      else
      {
         // Look for a two word (I <something> you)
         // pattern
         int psnOfI = findKeyword(statement, "I", 0);
         int psnOfYou = findKeyword(statement, "You", 0);
         
         if (psnOfI >= 0
             && findKeyword(statement, "you", psnOfI) >= 0)
         {
            response = transformIYouStatement(statement);
         }
         else if (psnOfYou >= 0
             && findKeyword(statement, "me", psnOfYou) >= 0)
         {
            response = transformYouMeStatement(statement);
         }
         else
         {
            response = getRandomResponse();
         }
      }
      return response;
   }
     
      
   /*    
   Take a statement with "I want <something>." and transform it into
    * Would you really be happy if you had <something>?
    */
   private String transformIWantStatement(String statement)
   {
      //  Remove the final period, if there is one
      statement = statement.trim();
      String lastChar = statement.substring(statement.length() - 1);
      if (lastChar.equals("."))
      {
         statement = statement.substring(0, statement.length() - 1);
      }
      int psn = findKeyword (statement, "I want", 0);
      String restOfStatement = statement.substring(psn + 6).trim();
      return "Would you really be happy if you had " + restOfStatement + "?";
   }
   
   private String transformIWantToStatement(String statement) // I want to statement
   {
      //  Remove the final period, if there is one
      statement = statement.trim();
      String lastChar = statement.substring(statement
                                            .length() - 1);
      if (lastChar.equals("."))
      {
         statement = statement.substring(0, statement
                                            .length() - 1);
      }
      int psn = findKeyword (statement, "I want to", 0);
      String restOfStatement = statement.substring(psn + 9).trim();
      return "What would it mean to " + restOfStatement + "?";
   }
  /**
    * Take a statement with "I <something> you" and transform it into
    * "Why do you <something> me?"
    */
   private String transformIYouStatement(String statement)
   {
      //  Remove the final period, if there is one
      statement = statement.trim();
      String lastChar = statement.substring(statement.length() - 1);
      if (lastChar.equals("."))
      {
         statement = statement.substring(0, statement.length() - 1);
      }

      int psnOfII = findKeyword (statement, "I", 0);
      int psnOfYouYou = findKeyword (statement, "you", psnOfII + 3);

      String restOfStatement = statement.substring(psnOfII + 1, psnOfYouYou).trim();
      return "Why do you " + restOfStatement + " me?";
   }
   private String transformYouMeStatement(String statement)
   {
      //  Remove the final period, if there is one
      statement = statement.trim();
      String lastChar = statement.substring(statement
                                            .length() - 1);
      if (lastChar.equals("."))
      {
         statement = statement.substring(0, statement
                                            .length() - 1);
      }

      int psnOfYouMe = findKeyword (statement, "you", 0);
      int psnOfMeYou = findKeyword (statement, "me", psnOfYouMe + 3);

      String restOfStatement = statement.substring(psnOfYouMe + 3, psnOfMeYou).trim();
      return "What makes you think that I " + restOfStatement + " you?";
   }

   /**
    * Search for one word in phrase.  The search is not case sensitive.
    * This method will check that the given goal is not a substring of a longer string
    * (so, for example, "I know" does not contain "no")
    */
   private int findKeyword(String statement, String goal, int startPos)
   {
      String phrase = statement.trim();
      //  The only change to incorporate the startPos is in the line below
      int psnOfI = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
      int psnOfYou = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

      //  Refinement--make sure the goal isn't part of a word
      while (psnOfI >= 0)
      {
         //  Find the string of length 1 before and after the word
         String before = " ", after = " ";
         if (psnOfI > 0)
         {
            before = phrase.substring (psnOfI - 1, psnOfI).toLowerCase();
         }
         if (psnOfI + goal.length() < phrase.length())
         {
            after = phrase.substring(psnOfI + goal.length(), psnOfI + goal.length() + 1).toLowerCase();
         }

         //  If before and after aren't letters, we've found the word
         if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
         && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
         {
            return psnOfI;
         }

         //  The last position didn't work, so let's find the next, if there is one.
         psnOfI = phrase.indexOf(goal.toLowerCase(), psnOfI + 1);

      }
      while (psnOfYou >= 0)
      {
         //  Find the string of length 1 before and after the word
         String before = " ", after = " ";
         if (psnOfYou > 0)
         {
            before = phrase.substring (psnOfYou - 3, psnOfYou).toLowerCase();
         }
         if (psnOfYou + goal.length() < phrase.length())
         {
            after = phrase.substring(psnOfYou + goal.length(), psnOfYou + goal.length() + 3).toLowerCase();
         }

         //  If before and after aren't letters, we've found the word
         if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
         && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
         {
            return psnOfYou;
         }

         //  The last position didn't work, so let's find the next, if there is one.
         psnOfYou = phrase.indexOf(goal.toLowerCase(), psnOfYou + 3);

      }


      return -1;
   }

   /**
    * Search for one word in phrase.  The search is not case sensitive.
    * This method will check that the given goal is not a substring of a longer string
    * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.
    */
   private int findKeyword(String statement, String goal)
   {
      return findKeyword (statement, goal, 0);
   }

   /**
    * Pick a default response to use if nothing else fits.
    * @return a non-committal string
    */
   private String getRandomResponse()
   {
      final int NUMBER_OF_RESPONSES = 4;
      double r = Math.random();
      int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
      String response = "";

      if (whichResponse == 0)
      {
         response = "Interesting, tell me more.";
      }
      else if (whichResponse == 1)
      {
         response = "Hmmm.";
      }
      else if (whichResponse == 2)
      {
         response = "Do you really think so?";
      }
      else if (whichResponse == 3)
      {
         response = "You don't say.";
      }

      return response;
   }

       public static void main(String[] args)
       {
             Magpie4 maggie = new Magpie4();
             String statement = "I want to build a robot.";
             System.out.println("Statement: " + statement);
             System.out.println("Response: " + maggie.getResponse(statement));
       }

}