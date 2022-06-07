package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer {
	public String instrument;
	
	public Musician(){
		name = "Doja Cat";
        age = 26;
        instrument = "Cello";
	}
	public Musician(String a){
		instrument = a;
	}
	public String getInstrument(){
		return instrument;
	}
	
	public void playInstrument(){
		System.out.println(name + " plays the instrument");
	}
}

