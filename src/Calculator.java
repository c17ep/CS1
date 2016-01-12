import java.util.Scanner;

/*
 * Calculator Program
 * by: Erin Paglione
 * 
 * PLAN:
 * take operands
 * choose an operator
 * do math
 * print out the answer
 * 
 * TODO:
 * subtraction
 * multiplication
 * division
 * exponentiation
 */

public class Calculator {
	
	public static void main(String[] args) {
		// declarations:
		int operand1;
		int operand2;
		char operator;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		
		// take operands
		System.out.println("Please input the first operand: ");
		operand1 = scan.nextInt();
		System.out.println("Please input the second operand: ");
		operand2 = scan.nextInt();
		scan.nextLine();
		
		// choose operator
		System.out.println("Please choose the operator: ");
		operator = scan.nextLine().charAt(0);
		
		// do math
		if(operator == '+') {
			result = operand1 + operand2;	
		}
		else if(operator == '-') {
			result = operand1 - operand2;
		}
		else if(operator == '*' || operator == 'x') {
			result = operand1 * operand2;
		}
		else if(operator == '/') {
			result = operand1 / operand2;
		}
		
		// show result
		System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
		
		scan.close();
	}
	
}
