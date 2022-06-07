import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		int c = 26;
		int d = 21;
		while(true)
		{
			d = d-1;
			c = c-1;
			if(d > -1)
			{
				System.out.println(c);
			}
			else{
				break;
			}
		}
	
} 
}

