import java.util.Scanner;
import java.util.Random;

class dog{
	String name;
	int age;
	String breed;
	//Empty Constructor
	public dog(){
		name = "Clifford";
		age = 3;
		breed = "big red Dog";
	}
	//Name Constructor
	public dog(String a){
		name = a;
		age = 1;
		breed="dog dog";
	}
	//Name breed constructor
	public dog(String name2, String breed2){
		name = name2;
		breed = breed2;
		age = 1;
	}
	//Name age constructor
	public dog(String name3, int age2){
		name = name3;
		age = age2;
		breed ="dog dog";
	}
	
	public void setName(String name4){
		name = name4;
	}
	public void setAge(int age3){
		age = age3;
	}
	
	public void setBreed(String breed3){
		breed = breed3;
	}

	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public boolean isSleeping(){
		Random rand = new Random();
		boolean Rando1 = rand.nextBoolean();
		return Rando1;
	}
	
	public void bark(){
		System.out.println(name + " is barking");
	}

}

class starter {
	public static void main(String args[]) {
		dog x = new dog("Odie");
		System.out.println(x.getName());
		System.out.println(x.getAge());
		System.out.println(x.getBreed());
		dog y = new dog("собака", "ゴールデンレトリバー");
		System.out.println(y.getName());
		System.out.println(y.getAge());
		System.out.println(y.getBreed());
		if (x.isSleeping()){
			System.out.println(x.getName() + " is asleep");
		}
		else{
			x.bark();
			y.bark();
		}
		
		
	}
}



