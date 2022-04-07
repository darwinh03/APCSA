/* 
Darwin Hanson  
4/4/22 
  
ShapeClient class 
*/ 
import java.util.ArrayList;  
import java.util.Arrays;
  
public class ShapeClient { 
   public static void main (String[] args) { 
  
   // initializes all Shape objects 
   Shape circle1 = new Circle(3.2);  
   Shape circle2 = new Circle(4.3);  
   Shape rectangle1 = new Rectangle(5, 3);  
   Shape rectangle2 = new Rectangle(2, 1);  
   Shape square1 = new Square(6);  
   Shape square2 = new Square(14);  
   Shape isosceles1 = new Isosceles(12.3, 12.5);  
   Shape isosceles2 = new Isosceles(19.2, 1.2);  
   Shape equilateral1 = new Equilateral(10.4);  
   Shape equilateral2 = new Equilateral(6.7);  
   Shape scalene1 = new Scalene(56.5, 87.2, 59.1);  
   Shape scalene2 = new Scalene(3.4, 7.8, 5.5);  
   Shape right1 = new Right(5.3, 9.3);  
   Shape right2 = new Right(9.7, 6.0);  
  
   // put the objects into a new ArrayList  
   ArrayList<Shape> shapes = new ArrayList<Shape>();  
   shapes.add(circle1); 
   shapes.add(circle2);  
   shapes.add(rectangle1);  
   shapes.add(rectangle2);  
   shapes.add(square1);  
   shapes.add(square2); 
   shapes.add(isosceles1);  
   shapes.add(isosceles2);  
   shapes.add(equilateral1);  
   shapes.add(equilateral2);  
   shapes.add(scalene1);  
   shapes.add(scalene2);  
   shapes.add(right1);  
   shapes.add(right2);  
  
   // print each shape  
   for ( int p = 0; p < shapes.size(); p++ ) { 
      System.out.println(shapes.get(p) + "\n");  
   } 
 
   // call the smallestArea and largestArea methods
   System.out.println("Smallest Area: " + smallestArea(shapes));   System.out.println("Largest Area: " + largestArea(shapes));   } 
  
   // smallestArea method 
   public static Shape smallestArea(ArrayList<Shape> input) {  
      double minArea = input.get(0).getArea();  
      int minIndex = 0;  
      // for-loop to identify where the smallest area value index is  
      for ( int k = 0; k < input.size(); k++ ) { 
         if ( input.get(k).getArea() < minArea ) { 
            minArea = input.get(k).getArea(); 
            minIndex = k; 
         } 
      } 
      return input.get(minIndex);  
   } 
  
   // largestArea method 
   public static Shape largestArea(ArrayList<Shape> input) {  
      double maxArea = input.get(0).getArea();  
      int maxIndex = 0;  
      // for-loop to identify where the largest area value index is  
      for ( int k = 0; k < input.size(); k++ ) { 
         if ( input.get(k).getArea() > maxArea ) { 
            maxArea = input.get(k).getArea();  
            maxIndex = k; 
         } 
      } 
      return input.get(maxIndex); 
    } 
}
