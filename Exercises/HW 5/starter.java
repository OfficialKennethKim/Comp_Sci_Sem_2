import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int dollars = 100;
		while (true)
		{
			System.out.println("Do you want to play?");
			String a = sc.nextLine();
			if ((a.equals("yes")) || (a.equals("Yes") || (a.equals("Y")  || (a.equals("y"))))){
				System.out.println("You will play the game");
			}
			else if ((a.equals("no")) || (a.equals("No") || (a.equals("N")  || (a.equals("n"))))){
				System.out.println("REAUIUJOGVHEOUHJRTGREOU");
				break;
			}
			else {
				System.out.println("Failure");
				break;
			}
			
			System.out.println("How much would you like to wager? (The maximum wager is "+ dollars +")");
			int wager = sc.nextInt();
			String dumb = sc.nextLine();
			if (dollars - wager < 0){
			System.out.println("Game Over");
			break;
			}
		
			int Rando1 = rand.nextInt(10);
			int Rando2 = rand.nextInt(10);
			int Rando3 = rand.nextInt(10);
			System.out.println(" " + Rando1 + " " +  Rando2 + " " + Rando3 );
			
			if (Rando1 == Rando2 && Rando2 != Rando3 && Rando1 != Rando3) {
			dollars = dollars +  wager*2 - wager;
			System.out.println(dollars);
			}
			
			else if (Rando2 == Rando3 && Rando1 != Rando3 && Rando1 != Rando2) {
			dollars = dollars +  wager*2 - wager;
			System.out.println(dollars);
			}
			
			else if (Rando1 == Rando3 && Rando2 != Rando3 && Rando1 != Rando2) {
			dollars = dollars +  wager*2 - wager;
			System.out.println(dollars);
			}
			
			else if (Rando1 == Rando2 && Rando1 == Rando3 && Rando2 == Rando3 ) {
			dollars = dollars +  wager*3 - wager;
			System.out.println(dollars);
			}
			
			else if(Rando1 != Rando2 && Rando1 != Rando3 && Rando2 != Rando3) {
			dollars = dollars - wager;
			System.out.println(dollars);
			}
			

		}
		
		
		
		
} 
}

