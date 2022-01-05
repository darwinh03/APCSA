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
      /*
      Picture arch2 = new Picture(fileName);
      System.out.println("Keep only blue:");
      arch2.keepOnlyBlue();// using new method
      arch2.show();
      */
      
      // Uncomment the following code to test your switchColors method
      /*
      Picture arch3 = new Picture(fileName);
      System.out.println("Switch colors, set red same as green:");
      arch3.switchColors();// using new method
      arch3.show();
      */
   }
}