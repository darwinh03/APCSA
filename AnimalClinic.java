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
      Pet karly = new Pet("Karly", 17, 137.7, "Human");
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
      System.out.println(phoebe.getName());
      phoebe.setWeight(49.7);
      System.out.println(phoebe.getWeight());
      phoebe.setAge(3);
      phoebe.getAge();
      System.out.println(phoebe.getAge());
      phoebe.setAnimal("Dog"); 
      System.out.println(phoebe.getAnimal());
      System.out.println();
      
      //gets and sets phoebe pet
      
      // print out each Pet object
      System.out.println(oscar.toString());
      System.out.println(phoebe.toString());
      System.out.println(karly);
      // use toString method to print every pet
   }
}
