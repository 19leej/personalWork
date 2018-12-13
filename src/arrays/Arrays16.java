package arrays;

import java.util.Scanner;
import java.util.Random;

public class Arrays16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random randall = new Random();
		Friend[][] names = new Friend[18][5];
		int one = 0;
		int two = 0;
		for (one = 0; one < names.length; one++) {
			for (two = 0; two < names[0].length; two++) {
				System.out.println("What is the name of your friend?");
				String name = input.nextLine();
				int age = 0 + randall.nextInt(100 - 0 + 1);
				names[one][two] = new Friend(name, age);
			}
		}
		for (one = 0; one < names.length; one++) {
			for (two = 0; two < names[0].length; two++) {
				System.out.print(names[one][two].getName() + " " + names[one][two].getAge() + "  ");
			}
			System.out.println();
		}
		input.close();
	}

}
