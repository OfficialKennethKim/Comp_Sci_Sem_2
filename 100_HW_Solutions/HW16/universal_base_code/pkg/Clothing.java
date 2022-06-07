package pkg;
import java.util.Scanner;
import java.util.Random;


public class Clothing{
    int price;
    String producer;
    String color;
    public Clothing{
        price = 9;
        producer = "Patagonia";
        color = "red";
    }
    public int changePrice(int a){
        price = a;
        return price;
    }
    public String changeColor(String b){
        color = b;
        return color;
    }
    
    
}
