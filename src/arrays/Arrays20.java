package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class Arrays20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Friend> names = new ArrayList<Friend>();
		int one = 0;
		for (one = 0; one < 3; one++) {
			System.out.println("What is the name of your friend?");
			String name = input.nextLine();
			System.out.println("How old are they?");
			int age = input.nextInt();
			input.nextLine();
			names.add(one, new Friend(name, age));
		}
		for (one = 0; one < 3; one++) {
			Friend person = names.get(one);
			System.out.println(person.getAge());
		}
		input.close();
	}

}
