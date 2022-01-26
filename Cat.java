/* 
Darwin Hanson
1/26/22

Cat class that contains attributes, also known as instance variables, 
and methods that define behaviors. 
*/

public class Cat {
   // declare attributes/ instance variables/ data/ fields  
   // using the "private" keyword and not initializing values
   private String name;
   private double weight;
   
   // define methods (behaviors)
   public void meow() {
      System.out.println(name + " says meow.");
   }
   
   public void eat() {
      System.out.println(name + " eats. Nom, nom, nom!");
      weight += 0.25;
   }
   
   // get methods/accessors
   public String getName() {
      return name;
   }
   
   public double getWeight() {
      return weight;
   }
   
   // set methods/mutators 
   public void setName(String newName) {
      name = newName;
   }
   
   public void setWeight(double newWeight) {
      weight = newWeight;
   }
}