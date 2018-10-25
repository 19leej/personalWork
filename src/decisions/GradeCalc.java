package decisions;

import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your homework average in percent?");
		double homework = input.nextDouble();
		System.out.println("What is your test average in percent?");
		double test = input.nextDouble();
		System.out.println("Is your teacher nice?(true or false)");
		boolean teacher = input.nextBoolean();
		if (teacher == true) {
			if (test >= homework) {
				System.out.println("Your grade is " + test + "%.");
			} else {
				System.out.println("Your grade is " + homework + "%.");
			}
		} else {
			if (test <= homework) {
				System.out.println("Your grade is " + test + "%.");
			} else {
				System.out.println("Your grade is " + homework + "%.");
			}
		}
	}

}
