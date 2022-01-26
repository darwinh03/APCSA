/*
Darwin Hanson
1/26/22

CatLover class will contain the main() method that creates 
a couple of cat objects and calls their methods.
*/

public class CatLover {
   public static void main(String[] args) {
      // create a couple of Cat objects using "new" keyboard
      Cat jon = new Cat();
      Cat demarkus = new Cat();
      
      // call set methods to supply names and weights for objects
      jon.setName("Jon");
      demarkus.setName("Demarkus");
      
      jon.setWeight(525.0);
      demarkus.setWeight(925.7);
      
      // call methods on jon and demarkus objects to exercise other behaviors
      jon.meow();
      System.out.println(jon.getName() + " weighs " + jon.getWeight() + " pounds.");
      jon.eat();
      System.out.println(jon.getName() + " weighs " + jon.getWeight() + " pounds.");
      
      System.out.println();
      
      demarkus.meow();
      System.out.println(demarkus.getName() + " weighs " + demarkus.getWeight() + " pounds.");
      demarkus.eat();
      System.out.println(demarkus.getName() + " weighs " + demarkus.getWeight() + " pounds.");
   }
}