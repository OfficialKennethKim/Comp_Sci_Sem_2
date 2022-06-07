import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int y){
		int c = 1;
		int b = x;
		while(true){
			if(c == y)
			{
				break;
			}
			c++;
			b = b*x;
			
		}
		return b;
		
	}
	public static void main(String args[]) {
		System.out.println(pow(2,5));



		
	}
}
