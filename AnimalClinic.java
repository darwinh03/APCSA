/* 
Darwin Hanson
1/31/22

Animal clinic class will create pet objects and call all of the pet object methods.
*/
public class AnimalClinic {
   public static void main(String[] args) {
      // create 3 Pet objects, using both of the constructors
      Pet oscar = new Pet();/* 
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
      // creates 3 different pets 
      
      // call every accessor and mutator
      oscar.setName("Oscar");
      oscar.getName();
      oscar.setWeight(15.5);
      oscar.getWeight();
      oscar.setAge(2);
      oscar.getAge();
      oscar.setAnimal("Cat");
      oscar.getAnimal(); 
      //gets and sets oscar pet
      
      phoebe.setName("Phoebe");
      phoebe.getName();
      phoebe.setWeight(49.7);
      phoebe.getWeight();
      phoebe.setAge(3);
      phoebe.getAge();
      phoebe.setAnimal("Dog");
      phoebe.getAnimal(); 
      //gets and sets phoebe pet
      
      karly.setName("Karly");
      karly.getName();
      karly.setWeight(130.7);
      karly.getWeight();
      karly.setAge(17);
      karly.getAge();
      karly.setAnimal("Human");
      karly.getAnimal(); 
      //gets and sets karly pet
      
      
      // print out each Pet object
      System.out.println(oscar.toString());
      System.out.println(phoebe.toString());
      System.out.println(karly.toString());
      // use toString method to print every pet
   }
}
      Pet phoebe = new Pet();
      Pet karly = new Pet();
      // call every accessor and mutator
      
      // print out each Pet object
      System.out.println(oscar.ToString());
      System.out.println(phoebe.ToString());
      System.out.println(karly.ToString());
   }
}
