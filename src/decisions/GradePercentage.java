package decisions;

import java.util.Scanner;

public class GradePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What percentage grade did you get in your first test?");
		double first = input.nextDouble();
		System.out.println("What percentage grade did you get in your second test?");
		double second = input.nextDouble();
		System.out.println("What percentage grade did you get in your third test?");
		double third = input.nextDouble();
		System.out.println("Did you do the extra credit?(True or False)");
		boolean extra = input.nextBoolean();
		double point = 0.0;
		if (extra == true) {
			System.out.println("How many points did you get for extra credit?");
			point = input.nextDouble();
		}
		double average = (first + second + third + point) / 3;
		System.out.println("The average test score is " + average + "%.");
		input.close();
	}

}
