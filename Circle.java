/*
Darwin Hanson
4/4/2022
Circle class is subclass of Shape class
*/

public class Circle extends Shape {
   //instance variables 
   private double r;  
 
   // constructor calls super 
   public Circle(double r) { 
      this.r = r; 
   } 
  
   // Override the accessor methods from Shape class
   @Override 
   public double getPerimeter() { 
      return (Math.PI * 2 * r);  
   } 
  
   @Override
   public double getArea() { 
      return (Math.PI * r * r); 
   } 
  
   // overrides toString method from shape superclass
   @Override 
   public String toString() { 
      return "Circle: " + super.toString(); 
   }

}