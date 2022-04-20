/*
Darwin Hanson
4/4/22
Isoceles class extends triangle class
*/
public class Isosceles extends Triangle {

   // isosceles has 2 equal sides and one different side
   public Isosceles(double equalside, double other) { 
      super(equalside, equalside, other); 
   } 
   
   // overide toString
   @Override
   public String toString() { 
      return "Isosceles Triangle: " + super.toString(); 
   } 
   
}