/* 
Darwin Hanson
1/31/22

Animal clinic class will create pet objects and call all of the pet object methods.
*/
public class AnimalClinic {
   public static void main(String[] args) {
      // create 3 Pet objects, using both of the constructors
      Pet oscar = new Pet();
      Pet phoebe = new Pet();
      Pet karly = new Pet();
      // call every accessor and mutator
      
      // print out each Pet object
      System.out.println(oscar.ToString());
      System.out.println(phoebe.ToString());
      System.out.println(karly.ToString());
   }
}