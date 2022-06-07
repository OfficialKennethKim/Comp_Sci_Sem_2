import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer a = new Performer();
		Performer b = new Performer("Doja Cat 2", 35);
		Musician c = new Musician();
		Musician d = new Musician("Violin");
		
		System.out.println(a.getName());
		a.practice();
		
		System.out.println(b.getName());
		b.perform();
		
		System.out.println(c.getName());
		c.perform();
		c.playInstrument();
		
		d.practice();
		System.out.println(c.getInstrument());
	}
	
}
