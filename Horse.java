/*
3/9/22
Darwin Hanson

the Horse class has all the accessors, mutators, and constructors to create our horse objects
*/
public class Horse {
   // declare private instance variables for name and weight
   private String name;
   private int weight; 
   
   // implement a constructor that that takes parameters for name and weight
   public Horse(String name, int weight) {
      this.name = name;
      this.weight = weight;
   }
   
   // implement accessor methods for the instance variables
   public String getName() {
      return name;
   }
   
   public int getWeight() {
      return weight;
   }
   
   // implement mutator methods for the instance variables
   public void setName(String newName) {
      name = newName;
   }
   
   public void setWeight(int newWeight) {
      weight = newWeight;
   }
   
   // implement a meaningful toString() method
   public String toString() {
      return "Horse: name: " + name + ", weight: " + weight;
   }
}
