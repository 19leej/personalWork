package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ForEach3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Circle> circle = new ArrayList<Circle>();
		Scanner input = new Scanner(System.in);
		int counter = 0;
		for (counter = 0; counter < 10; counter++) {
			System.out.println("What is the radius of the circle?");
			circle.add(new Circle(input.nextDouble()));
		}
		for (Circle ball : circle) {
			System.out.println("Area: " + ball.area());
		}
		input.close();
	}

}
