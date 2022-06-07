import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose between a wizard, warrior, or a rogue");
		String role=sc.nextLine();
		if (role == ("wizard")){
			System.out.println("You are now a wizard!");
		}
	
		else if(role == ("warrior")){
			System.out.println("You are now a warrior!");
		}
		
		else if(role == ("rogue")){
			System.out.println("You are now a rogue!");
		}
		
		else if(role == ("Wizard")){
			System.out.println("You are now a wizard!");
		}
		
		else if(role == ("Warrior")){
			System.out.println("You are a warrior!");
		}
		
		else if(role == ("Rogue")){
			System.out.println("You are a rogue!");
		}
		
		else {
			System.out.println("Thats not a role you idiot");
		}
	}
}
