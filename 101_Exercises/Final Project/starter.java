import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("What is your lawyer name?");
		String name = sc.nextLine();
		
		System.out.println("Time to meet your client");
		int bozo = rand.nextInt(21);
		Client one = new Client(bozo);
		
		
		
	}
}
