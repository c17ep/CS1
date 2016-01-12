import java.util.Scanner;

public class Madlibs {
	public static void main(String[] args) {
		// declarations
		Scanner input = new Scanner(System.in);
		String noun1;
		int number1;
		String adjective1;
		String place;
		double number2;
		char tf;
		
		System.out.println("adjective: ");
		adjective1 = input.nextLine();
		System.out.println("place: ");
		place = input.nextLine();
		System.out.println("noun: ");
		noun1 = input.nextLine();
		System.out.println("number: ");
		number1 = input.nextInt();
		input.nextLine();
		System.out.println("t/f: ");
		tf = input.nextLine().charAt(0);
		
		if(tf != 't' && tf != 'f') {
			System.out.println("Please type 't' or 'f': ");
			tf = input.nextLine().charAt(0);
		}
		
		System.out.println("number: ");
		number2 = input.nextDouble();
		
		if(tf == 't') {
		System.out.println("There was once a " + adjective1 + " turtle who lived in " + place + "."
				+ "  The turtle only had " + number1 + " friends and was very lonely. \n"
				+ "  One day the turtle met a " + noun1 + "."
				+ "  The sun shone for " + number2 + " hours.");
		}
		
		input.close();
	}
}
