import java.util.Scanner;

/* Author: Erin Paglione
 * Date: Jan 5, 2016
 * Description: Computer solves the quadratic formula
 */

public class QuadraticFormula {
	public static void main(String[] args) {
		// declare variables
		Scanner scan = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double sol1 = 0;
		double sol2 = 0;
		double sol1a = 0, sol1b = 0, sol2a = 0, sol2b = 0;
		// double a=0, b=0, c=0, sol1=0, sol2=0; also works for lines 12-16
		
		// talk to user
		System.out.print("a: ");
		a = scan.nextDouble();
		System.out.print("b: ");
		b = scan.nextDouble();
		System.out.print("c: ");
		c = scan.nextDouble();
		
		// solve the quadratic formula
		// check if discriminant is negative
		if (Math.pow(b, 2) - 4*a*c >= 0) {
			sol1 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
			sol2 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
			
			// print answer
			System.out.println("x = " + sol1 + " , " + sol2);
		} else {
			sol1a = -b/(2*a);
			sol1b = (Math.pow(b, 2) - 4*a*c)/(2*a);
			sol2a = -b/(2*a);
			sol2b = (Math.pow(b, 2) - 4*a*c)/(2*a);
			
			// print answer
			System.out.println("x = " + sol1a + sol1b + "i , " + sol2a + sol2b + "i");
		}
		
		
		
		
		
		scan.close();
	}
}
