package arrays;

import java.util.Random;

public class Arrays8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] rex = new Rectangle[100];
		Random randall = new Random();
		int counter = 0;
		int smallest = 1000000;
		for (counter = 0; counter < rex.length; counter++) {
			int length = 10 + randall.nextInt(56 - 10 + 1);
			int width = 10 + randall.nextInt(56 - 10 + 1);
			rex[counter] = new Rectangle(length, width);
		}
		for (counter = 0; counter < rex.length; counter++) {
			System.out.println("Length: " + rex[counter].getLength());
			System.out.println("Width: " + rex[counter].getWidth());
			System.out.println("Area: " + rex[counter].area());
		}
		for (counter = 0; counter < rex.length; counter++) {
			if (rex[counter].area() < smallest) {
				rex[0].setLength(rex[counter].getLength());
				rex[0].setWidth(rex[counter].getWidth());
				smallest = rex[counter].area();
			}
		}
		System.out.println("Smallest Area: " + rex[0].area());
		System.out.println("Length: " + rex[0].getLength());
		System.out.println("Width: " + rex[0].getWidth());
	}

}
