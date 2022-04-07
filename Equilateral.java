/*
Darwin Hanson
4/4/22

equilateral extends the triangle class
*/
public class Equilateral extends Triangle { 
   
   // all 3 sides are equal
   public Equilateral(double side) {  
      super(side, side, side); 
   } 
   
   // overide toString
   @Override
   public String toString() { 
      return "Equilateral Triangle: " + super.toString();  
   } 
} 
