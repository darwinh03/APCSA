/* 
Darwin Hanson
4/4/22 

Square is a type of rectangle, extends rectangle class
*/
public class Square extends Rectangle {
   // all lengths are the same side 
   public Square(int side) { 
      super(side, side); 
   } 
 
   // overrides toString
   @Override
   public String toString() { 
      return "Square: " + super.toString(); 
   } 
} 

