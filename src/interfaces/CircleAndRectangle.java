package interfaces;

import java.util.ArrayList;

public class CircleAndRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle square = new Rectangle(5, 10);
		Circle oval = new Circle(10);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(square);
		shapes.add(oval);
		shapes.add(new Rectangle(4, 6));
		double sum = 0.0;
		for (int one = 0; one < shapes.size(); one++) {
			sum += shapes.get(one).area();
		}
		double smallest = 9999999999.0;
		for (int one = 0; one < shapes.size(); one++) {
			if (shapes.get(one).perimeter() < smallest) {
				smallest = shapes.get(one).perimeter();
			}
		}
		System.out.println(sum);
		System.out.println(smallest);
	}

}
