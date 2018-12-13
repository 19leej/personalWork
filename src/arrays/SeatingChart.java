package arrays;

import java.util.Scanner;

public class SeatingChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students in your class? (must be a multiple of 4)");
		int rows = input.nextInt();
		rows = rows / 4;
		input.nextLine();
		String[][] seating = new String[rows][4];
		int one = 0;
		int two = 0;
		for (one = 0; one < seating.length; one++) {
			for (two = 0; two < seating[0].length; two++) {
				System.out.println("What is the name of the student?");
				seating[one][two] = input.nextLine();
			}
		}
		for (one = 0; one < seating.length; one++) {
			for (two = 0; two < seating[0].length; two++) {
				System.out.print(seating[one][two].charAt(0) + "" + seating[one][two].length() + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
