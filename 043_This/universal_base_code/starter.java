import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		Dwarf[] x = new Dwarf[100];
		int a; 
		String name = ""; 
		for(int i=0; i<100; i++){
			x[i] = new Dwarf();
			
			a = rand.nextInt(7);
			if(a == 0)
			name = "Grumpy"; 
			else if (a == 1) 
			name = "Dopey";
			else if (a == 2)
			name = "Doc";
			else if (a == 3)
			name = "Happy";
			else if (a == 4)
			name = "Bashful";
			else if (a == 5)
			name = "Sneezy";
			else if (a == 6)
			name = "Sleepy";
		System.out.println(name + a);
			}
		}
		//int a = rand.nextInt(100);
		
		
	}
	
