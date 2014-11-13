/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author kentcollins
 *
 */
import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;

public class Lab09 {
	 
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
		 Athlete athena = new Athlete(1, 1, Display.EAST, 0);
		 for (int count = 1; count<=8; count++) {
			 int beepersHeld = athena.getBeepers();
			 while (athena.nextToABeeper()) {
				 athena.pickBeeper();
			 }
			 for (int i = 0; i<beepersHeld; i++) {
				 athena.putBeeper();
			 }
			 athena.move();
		 }
		 athena.turnAround();
		 while(athena.frontIsClear()) {
			 athena.move();
		 }
	 }
 }