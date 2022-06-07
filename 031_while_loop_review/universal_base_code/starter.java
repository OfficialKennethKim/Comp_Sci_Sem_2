import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int c = 1;
		while(c<101){
			int a = rand.nextInt(100)+ 1;
			System.out.println(a);
			c++;
		}
		
		
		
	}
}
