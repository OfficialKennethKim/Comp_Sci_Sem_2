import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		int number1 = rand.nextInt(99);
		System.out.println(number1);
		
		int number2 = rand.nextInt(99);
		System.out.println(number2);
	
		if(number1 > number2){
			System.out.println("number1 is greater than number 2");
		}
		
		else if(number2 > number1){
			System.out.println("number1 is less than number2");
		}
		
		else{
			System.out.println("number1 and 2 are equal");
		}
		
		}


	}

