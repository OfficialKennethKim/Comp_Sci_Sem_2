import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Wizard[] x = new Wizard[100];
		Warrior[] y = new Warrior[100];
		for(int i=0; i<100; i++){
			x[i] = new Wizard();
			y[i] = new Warrior();
		}
		
		for(int c = 0;c<100;c++){
			x[c].attack(y[c]);
			y[c].attack(x[c]);
		}

	}
}
