import java.util.*;

class starter {
	public static void printArrayList(ArrayList<Integer> a){
		for(int i = 0; i<a.size(); i++){			
			System.out.println(a.get(i));
		}
			
	}
	
	public static void addValuesArrayList(int c,ArrayList<Integer> b){
		Random rand = new Random();	
		for(int i = 0; i<=c; i++){
			int a = rand.nextInt(100)+1;
			b.add(a);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		System.out.println("How many values would you like to add?");
		int z = sc.nextInt();
		addValuesArrayList(z,b);
		printArrayList(b);



	}
}
