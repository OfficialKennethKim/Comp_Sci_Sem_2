package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ascii {
	String type;		// What type of Ascii Art
	String name;		// What is Ascii arts name
	String oneLine;
	int number;			// How many times should it be printed

	//If undefined, type defaults to Human, name defaults to bob, and number defaults to 1.

	public Ascii() {			// Sets Ascii to default
		type = "Human";
		name = "Bob";
		number = 1;
		oneLine = "";
	}
	public Ascii(String a) {	// Sets Ascii type
		type = checkType(a);
		name = "Bob";
		number = 1;
		oneLine = "";
	}
	public Ascii(String a, String b) {	// Sets Ascii type and name
		type = checkType(a);
		name = b;
		number = 1;
		oneLine = "";
	}
	public Ascii(String a, int c) {	// Sets Ascii type and how many
		type = checkType(a);
		name = "Bob";
		number = c;
		oneLine = "";
	}
	public Ascii(String a, String b, int c) {	// Sets Ascii type, name, and how many
		type = checkType(a);
		name = b;
		number = c;
		oneLine = "";
	}
	private String checkType(String a){					// Checks if the input String a is valid
		if(a.equals("human") || a.equals("Human")){
			return "Human";
		}
		else if(a.equals("dog") || a.equals("Dog")){
			return "Dog";
		}
		else if(a.equals("cactus") || a.equals("Cactus")){
			return "Cactus";
		}
		else if(a.equals("wonder of u")||a.equals("wonder of u")){
			return "wonder of u";
		}	
		else if(a.equals("other") || a.equals("Other")){
			return "Other";
		}
		else{
			return "Human";
		}
	}

	public void setType(String a){		// Sets variable type to input
		type = checkType(a);
	}
	public void setName(String a){		// Sets variable type to input
		name = a;
	}
	public void setNumber(int a){		// Sets variable number to input
		number = a;
	}
	public void setAscii(String a){		// Set a one line Ascii of your choice
		oneLine = a;
	}

	public void printArt(){				// Prints out the name and the art number times
		System.out.println("Your Ascii Art's name is " + name + "!");
		int i = 0;
		while (i < number){
			if(type.equals("Human")){
				System.out.println("      ////^\\\\\\\\ ");
				System.out.println("      | ^   ^ | ");
				System.out.println("     @ (o) (o) @ ");
				System.out.println("      |   <   | ");
				System.out.println("      |  ___  | ");
				System.out.println("       \\_____/ ");
				System.out.println("     ____|  |____ ");
				System.out.println("    /    \\__/    \\ ");
				System.out.println("   /              \\ ");
				System.out.println("  /\\_/|        |\\_/\\ ");
				System.out.println(" / /  |        |  \\ \\ ");
				System.out.println("( <   |        |   > ) ");
				System.out.println(" \\ \\  |        |  / / ");
				System.out.println("  \\ \\ |________| / / ");
				System.out.println("   \\ \\|<I_D_I__|/ / ");
				System.out.println("    \\ \\ / I  \\ / / ");
				System.out.println("     \\ /  I   \\ / ");
				System.out.println("     |         | ");
				System.out.println("     |    |    | ");
				System.out.println("     |    |    | ");
				System.out.println("     |    |    | ");
				System.out.println("     |    |    | ");
				System.out.println("     | ## | ## | ");
				System.out.println("     |    |    |  ");
				System.out.println("     |    |    | ");
				System.out.println("     |____|____| ");
				System.out.println("     (____(____) ");
				System.out.println("      _| | _| | ");
				System.out.println("  cccC__Cccc___) ");
			}
			else if(type.equals("Dog")){
				System.out.println("^..^      / ");
				System.out.println("/_/\\_____/ ");
				System.out.println("   /\\   /\\ ");
				System.out.println("  /  \\ /  \\ ");
			}
			else if(type.equals("wonder of u")){
System.out.println("'''.c0NNK0K00K00OkxxdxO0K00O:',;:lll:;;,");
System.out.println(",;,.cXWNK00K0KOc.....,ok0000dc,';lc:;,,,");
System.out.println(",;,.;ONXK00K0Kl.     .;:dOK0O0x;,;;'....");
System.out.println("',,.:xO0K00KOo'         .:xO0K0Od;......");
System.out.println("'',.;x0XK000o,'.......''''cx0K0K0xc. ...");
System.out.println("'''.;OXXK00Kkdc;:;...';clok00K0K000d;...");
System.out.println("'.'.:00OK00K0Odloc....;ldk000KKK0000Oo,.");
System.out.println("'.'.;OK0K00K0kooxl;;,;cxxk0O0KKK00000Oko");
System.out.println("'.'.;OK0KK0Okd:ldc,,,;lxdc:oO0KK00000000");
System.out.println("'.'.,x00Odlldxl:::;,;lolccldoox0OO00K000");
System.out.println("'....,cc'  .;clccdxodxxloooo:;:cc:lk0000");
System.out.println("''....',.    .;:oOOkOxc;:::'.',,,,,:d000");
System.out.println(".'. .'...  .'cdkkkO00x:,'.      .'..l000");
System.out.println("...  .   ':dOO0kdxOxol'          . 'x00O");
System.out.println("...   .  ,dO00OddOOdlo,           .:k0Ok");
System.out.println("...       .'ldookOkold:            .lOO0");
System.out.println("...          ...;;''''.             'kXN");
System.out.println("...                                 ;KWW");
System.out.println(".......;l.                    .:.   :XMM");
System.out.println("'.  ..;x0c                    'o,   .OMM");
System.out.println(".   .,ck0d.                 ..lk;    lNM");
System.out.println(".   ':dXXl.   ....    .......:KWx.   ,0M");
System.out.println(".   ';kO;     .''....  ..'.  .xWX:   .OM");
System.out.println(".   .cO:        ...  .....    .kWk.   oW");
System.out.println("   .ox.         .'.       ....lNWk'   :K");
System.out.println("  .';xx.         ..        .':cxNMXc..cO");
System.out.println(",.',:ox'         .           'lOWM0c'.;x");
System.out.println("...,:oo.        .            .ckNNOxdllO");
System.out.println(";;cdkkd,     .,,,'..          'oXXOOOxlO");
System.out.println(",cxO0KKx'    .;;;;d:           :KWKkdoo0");
System.out.println(",:oookkd;.   .;:;;o;       ..'lKWMNOxxc;");
System.out.println(",';::okxoo;..;:::;,.     .;:lOWK0Kd'lOoc");
System.out.println(",'...'ddcc'.:;...'.   .'cddlkWWl;xl.l0XW");
System.out.println("'',;,;dxdl..'.    ...;oxkkdlOWN:.ol;''xW");
System.out.println(".'';ccloOKo';;'..,:ccokxdcclkNNl..,;cxXM");
System.out.println(" ...;llxKK;.c:.,:;okd:'...,,cXM0ox0NMMMM");
System.out.println(" ...;dkdodc;;'.,:cd0Nx.     ;KMMWWMMMMMM");
System.out.println("  .,cxKx,;l,    ;oxk0O,     :XMMMMMMMMMM");
System.out.println(".,lodONXkOo.    .cxkOO:     oWMMMMMMMMMM");
System.out.println("cxKOxKWMMMx.    .oxxk0l    .OMMMMMMMMMMM");


			}
			else if(type.equals("Cactus")){
				System.out.println("  _  _ ");
				System.out.println(" | || | _");
				System.out.println("-| || || |");
				System.out.println(" | || || |-");
				System.out.println("  \\_  || |");
				System.out.println("    |  _/");
				System.out.println("   -| | \\ ");
				System.out.println("    |_|- ");
			}
			else if(type.equals("Other")){
				System.out.println(oneLine);
			}
			else{
				System.out.println("How did I get here...");
			}
			i++;
		}
	}

	

}
