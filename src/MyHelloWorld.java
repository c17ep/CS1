import java.util.Scanner;

/* Author: Erin Paglione
 * Date: Dec 10, 2015
 * Description: Computer asks some questions and tells us what we said.
 */

public class MyHelloWorld {
	public static void main(String[] args) {
		
		// declarations
		String name;
		int age;
		Scanner scan = new Scanner(System.in);
		Boolean play = true;
		String answer;
		
		while (play) {
			
			// talking to the computer
			System.out.println("What is your name?");
			name = scan.nextLine();
			System.out.println("Hi " + name);
			
			System.out.println("How old are you?");
			age = scan.nextInt();
			scan.nextLine();
			System.out.println("You are " + age + " years old");
			
			// check the age
			if (age < 18) {
				System.out.println("Sorry, you're too young to vote.");
			}
			else {
				System.out.println("Welcome to the voting booth.");
			}
			
			// see if they want to play again
			// if not stop the program
			System.out.println("Play Again? Y/N");
			answer = scan.nextLine();
			if (answer.equals("N")) {
				play = false;
			}
			
		}
		
		// cleaning up
		scan.close();
	}
}
