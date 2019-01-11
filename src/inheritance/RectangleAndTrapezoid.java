package inheritance;

import java.util.ArrayList;

public class RectangleAndTrapezoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Geo> shape = new ArrayList<Geo>();
		shape.add(new Rectangle(5, 10000));
		shape.add(new Trapezoid(12, 8, 300, 5));
		double largest = 0.0;
		int instance = 0;
		for (int counter = 0; counter < shape.size(); counter++) {
			if (shape.get(counter).area() > largest) {
				largest = shape.get(counter).area();
				instance = counter;
			}
		}
		String type = "Trapezoid";
		if (shape.get(instance) instanceof Rectangle) {
			type = "Rectangle";
		}
		System.out.println(type + " with area of " + largest);
	}

}
