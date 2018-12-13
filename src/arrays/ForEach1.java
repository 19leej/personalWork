package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ForEach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> students = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("How many students in your class?");
		int choice = input.nextInt();
		for (int counter = 0; counter < choice; counter++) {
			System.out.println("How old is he/she?");
			students.add(input.nextInt());
		}
		int sum = 0;
		for (Integer age : students) {
			sum += age;
		}
		double average = (double) sum / (double) choice;
		System.out.println("The average age is: " + average);
		input.close();
	}

}
