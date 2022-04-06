/*
Darwin Hanson
4/4/2022
   
Shape serves as the superclass for all the shapes in
Lab 11: Shape Inheritance Hierarchy. Shape.java contains:
    - getPerimeter() method
    - getArea() method
    - getShapeName() method
    - toString() method inherited from Object
    - equals() method inherited from Object
*/

public class Shape {
   // no instance variables 
   
   // getPerimeter() method returns perimeter of a shape
   // will be overrided in subclasses
   public double getPerimeter() {
      return -1;
   }

   // getArea() method returns the area of shape
   // will be overrided in subclasses
   public double getArea() {
      return -1;
   }

   // getShapeName() method returns name of a shape
   // will be overrided in subclasses
   public String getShapeName() {
      return "Shape";
   }
   
   // toString() method returns String representation of a Shape
   // inherited from Object
   @Override
   public String toString() {
      return getShapeName() + ": perimeter = " + getPerimeter() + ", area = " + getArea();
   }
   
   // equals() method checks if two shapes are equal
   // inherited from Object and takes parameter of type Object
   @Override
   public boolean equals(Object other) {
      // will return true if areas match and perimeters match
      // must downcast the Object parameter to Shape
      // use "instanceof" operator to ensure downcast is safe
      
      return true;   
   }
}