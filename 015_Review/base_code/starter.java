import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name");
		String name = sc.nextLine();
		System.out.println("What is your title");
		String title = sc.nextLine();


		System.out.println("Choose between a pirate, revolutionary officer, or a marine");
		String role=sc.nextLine();

		if (role.equals("pirate")){
			System.out.println("You are now a pirate!");
		}
	
		else if(role.equals("revolutionary officer")){
			System.out.println("You are now a revolutionary officer!");
		}
		
		else if(role.equals("marine")){
			System.out.println("You are now a marine!");
		}
		
		else if(role.equals("Pirate")){
			System.out.println("You are now a pirate!");
		}
		
		else if(role.equals("Revolutionary officer")){
			System.out.println("You are a revolutionary officer!");
		}
		
		else if(role.equals("Marine")){
			System.out.println("You are a marine!");
		}
		
		else {
			System.out.println("Thats not a role you idiot");
			return;
		}
		System.out.println("ZEHAHAHAHA CHOOSE YOUR SKILL POINTS");
		
		System.out.println("You have 25 points to use on Strength, Dexterity, Intelligence, Constitution, or Charisma.");
		
		int points=25;
		
		System.out.println("How many points will be put into Strength, I wonder?");
		int Strength=sc.nextInt();
		if(Strength>10 || Strength>points){
			System.out.println("Illegal amount");
			return;
		}
		points-= Strength;
		System.out.println("There are " + points + " points left");
		
		System.out.println("How many points will be put into Dexterity, I wonder");
		int Dexterity=sc.nextInt();
			if(Dexterity>10 || Dexterity>points){
			System.out.println("Illegal amount");
			return;
		}
		points-= Dexterity;
		System.out.println("There are " + points + " points left");
		
		System.out.println("How many points will be put into Intelligence, I wonder");
		int Intelligence=sc.nextInt();
			if(Intelligence>10 || Intelligence>points){
			System.out.println("Illegal amount");
			return;
		}
		points-= Intelligence;
		System.out.println("There are " + points + " points left");
		
		System.out.println("How many points will be put into Constitution, I wonder");
		int Constitution=sc.nextInt();
			if(Constitution>10 || Constitution>points){
			System.out.println("Illegal amount");
			return;
		}
		points-= Constitution;
		System.out.println("There are " + points + " points left");
		
		System.out.println("How many points will be put into Charisma, I wonder");
		int Charisma=sc.nextInt();
			if(Charisma>10 || Charisma>points){
			System.out.println("Illegal amount");
			return;
		}
		points-= Charisma;
		System.out.println("There are " + points + " points left");
		if (points>0){
			System.out.println("You did not put enough points in");
			return;
		}
		System.out.println("Your name is " + name);
		System.out.println("Your title is " + title);
		System.out.println("Strength points: " + Strength);
		System.out.println("Dexterity points: " + Dexterity);
		System.out.println("Intelligence points: " + Intelligence);
		System.out.println("Constitution points: " + Constitution);
		System.out.println("Charisma points: " + Charisma);
		}
	}