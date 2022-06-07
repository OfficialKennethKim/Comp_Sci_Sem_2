import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();

	int Rando1 = rand.nextInt(10);
	System.out.println(Rando1);
	
	int Rando2 = rand.nextInt(100+1);
	System.out.println(Rando2);
	
	double rand_num2 = rand.nextDouble();
	System.out.println(rand_num2+2.5);
	
	int Rando3 = rand.nextInt(574+15);
	System.out.println(Rando3+rand_num2);
	
	}
}
