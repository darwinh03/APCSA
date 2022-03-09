/*
3/9/22
Darwin Hanson

contain the Horse class
*/
public class Horse {
   // declare private instance variables for name and weight
   private String name;
   private int weight; 
   
   // implement a constructor that that takes parameters for name and weight
   public Horse(String name, int weight) {
      name = this.name;
      weight = this.weight;
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
      return "Name: " + name + ", weight: " + weight;
   }
}
