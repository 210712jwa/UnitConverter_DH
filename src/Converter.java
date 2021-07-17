
import java.util.Scanner;

class Converter {
	static double i;
	static double j;
	static double result;
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Variables
		int menuSelection = 1;
		int Quit = 0;

		// While loop
		while (menuSelection != Quit) {
			System.out.println("Please select(1-4) from the options below:\n" 
								+ "1. Teaspoons to Cups\n" 
								+ "2. Miles to Kilometers\n"
								+ "3. US Gallons to Imperial Gallons\n" 
								+ "4. Quit");

			// User Input for option
			//Scanner s = new Scanner(System.in);
			int Selection = s.nextInt(); // nextInt();
			// switch operation
			switch (Selection) {
			case 1:
				Tsp2Cups();
				break;
			case 2:
				Mi2Km();
				break;
			case 3:
				USgaltoIgal();
				break;
			case 4:
				menuSelection = 0;
				System.out.println("GoodBye!");
				break;
			default:
				System.err.println("Try again...Please enter a number between 1 and 4.");
			}
		System.out.println("------------------------------------------------\n");
		}
		
	}
	
	// static methods is used here so there is no need to create an instance
	public static void Tsp2Cups() {
		System.out.println("How many teaspoons?");
		i = s.nextDouble(); // nextInt();
		j = i * 48;
		System.out.println("There are " + j + " teaspoons in " + i + " cups.");
	}

	public static void Mi2Km() {
		double Mi2Km = 0.621371;
		System.out.println("How many miles?");
		i = s.nextDouble(); // nextInt();
		result = i * Mi2Km;
		System.out.println("There are " + result + " kilometers in " + i + " miles.");
	}

	public static void USgaltoIgal() {
		System.out.println("How many US Gals?");
		i = s.nextDouble(); // nextInt();
		result = i * 0.832674;
		System.out.println("There are " + result + "US gals in " + i + " Imperial gals.");
	}
}