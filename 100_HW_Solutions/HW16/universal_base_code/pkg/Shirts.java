package pkg;
import java.util.Scanner;
import java.util.Random;


public class Shirts extends Clothing{
	String material;
	public Shirts{
		price = 10;
		producer = "Abercrombie";
		color = "Turd Brown";
		material = "Human Flesh";
	}
	public int changetemperature(int a){
		temperature = a;
		return temperature;	
	}
}
