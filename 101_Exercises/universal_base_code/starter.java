import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
		Ascii a = new Ascii("dog");
		a.printArt();
		Ascii b = new Ascii("Human", "Kenny");
		b.printArt();
		Ascii c = new Ascii("Cactus", 5);
		c.printArt();
		Ascii d = new Ascii("dog", "Troy", 4);
		d.printArt();
		Ascii e = new Ascii("wonder of u");
		e.printArt();



		
	}
}
