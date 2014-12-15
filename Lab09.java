/**
 *  Will Fox
 */

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot; 
import javax.swing.JOptionPane;


public class Lab09 {
	 
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+ map+ ".map");
		 Display.setSize(10, 10);
		 		 
       
       
        Display.setSpeed(10);
        
        Athlete athena = new Athlete(1, 1, Display.EAST, 0);
 		 
        athena.move();
        athena.move();
        athena.move();
        athena.move();
        athena.move();
        athena.move();
        
        for (int i = 1; i <= 7; i++) {
        int count = 0;
        while (athena.nextToABeeper())
       {
        athena.pickBeeper();
        count++;
       }
        athena.move();
        for (int k = 1; k <= count; count--)
       {
        athena.putBeeper();
       }
       athena.turnAround();
        if (athena.frontIsClear()) 
       {
        athena.move();
       }
        if (athena.frontIsClear()) 
       {
        athena.move();
       }
        athena.turnAround();
      }
        athena.turnAround();
      
   }
 }
 
