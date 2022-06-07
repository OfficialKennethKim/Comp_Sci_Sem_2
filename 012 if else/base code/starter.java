import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int random1 = rand.nextInt(999);
		System.out.println(random1);
		
		int userguess = rand.nextInt(999);
		System.out.println(userguess);
		
		if (random1 == userguess)
		System.out.println("Correct");
		
		if (random1 != userguess);
		System.out.println("Not correct");
	
	
	}
}
