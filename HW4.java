import java.util.scanner;

class starter {
	public static void main(String args[]) {
		
			Scanner sc = new Scanner(System.in);

	System.out.println("Choose a number idiot");
	
	int number1 = sc.nextInt();
	System.out.println("Choose a second number ya moron");
	
	int number2 = sc.nextInt();
	System.out.println(number1 % 2);
	System.out.println(number2 % 2);
	
	if (number1 == 0){
		System.out.println("Your first number is even");
	}
	
	else{
		System.out.println("Your first number is odd");
	}
	
	if (number2 == 0){
		System.out.println("and the second one is even");
	}
	
	else{
		System.out.println("and the second one is odd");
	}
	
	System.out.println(number1 % 3);
	System.out.println(number1 % 4);
	System.out.println(number1 % 5);
	
	if (number1 == 0){
		System.out.println("Your first number is divisible by 3");
	}
	
	else if(number1 == 0){
		System.out.println("Your first number is divisble by 4");
	}
	
	else if(number1 == 0){
		System.out.println("Your first number is divisible by 5");
	}
	
	else{
		System.out.println("Your first number is not divisble by these 3 numbers");
	
	}
	
	System.out.println(number2 % 3);
	System.out.println(number2 % 4);
	System.out.println(number2 % 5);
	
	if (number2 == 0){
		System.out.println("Your second number is divisible by 3");
	}
	
	else if(number2 == 0){
		System.out.println("Your second number is divisble by 4");
	}
	
	else if(number2 == 0){
		System.out.println("Your second number is divisible by 5");
	}
	
	else{
		System.out.println("The second number is not divisible by these 3 numbers");
	}
} 
}

