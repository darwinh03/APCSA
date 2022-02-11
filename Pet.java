/**
Darwin Hanson
1/31/22

Represents a pet that is a patient at the animal clinic. 
The class includes 4 instance variables (attributes/fields). 
2 constructors and accessors (get methods) and mutators (set methods) and to string methods

We will create Pet instances in the main() method of the AnimalClinic class
*/
public class Pet {
   // declare private fields for the name, age, weight, and type of animal
   private String name;
   private int age;
   private double weight;
   private String typeOfAnimal;
   // write 2 constructors, accessor (get) methods, mutator (set) methods, and 
   // the toString() method. Use good commenting.
   
   // CONSTRUCTORS
   // first constructor- takes 4 parameters
   public Pet(String name, int age, double weight, String typeOfAnimal) {
      setName(name);
      setAge(age);
      setWeight(weight); 
      setAnimal(typeOfAnimal);
   }
   
   // second constructor- takes 0 parameters and sets to default values
   public Pet() {
      this("Pet", 0, 0.0, "Pet");
   }

   //MUTATOR
   //setName mutator
   // sets the name of pet
   public void setName(String name) {
      this.name = name;
   }
   
   //setAge mutator
   // sets the age of pet
   public void setAge(int age) {
      this.age = age;
   }
   
   //setWeight mutator 
   //sets the weight of pet
   public void setWeight(double weight) {
      this.weight = weight;
   }
   
   //setAnimal mutator 
   //sets the type of animal of the pet
   public void setAnimal(String typeOfAnimal) {
      this.typeOfAnimal = typeOfAnimal;
   }
   
   //ACCESSORS
   // getName accessor
   // gets name
   public String getName() {
      return this.name;
   }
   
   //getAge accessor
   //gets age
   public int getAge() {
      return this.age;
   }
   
   //getWeight accessor
   //gets weight
   public double getWeight() {
      return this.weight;
   }
   
   //getAnimal accessor
   //gets type of animal
   public String getAnimal() {
      return this.typeOfAnimal;
   }
   
   //ToString method 
   //method that will return template for output
   public String toString() {
      return "Pet: name = " + name + " , age = " + age + " , weight = " + weight + " , type of animal = " + typeOfAnimal;
   }
}
