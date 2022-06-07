import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Parrot[] yes = new Parrot[5]; 
		yes[0] = new Parrot("A", 3, true);
		yes[1] = new Parrot("B", 6, false); 
		yes[2] = new Parrot("C", 9, true); 
		yes[3] = new Parrot("D", 10, true); 
		yes[4] = new Parrot("E", 3, false); 
		
		System.out.println(); 
		yes[0].trick(); 
		yes[1].trick();
		yes[2].trick();
		yes[3].trick();
		yes[4].trick();
		
		System.out.println(); 
		Parrot A= new Bat();						
		Parrot B = new Bat(36);					
		PArrotC = new Bat(true);					
		Parrot D = new Bat("Bat1");					
		Parrot E = new rat("Bat2", true);	
	
		System.out.println();
		Bat1.trick();							
		Bat2.trick();								
		