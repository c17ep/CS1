import java.util.Scanner;

/**
 * @author student
 * BMI = ((weight in pounds)/(height in inches ^ 2)) * 703
 */
public class BMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare variables
		Scanner scan = new Scanner(System.in);
		double weight = 0;
		double height = 0;
		double bmi = 0;
		
		// talk to user
		System.out.print("Height in inches: ");
		height = scan.nextDouble();
		System.out.print("Weight in pounds: ");
		weight = scan.nextDouble();
		
		// calculate BMI
		bmi = ((weight)/(height*height)) * 703;
		
		//show BMI
		System.out.println("Your BMI is " + bmi);
		
		scan.close();

	}

}
