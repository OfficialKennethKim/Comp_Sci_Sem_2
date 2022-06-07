package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;
	public void myToString(String a, int b, int c, int d, int e, int f) {
		role = a;
		strength = b;
		dexterity = c;
		intelligence = d;
		constitution = e;
		charisma = f;
		
	}
	public void CheckRole(){
		System.out.println("Your role is wizard");
		System.out.println("Your stregnth trait is 0");
		System.out.println("Your dexterity trait is 0");
		System.out.println("Your intelligence trait is 0");
		System.out.println("Your constitution trait is 0");
		System.out.println("Your charisma trait is 0");
	}

}

