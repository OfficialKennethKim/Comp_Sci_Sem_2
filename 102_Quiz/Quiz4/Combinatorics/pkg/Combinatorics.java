package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatorics {
	public int factorial(int n){
		b=n;
		
		while(b >= 1){
			b=b-1;
			n=n*b;
		}
		
		return n;
		
	}
	public static void NumCombination(int n, int r){
		
		if(n<r){
			System.out.println("No possible combination");
		}
		int d=0;
		else{
			d=factorial(n)/factorial(r)*factorial(n-r);``
			SYstem.out.println("There are" + d + "total combiantions");
		}
	}
	
	

}
