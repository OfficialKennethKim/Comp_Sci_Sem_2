import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int Rando1 = rand.nextInt(1000);
		System.out.println("Guess the right number");
		int guess = sc.nextInt();
		
		
		while(true)
		{
			if(guess != Rando1)
			{
				System.out.println("Wrong");
				guess = sc.nextInt();
			}
			else if(guess == Rando1)
			{
				System.out.println("Correct");
				break;
			}
		}
		
	}
}