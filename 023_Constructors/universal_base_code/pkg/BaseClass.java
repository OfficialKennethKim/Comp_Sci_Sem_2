package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	public String role;
	public BaseClass(){
		role = "no role";
	}
	
	public BaseClass(String a) {
		role = a;
	}
	
	public void CheckRole(){
		
		if (role.equals("wizard")|| role.equals("Wizards")){
			System.out.println("You are now a wizard!");
		}
	
		else if(role.equals("warrior")|| role.equals("Warrior")){
			System.out.println("You are now a warrior!");
		}
		
		else if(role.equals("rogue")|| role.equals("Rogue")){
			System.out.println("You are now a rogue!");
		}
		else {
			System.out.println("No Role");
		}
}

}	
	




