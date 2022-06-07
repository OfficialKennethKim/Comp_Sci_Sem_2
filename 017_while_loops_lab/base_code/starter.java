import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times would you like your name to be repeated?");
		int repeat = sc.nextInt();
		
			
		int c = 0;
		while(true)
		{
			System.out.println(name);
			if(c == repeat)
			{
				break;
			}
			c=c+1;
		}


		
	}
}
