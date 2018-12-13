package designingClasses;

import java.util.Scanner;
import java.util.ArrayList;

public class JunkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<pileOjunk> junk = new ArrayList<pileOjunk>();
		Scanner input = new Scanner(System.in);
		System.out.println("How many objects?");
		int choice = input.nextInt();
		input.nextLine();
		for (int counter = 0; counter < choice; counter++) {
			System.out.println("What is the ID?");
			junk.add(new pileOjunk(input.nextInt()));
		}
		System.out.println("What are the two numbers to add?");
		int one = input.nextInt();
		int two = input.nextInt();
		System.out.println(junk.get(0).add(one, two));
		System.out.println(junk.get(0).overwrite(15));
	}

}
