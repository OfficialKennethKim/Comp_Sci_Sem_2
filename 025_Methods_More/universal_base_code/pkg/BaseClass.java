package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;

	public String setRole(String a){
		role = a;	
		return a;
	}
		
	public int setStrength(int b){
		strength = b;
		return b;
	}
	public int setDexterity(int c){
		dexterity = c;
		return c;
	}
	public int setIntelligence(int d){
		intelligence = d;
		return d;
	}
	public int setConstitution(int e){
		constitution = e;
		return e;
	}
	public int setCharisma(int f){
		charisma = f;
		return f;
	}
	public boolean setAll(String a, int b, int c, int d, int e, int f){
		role = a;
		strength = b;
		dexterity = c;
		intelligence = d;
		constitution = e;
		charisma = f;
		return true;
	}
	}
	
	


