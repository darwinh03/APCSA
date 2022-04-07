/*
Darwin Hanson
4/4/22

Right triangle extends triangle class
*/
public class Right extends Triangle { 

   // 2 sides are the same, one other that we have to calculate
   public Right(double sideA, double sideB) {   
      super(sideA, sideB, Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));   } 
  
   // overide toString
   @Override
   public String toString() { 
      return "Right Triangle: " + super.toString();  
   } 
}
