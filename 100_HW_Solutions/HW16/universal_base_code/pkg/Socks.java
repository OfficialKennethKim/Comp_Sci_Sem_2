package pkg;
import java.util.Scanner;
import java.util.Random;


public class Socks extends Clothing{
    String type;
    String shape;
	public Socks{
	    price = 12;
	    producer = "Mikales";
	    color = "Mr.Poole";
	    type = "¯\_(ツ)_/¯";
	}
	public String changeColor(String a){
	    shape = a;
	    return shape;
	}
}
