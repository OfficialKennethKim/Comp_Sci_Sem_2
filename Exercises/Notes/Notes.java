import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int y =sc.nextInt();
		int x = y-1;
		while(true)
		{
				System.out.println(y);
				y = y*x;
				if(x ==1)
				{
					break;
				}
				x = x-1;
		}
		
	
	
} 
}

