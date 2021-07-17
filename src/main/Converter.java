package main;
import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Variables
		int menuSelection = 1;
		int Quit=0;

		double result;
		
	// 2. While loop
		while( menuSelection != Quit) {
			System.out.println( "Please select an option:\n" +  
								 "1. Teaspoons to Cups\n"
								+ "2. Miles to Kilometers\n"
								+ "3. US Gallons to Imperial Gallons\n"
								+ "4. Quit"
			);
			
	// User Input for option
		Scanner s = new Scanner(System.in);
		int Selection = s.nextInt(); //nextInt();
			
	//switch operation
		switch(Selection) {
		case 1:
				System.out.println( "How many teaspoons?");
				s = new Scanner(System.in);
			
					i = s.nextInt(); //nextInt();
					j = i * 48;
					System.out.println("There are " + j + " teaspoons in " + i + " cups.");
					break;
			
				case 2:
					double Mi2Km = 0.621371;
			
					System.out.println( "How many miles?");
					i = s.nextInt(); //nextInt();
			
					result = (double)i * Mi2Km;
					System.out.println("There are " + result + " kilometers in " + i + " miles.");
					break;
			
				case 3:
					System.out.println( "How many US Gals?");
					i = s.nextInt(); //nextInt();
					
					result = (double)i * 0.832674;
					System.out.println("There are " + result + "US gals in " + i + " Imperial gals.");
					break;	
			
				case 4:
					menuSelection = 0;
					System.out.println("GoodBye!");
					break;
				
				default:
					System.out.println("Try again...Please enter a number between 1 and 4.");
					break;
					
			}
			System.out.println("--------------------------------");
		}
	}

}
