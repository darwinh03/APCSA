/* 
Darwin Hanson
1/5/22

PixLab demonstrates mamipulating images using 2D traversal and modifying the RBG values in the pixels of the images. 
*/
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;

/**
 * A class that represents a picture.  This class inherits from
 * SimplePicture and allows the student to add functionality to
 * the Picture class.
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture
{
   ///////////////////// constructors //////////////////////////////////

   /**
    * Constructor that takes no arguments
    */
   public Picture ()
   {
      /* not needed but use it to show students the implicit call to super()
       * child constructors always call a parent constructor
       */
      super();
   }

   /**
    * Constructor that takes a file name and creates the picture
    * @param fileName the name of the file to create the picture from
    */
   public Picture(String fileName)
   {
      // let the superclass handle this fileName
      super(fileName);
   }

   /**
    * Constructor that takes the height and width
    * @param height the height of the desired picture
    * @param width the width of the desired picture
    */
   public Picture(int height, int width)
   {
      // let the superclass handle this width and height
      super(width,height);
   }

   /**
    * Constructor that takes a picture and creates a
    * copy of that picture
    * @param copyPicture the picture to copy
    */
   public Picture(Picture copyPicture)
   {
      // let the superclass do the copy
      super(copyPicture);
   }

   /**
    * Constructor that takes a buffered image
    * @param image the buffered image to use
    */
   public Picture(BufferedImage image)
   {
      super(image);
   }
   ////////////////////// methods ///////////////////////////////////////

   /**
    * Method to return a string with information about this picture.
    * @return a string with information about the picture such as fileName,
    * height and width.
    */
   public String toString()
   {
      String output = "Picture: filename " + getFileName() +
         ", height " + getHeight()
         + ", width " + getWidth();
      return output;
   
   }

   /**
     zeroBlue() method sets the blue values at all pixels to zero
   */
   public void zeroBlue()
   {
      Pixel[][] pixels = this.getPixels2D();
   
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel p: rowArray)
         {
            p.setBlue(0);
         }
      }
   }


   /* Add new methods here.
      keepOnlyBlue() method sets the red and green values at all pixels to zero.
      switchColors() method swaps the color values of pixels.
   */
   
   public void keepOnlyBlue() { // method that keeps only the blue values
      Pixel[][] pixels = this.getPixels2D();
   
      for (Pixel[] rowArray : pixels) { // for each that will traverse everything
         for (Pixel p: rowArray) {
            p.setRed(0); // makes red 0 
            p.setGreen(0); // makes green 0 
         }
      }
   }
   
   public void switchColors() { // method that will switch the red values with the green values
      Pixel[][] pixels = this.getPixels2D();
   
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel p: rowArray)
         {
            int green = p.getGreen();
            p.setRed(green); // switches red values with the green values
         }
      }
   }
   
   public void negate() {
      Pixel[][] pixels = this.getPixels2D();
   
      for (Pixel[] rowArray : pixels) // for each to traverse through all elements
      {
         for (Pixel p: rowArray)
         {
            int green = p.getGreen();
            int greenNegated = 255 - green;
            p.setGreen(greenNegated); // sets green to negative
            int blue = p.getBlue();
            int blueNegated = 255 - blue;
            p.setBlue(blueNegated); // sets blue to negative
            int red = p.getRed();
            int redNegated = 255 - red;
            p.setRed(redNegated); // sets red to negative
         }
      }   
   }
   
   public void grayScale() { // turns entire picture gray
      Pixel[][] pixels = this.getPixels2D();
   
      for (Pixel[] rowArray : pixels) // uses for each loop to traverse
      {
         for (Pixel p: rowArray)
         {
            int green = p.getGreen();
            int blue = p.getBlue();
            int red = p.getRed();
            int average = (green + blue + red)/3; // takes average of all colors
            // sets all pixels to that average
            p.setBlue(average);
            p.setGreen(average);
            p.setRed(average);
         }
      }
   }
   
   public void mirrorVertical() { // method flips left side onto right side
      Pixel[][] pixels = this.getPixels2D();
      // creates new variables for both sides 
      Pixel leftSide = null; 
      Pixel rightSide = null; 
      int width = pixels[0].length; // finds width of array
      
      for ( int row = 0; row < pixels.length; row++ ) {  // traverses rows
         for ( int col = 0; col < width / 2; col++ ) {  // traverses columns
            leftSide = pixels[row][col]; 
            rightSide = pixels[row][width - 1 - col]; // sets right side to left
            rightSide.setColor( leftSide.getColor() );  // changes color
            
            } 
      } 
   }

   /* Main method for testing
    */
   public static void main(String[] args)
   {
      String fileName = "arch.jpg";
      
      // display original picture
      Picture arch = new Picture(fileName);
      System.out.println("Original picture:");
      arch.show();
      
      // call zeroBlue() method and display picture
      System.out.println("Zero blue:");
      Picture arch1 = new Picture(fileName);
      arch1.zeroBlue();
      arch1.show();
   
      // Uncomment the following code to test your keepOnlyBlue method

      Picture arch2 = new Picture(fileName);
      System.out.println("Keep only blue:");
      arch2.keepOnlyBlue();// using new method
      arch2.show();
            
      // Uncomment the following code to test your switchColors method

      Picture arch3 = new Picture(fileName);
      System.out.println("Switch colors, set red same as green:");
      arch3.switchColors();// using new method
      arch3.show();
      
      Picture arch4 = new Picture(fileName);
      System.out.println("Negates all pixels:");
      arch4.negate();// using new method
      arch4.show();

      Picture arch5 = new Picture(fileName);
      System.out.println("Turns picture gray:");
      arch5.grayScale();// using new method
      arch5.show();
      
      Picture arch6 = new Picture(fileName);
      System.out.println("Flips left side onto right:");
      arch6.mirrorVertical();// using new method
      arch6.show();      
   }
}
