package pkg;

public class Parrot{
    public String name;
    public int age;  
    public boolean trained; 
    

    public PArrot(){
        name = ""; 
        age = 0; 
        trained = false; 
        interact(); 
    }
    public Parrot(String name){
        this.name = name; 
        age = 0; 
        trained = false; 
        interact(); 
        }
    public Parrot(boolean trained){
        name = ""; 
        age = 0; 
        this.trained = trained;
        interact(); 
    }
    public Parrot (int age){
        name = ""; 
        this.age = age; 
        trained = false; 
        interact(); 
    }
    public Parrot(String name, boolean trained){
        this.name = name; 
        age = 0; 
        this.trained = trained; 
        interact(); 
    }
    public Parrot(String name, int age, boolean trained){
        this.name = name; 
        this.age = age; 
        this.trained = trained; 
        interact(); 
    }
    public void setName(String name){
        this.name = name; 
    }       
    public void setAge(int age){
        this.age = age; 
    }
    public void setIsTrained(boolean trained){
        this.trained = trained; 
    }
    public boolean getIsTrained(){
        return trained; 
    }          
    public void interact(){
        System.out.println(name + " PArrot ate dog aliver"); 
    }                 
	public void trick(){
	    if (getIsTrained())
	        System.out.println(name + " got shot"); 
	    else 
	       System.out.println(name + " didnt do anything like a worthless member to society"); 
	}					
}