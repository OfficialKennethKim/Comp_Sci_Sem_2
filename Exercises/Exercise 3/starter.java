import java.util.Scanner;

class starter {
	
	public static int Matthew(int int1, int int2 ){
		int int3 = (int1 * int2);
		
		System.out.println("They both multiply to become " + int3);
		if(int3 %3 == 0){
			System.out.println("They are divisible by 3");
		}
		
		else{
			System.out.println("They are not divisible by 3");
		}
		
		return int3;
		
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a integer");
		int int1 = sc.nextInt();
		System.out.println("Choose a second integer");
		int int2 = sc.nextInt();
		System.out.println(Matthew(int1, int2));
	
} 
}

