package arrays;

import java.util.Random;
import java.util.ArrayList;

public class ArrayLists1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randall = new Random();
		ArrayList<Rectangle> shape = new ArrayList<Rectangle>();
		int one = 0;
		for (one = 0; one < 5; one++) {
			int length = 50 + randall.nextInt(70 - 50 + 1);
			int width = 50 + randall.nextInt(70 - 50 + 1);
			shape.add(new Rectangle(length, width));
		}
		Rectangle trash = shape.remove(0 + randall.nextInt(shape.size() - 1 - 0 + 1));
		System.out.println("Length of the removed rectangle: " + trash.getLength());
		for (one = 0; one < shape.size(); one++) {
			System.out.println(shape.get(one).area());
		}
		System.out.println("Removing the last rectangle and setting it to the first element...");
		shape.set(0, shape.remove(shape.size() - 1));
		for (one = 0; one < shape.size(); one++) {
			System.out.println(shape.get(one).area());
		}
	}

}
