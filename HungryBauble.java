/*
Darwin Hanson
5/11/22

Code for finding the middle of Space Arena (commented out) and Hungry Bauble
*/
import java.awt.Color;

import ihs.apcs.spacebattle.*;
import ihs.apcs.spacebattle.commands.*;

public class HungryBauble extends BasicSpaceship {

   public int width;
   public int height; 
   
   public static void main(String[] args) {
      // "10.40.30.98" is the IP address of Mr. Stutler's projector computer
      // "FindTheMiddleShip" is the name of the current class
      TextClient.run("10.40.30.98", new HungryBauble());
   }

   @Override
   public RegistrationData registerShip(int numImages, int worldWidth, int worldHeight) {
      this.width = worldWidth;
      this.height = worldHeight;
      // parameters are ship name, color of ship text (RGB), and index of image
      return new RegistrationData("Darwin's Ship", new Color(162, 172, 98), 0);
   }

   @Override
   public ShipCommand getNextCommand(BasicEnvironment env) {
      // every time getNextCommand() is called, return a command
      // all commands are subclasses of ShipCommand superclass
      
      // mission 1 code
      ObjectStatus shipStatus = env.getShipStatus();
      Point position = shipStatus.getPosition();
      int orientation = shipStatus.getOrientation();
//       int orientation = shipStatus.getOrientation();
//       int angle = position.getAngleTo(center);
//       int degrees = angle - orientation;
//       if (degrees != 0) {
//          return new RotateCommand(degrees);
//       }
//       double distance = position.getDistanceTo(center);
//       if ( distance > 300 ) {
//          return new ThrustCommand( 'B', 0.9, 0.3);
//       }
//       if ( distance > 200 ) {
//          return new ThrustCommand( 'B', 0.4, 0.5);
//       }
//       if ( distance > 100 ) {
//          return new ThrustCommand( 'B', 0.1, 0.7);
//       }
//       return new BrakeCommand(0.0);
      
      BasicGameInfo bgi = env.getGameInfo();
      Point myBauble = bgi.getObjectiveLocation();
      Point myTarget = position.getClosestMappedPoint(myBauble, width, height);
      int angle = position.getAngleTo(myTarget);
      
      RadarResults results = env.getRadar();
      if (results == null) {
         return new RadarCommand(5);
      }
      
      if (env.getRadar() != null) {
         for (ObjectStatus object : env.getRadar()) {
         // Only care about Baubles with Value Greater Than 1
            if (object.getType().equals("Bauble") && object.getValue() >= 1) {
                // Do Stuff
                int degrees = angle - orientation;
                if (degrees != 0) {
                   return new RotateCommand(degrees);
                }
                return new ThrustCommand( 'B', 3.0, 0.5);
            }
         }
      }
      return new BrakeCommand(0.0);
   }
}