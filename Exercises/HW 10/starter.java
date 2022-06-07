import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[]arnold = new int[20];
		Random rand = new Random();
		int Rando1 = rand.nextInt(10);
		System.out.println(Rando1 + " This is your random number");
		
		int c = 0;
		while(c<20){
			arnold[c] = rand.nextInt(10)+ 1;
			c++;
		}
		
		c=0;
		int c2=0;
		while(c<20){
			if (arnold[c]==Rando1){
				System.out.println(arnold[c]);
				c++;
				c2++;
			}
			else{
				c++;
			}
		}
		
		c=0;
		while(c<19){
			if(arnold[c]==arnold[c+1]){
				System.out.println("index " + c + " = " + arnold[c]);
				System.out.println("index " + (c+1) + " = " + arnold[c+1]);
			}
		}
		System.out.println("Number of duplicates: "  + c2);
}
}