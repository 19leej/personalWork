package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ForEach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Double> wages = new ArrayList<Double>();
		System.out.println("How many employees?");
		int number = input.nextInt();
		for (int counter = 0; counter < number; counter++) {
			System.out.println("What is the wage?");
			wages.add(input.nextDouble());
		}
		double highest = 0.0;
		for (Double pay : wages) {
			if (pay > highest) {
				highest = pay;
			}
		}
		System.out.println("The highest wage is: $" + highest);
		input.close();
	}

}
