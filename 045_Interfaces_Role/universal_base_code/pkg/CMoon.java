package pkg;
import java.util.Scanner;
import java.util.Random;


public class CMoon {
	public Random rand = new Random();
	public String name;
	public int health = rand.nextInt(15)+1;
	public int attack = rand.nextInt(15)+1;
	
	public CMoon(){
		name = "Apollo";
		this.health = health;
		this.attack = attack;
	}
		
	public CMoon(String name){
		this.name=name;
		this.health = health;
		this.attack = attack;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public int getHealth(){
		return health;
	}
	
	public String getName(){
		return name;
	}
	
	public void attack(Role a){
		int attack = rand.nextInt(15)+1;
		b.setHealth(getHealth()-attack);
	}
	

	
	
	
	
}


