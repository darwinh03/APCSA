/*
Darwin Hanson
4/4/22
Rectangle is a sublass of Shape class
*/
public class Rectangle extends Shape { 
   //instance variables 
   private double length;  
   private double width;  
  
   // Constructor calls super method from Shape superclass 
   public Rectangle(int length, int width) { 
      this.length = length;  
      this.width = width;  
   } 
  
   // Override the accessor methods from Shape class
   @Override 
   public double getPerimeter() { 
      return (length * 2) + (width * 2); 
   } 
  
   @Override
   public double getArea() { 
      return length * width;  
   } 
  
   // toString method is overrided
   @Override
   public String toString() { 
      return "Rectangle: " + super.toString();  
   } 
} 