package pkg;
import java.util.Scanner;
import java.util.Random;

public class Dwarf{
	String name;
	int age;
	
	public String getname(){
		return name;
	}
	
	public int getage(){
		return age;
	}
	
	public Dwarf(){
		this("", 0);
	}
	
	public Dwarf(String Dwarf){
		this.name = "";
	}
	
	public Dwarf(int age){
		this.age = 0;
	}
	
	public Dwarf(String Dwarf, int a){
		this.name = "";
		this.age = 0;
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public void setage(int age){
		this.age = age;
	}
	
}

