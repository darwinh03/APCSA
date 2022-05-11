/*
Darwin Hanson
5/11/22

Code for finding the middle of Space Arena
*/
import java.awt.Color;

import ihs.apcs.spacebattle.*;
import ihs.apcs.spacebattle.commands.*;

public class FindTheMiddleShip extends BasicSpaceship {

   private Point center; 
   
   public static void main(String[] args) {
      // "10.40.30.98" is the IP address of Mr. Stutler's projector computer
      // "FindTheMiddleShip" is the name of the current class
      TextClient.run("10.40.30.98", new FindTheMiddleShip());
   }

   @Override
   public RegistrationData registerShip(int numImages, int worldWidth, int worldHeight) {
      center = new Point(worldWidth / 2, worldHeight / 2);
      // parameters are ship name, color of ship text (RGB), and index of image
      return new RegistrationData("Darwin's Ship", new Color(162, 172, 98), 0);
   }

   @Override
   public ShipCommand getNextCommand(BasicEnvironment env) {
      // every time getNextCommand() is called, return a command
      // all commands are subclasses of ShipCommand superclass
      ObjectStatus shipStatus = env.getShipStatus();
      Point position = shipStatus.getPosition();
      int orientation = shipStatus.getOrientation();
      int angle = position.getAngleTo(center);
      int degrees = angle - orientation;
      if (degrees != 0) {
         return new RotateCommand(degrees);
      }
      double distance = position.getDistanceTo(center);
      if ( distance > 200 ) {
         return new ThrustCommand( 'B', 0.1, 0.7);
      }
      return new BrakeCommand(0.0);
   }
}