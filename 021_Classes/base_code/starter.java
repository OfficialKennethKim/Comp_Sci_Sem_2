import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Wizard");
	int Strength  = 5;
	int Dexterity = 5;
	int Intelligence = 5;
	int Constitution = 5;
	int Charisma = 5;
}

class starter{
	public static void main(String args[]) {
		Character a = new Character();
		System.out.println(a.role);
		System.out.println(a.Strength);
		System.out.println(a.Dexterity);
		System.out.println(a.Intelligence);
		System.out.println(a.Constitution);
		System.out.println(a.Charisma);
	}
}
