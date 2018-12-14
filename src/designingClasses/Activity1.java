package designingClasses;

import java.util.Scanner;
import java.util.ArrayList;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Friend> names = new ArrayList<Friend>();
		System.out.println("How many friends do you have?");
		int choice = input.nextInt();
		input.nextLine();
		for (int counter = 0; counter < choice; counter++) {
			names.add(new Friend());
		}
		for (Friend x : names) {
			System.out.println("Name: " + x.getName());
			System.out.println("Age: " + x.getAge());
		}
		input.close();
	}

}
