/*
Darwin Hanson
12/8/21

In class code along SpellChecker that uses arrays in for loops.
*/
public class SpellChecker {
   private String[] dictionary = {
      "the","of","and","a","to","in","is","you","that","it",
      "he","was","for","on","are","as","with","his","they","I",
      "at","be","this","have","from","or","one","had","by",
      "word","but","not","what","all","were","we","when","your",
      "can","said","there","use","an","each","which","she","do",
      "how","their","if","will","up","other","about","out","many",
      "then","them","these","so","some","her","would","make",
      "like","him","into","time","has","look","two","more",
      "write","go","see","number","no","way","could","people",
      "my","than","first","water","been","call","who","oil","its",
      "now","find","long","down","day","did","get","come","made",
      "may","cat","dog","cats","dogs"
   };

   public void print10() {
      for (int k = 0; k <= 10; k++) { // traverses just first 10 elements 
         System.out.print(dictionary[k] + " "); // prints element and a space 
      }
   }
   
   public boolean spellCheck(String word) {
      System.out.println();
      for (String values : dictionary) {
         if (values.equals(word)) {
            return true;
         }
      }
      return false; 
   }
   
   public void printStartsWith(String letter) {
      System.out.println();
      for(String values : dictionary) {
        if (values.startsWith(letter)) {
         System.out.println(values + " starts with the letter " + letter);
        } 
      }
   }

   public static void main(String[] args) {
      SpellChecker checker = new SpellChecker();
      /* Uncomment to test Part 1 */
     checker.print10();
   
      /* Uncomment to test Part 2 */
      String word = "catz";
      if (checker.spellCheck(word)) {
         System.out.println(word + " is spelled correctly!");
      }
      else {
         System.out.println(word + " is misspelled!");
      }
   
//       3. optional and not autograded (extra credit)
      String letter = "a";
      checker.printStartsWith("a");
      letter = "t"; 
      checker.printStartsWith("t");
      
      
   }
}