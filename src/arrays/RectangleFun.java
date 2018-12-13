package arrays;

import java.util.Random;
import java.util.ArrayList;

public class RectangleFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randall = new Random();
		ArrayList<Rectangle> shape = new ArrayList<Rectangle>();
		for (int counter = 0; counter < 20; counter++) {
			shape.add(new Rectangle(40 + randall.nextInt(61), 40 + randall.nextInt(61)));
		}
		System.out.println("Current areas:");
		for (Rectangle square : shape) {
			System.out.println(square.area());
		}
		System.out.println("Removing rectangles with a length greater than 60...");
		for (int counter = shape.size() - 1; counter >= 0; counter--) {
			if (shape.get(counter).getLength() > 60) {
				shape.remove(counter);
			}

		}
		System.out.println("New areas:");
		for (int counter = 0; counter < shape.size(); counter++) {
			System.out.println(shape.get(counter).area());
		}
	}

}
