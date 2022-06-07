import java.util.Scanner;
import java.util.Random;

class starter {
	public static boolean checkPrime(int prime)	{
		int c = prime-1;
		while(true)
		{
			if(prime %c == 0){
			return false;
			}
			if (c == 2){
			return true;
			}
			c = c-1;
		}
	}
	
	public static void printPrimes (int a)	{
		
		int d = a-1;
		while(true)
		{
			if(checkPrime(d)){
			System.out.println(d);
			}
			if(d==2){
				return;
			}
			d = d-1;
		}
	}
		
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gimme an integer");
		int prime = sc.nextInt();
		printPrimes(prime);
	}
}
