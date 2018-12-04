package arrays;

import java.util.Scanner;

public class Arrays15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[][] names = new String[4][3];
		int one = 0;
		int two = 0;
		for (one = 0; one < names.length; one++) {
			for (two = 0; two < names[0].length; two++) {
				System.out.println("What is the person's name?");
				names[one][two] = input.nextLine();
			}
		}
		for (one = 0; one < names.length; one++) {
			for (two = 0; two < names[0].length; two++) {
				System.out.print(names[one][two].length() + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
