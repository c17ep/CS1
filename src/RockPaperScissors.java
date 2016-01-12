import java.util.Scanner;

/* 
 * Author: Erin Paglione
 * Date: Jan 11, 2016
 * Description:
 * User chooses a weapon
 * Computer chooses a random weapon
 * Who wins?
 * Display winner
 * 
 */

public class RockPaperScissors {

	public static void main(String[] args) {

		// declare variables
		Scanner scan = new Scanner(System.in);
		String user = "";
		boolean repeat = true;
		String computer = "";
		double random = Math.random();
		boolean play = true;
		String answer = "";

		while (play) {

			// user chooses a weapon
			System.out.println("Choose a weapon (rock, paper, or scissors):");
			user = scan.nextLine();

			// check if user input was a "rock", "paper", or "scissors"
			repeat = true;
			while (repeat) {
				if (user.equals("rock") || user.equals("paper")
						|| user.equals("scissors")) {
					repeat = false;
				} else {
					System.out
							.println("Sorry.  I didn't understand.  Please type rock, paper, or scissors.");
					user = scan.nextLine();
				}
			}

			// computer chooses a weapon
			if (random < .33333333333333333) {
				computer = "rock";
			} else if (random < .66666666666666667) {
				computer = "paper";
			} else {
				computer = "scissors";
			}
			System.out.println("Computer chose " + computer);

			// check who wins and display winner
			if (user.equals("rock") && computer.equals("scissors")
					|| user.equals("paper") && computer.equals("rock")
					|| user.equals("scissors") && computer.equals("paper")) {
				System.out.println("You win!");
			} else if (user.equals(computer)) {
				System.out.println("It's a tie!");
			} else {
				System.out.println("You lose!");
			}

			// ask if the user wants to play again
			System.out.println("Play again? y/n");
			answer = scan.nextLine();
			if (answer.equals("n")) {
				play = false;
			}

		}

		scan.close();
	}

}
