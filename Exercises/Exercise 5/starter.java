import java.util.Scanner;


class cat{
	String name;
	
	public cat(){
		name = "Garfield";
	}
	public cat(String a){
		name = a;
	}
	public void meow(){
		System.out.println(name + " MEOW");
		return;
	}
} 

class starter {
	public static void main(String args[]) {
		cat x = new cat();
		cat y = new cat("Tom");
		x.meow();
		y.meow();
		
	}
}
