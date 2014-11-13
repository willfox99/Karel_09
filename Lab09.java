import edu.fcps.karel2.Display; 

public class Lab09 {
	 
	 public static void main(String[] args) {
		 Display.openWorld("maps/piles1.map");
		 Display.setSize(10, 10);
		 Athlete athena = new Athlete(1, 1, Display.EAST, 0);
		 
	 }
 }