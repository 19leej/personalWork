package interfaces;

import java.util.Scanner;

public class Interfaces2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length?");
		int length = input.nextInt();
		System.out.println("Width?");
		int width = input.nextInt();
		Rectangle box = new Rectangle(length, width);
		Shape geo = box;
		System.out.println(box.getLength());
		System.out.println(geo.area());
		input.close();
	}

}
