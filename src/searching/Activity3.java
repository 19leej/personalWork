package searching;

import java.util.Random;

import arrays.Rectangle;

import java.util.ArrayList;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> shape = new ArrayList<Rectangle>();
		Random randall = new Random();
		for (int counter = 0; counter < 100; counter++) {
			int length = 0 + randall.nextInt(499 - 0 + 1);
			int width = 0 + randall.nextInt(499 - 0 + 1);
			shape.add(new Rectangle(length, width));
		}
		int sum = 0;
		for (Rectangle x : shape) {
			if (x.getWidth() == 10) {
				sum++;
			}
		}
		System.out.println(sum + " Rectangle objects have a width of 10.");
	}

}
