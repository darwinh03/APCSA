/*
Darwin Hanson
4/4/22
Scalene extends triangle class
*/
public class Scalene extends Triangle { 

   // all 3 sides are different
   public Scalene(double diffSide1, double diffSide2, double diffSide3) {  
      super(diffSide1, diffSide2, diffSide3);  
   } 
   
   // overide toString
   @Override
   public String toString() { 
      return "Scalene Triangle: " + super.toString(); 
   } 
}