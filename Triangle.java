/*
Darwin Hanson
4/4/2022
Triangle class is subclass of Shape class
*/

public class Triangle extends Shape {
   // instance variable go here
   private double side1;
   private double side2;
   private double side3; 
   
   // constructor will verify that the sides can make a valid triangle
   public Triangle(double side1, double side2, double side3) {
      if ( !(side1 + side2 > side3) || !(side1 + side3 > side2) || !(side2 + side3 > side2) ) {
         // can also supply an informative message
         throw new IllegalArgumentException("These side lengths don't create a triangle!");
      }
      
      // assign the instance variables
      this.side1 = side1;
      this.side2 = side2; 
      this.side3 = side3;
   }
   
   // override the getArea() method
   @Override
   public double getArea() {
      double half = 0.5 * (side1 + side2 + side3);  
      double findArea = Math.sqrt(half * (half - side1) * (half - side2) * (half -  side3));  
  
      return (findArea);  

   }
   
   //overide getPerimeter method
   @Override 
   public double getPerimeter() { 
      return side1 + side2 + side3; 
   }
}

