package pkg;
import java.util.Scanner;
import java.util.Random;


public class Case {
    //risk 1 = $100000, 5% success
    //risk 2 = $50000, 10% success
    //risk 3 = $9700, 40% success
    //risk 4 = $8400, 50% success
    //risk 5 = $6000, 60% success
    //risk 6 = $3000, 70% success
    //risk 7 = $2200, 80% success
    //risk 8 = $1200, 85% success
    //risk 9 = $800, 90% success
    //risk 10 = $300, 95% success
    
    Random rand = new Random();
    int rand_num1 = rand.nextInt(100)+1; //risk 1, 5%
    if (rand_num1 == 1){
        System.out.println("You Won the case and got $100000");
    }
    else if (rand_num1 == 2){
        System.out.println("You Won the case and got $100000");
    }
    else if (rand_num1 == 23){
        System.out.println("You Won the case and got $100000");
    }
    else if (rand_num1 == 43){
        System.out.println("You Won the case and got $100000");
    }
    else if (rand_num1 == 6){
        System.out.println("You Won the case and got $100000");
    }
    else{
        System.out.println("You lost the case you overconfident bozo");
    }
    
    int rand_num1 = rand.nextInt(100)+1;//risk 2, 10%
        if (rand_num1 >= 1 && rand_num1 <= 10){
            System.out.println("You won the case and got $50000!");
        }
    else{
        System.out.println("You lost the case you bozo");
    }
    
    
    
    int rand_num1 = rand.nextInt(100)+1;//risk 3, 40%
        if (rand_num1 >= 1 && rand_num1 <= 40){
            System.out.println("You won the case and got $50000!");
        }
    else{
        System.out.println("You lost the case you bozo");
    }
    
    
    
    int rand_num1 = rand.nextInt(100)+1;//risk 4, 50%
        if (rand_num1 >= 1 && rand_num1 <= 50){
            System.out.println("You won the case and got $50000!");
        }
    else{
        System.out.println("You lost the case you bozo");
    }
   
   
   
    int rand_num1 = rand.nextInt(100)+1;//risk 5, 60%
        if (rand_num1 >= 1 && rand_num1 <= 60){
            System.out.println("You won the case and got $50000!");
        }
    else{
        System.out.println("You lost the case you bozo");
    }
    
    
    
    int rand_num1 = rand.nextInt(100)+1;//risk 6, 70%
        if (rand_num1 >= 1 && rand_num1 <= 70){
            System.out.println("You won the case and got $50000!");
        }
    else{
        System.out.println("You lost the case you bozo");
    }
    
    
    int rand_num1 = rand.nextInt(100)+1;//risk 7, 80%
        if (rand_num1 >= 1 && rand_num1 <= 80){
            System.out.println("You won the case and got $50000!");
        }
    else{
        System.out.println("You lost the case you bozo");
    }
    
    
    int rand_num1 = rand.nextInt(100)+1;//risk 8, 85%
        if (rand_num1 >= 1 && rand_num1 <= 85){
            System.out.println("You won the case and got $50000!");
        }
    else{
        System.out.println("You lost the case you bozo");
    }
    
    
    int rand_num1 = rand.nextInt(100)+1;//risk 9, 90%
        if (rand_num1 >= 1 && rand_num1 <= 90){
            System.out.println("You won the case and got $50000!");
        }
    else{
        System.out.println("You lost the case you bozo");
    }
    
    
    int rand_num1 = rand.nextInt(100)+1;//risk 10, 95%
        if (rand_num1 >= 1 && rand_num1 <= 95){
            System.out.println("You won the case and got $50000!");
        }
    else{
        System.out.println("You lost the case you bozo");
    }
}