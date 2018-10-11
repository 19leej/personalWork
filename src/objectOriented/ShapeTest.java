package objectOriented;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// rectangle
		System.out.println("What is the length of the rectangle?");
		double length = input.nextDouble();
		System.out.println("What is the height of the rectangle?");
		double height = input.nextDouble();
		Rectangle rectangle = new Rectangle(length, height);
		System.out.println("The area of the rectangle is " + rectangle.area() + " and the perimeter is "
				+ rectangle.perimeter() + ".");
		// circle
		System.out.println("What is the radius of your circle?");
		Circle circle = new Circle(input.nextDouble());
		System.out.println("The area of the circle is " + circle.area() + " and the circumference is "
				+ circle.circumference() + ".");
		// right triangle
		System.out.println("What is the base of the right triangle");
		double base = input.nextDouble();
		System.out.println("What is the height of the right triangle");
		height = input.nextDouble();
		RightTri triangle = new RightTri(base, height);
		System.out.println("The area of the right triangle is " + triangle.area() + " and the perimeter is "
				+ triangle.perimeter() + ".");
		// isosceles trapezoid
		System.out.println("What is the length of the first parallel base of the isosceles trapezoid?");
		double base1 = input.nextDouble();
		System.out.println("What is the length of the second parallel base of the isosceles trapezoid?");
		double base2 = input.nextDouble();
		System.out.println("What is the height of the isosceles trapezoid?");
		height = input.nextDouble();
		System.out.println("what is the length of the non parallel side of the isosceles trapezoid?");
		double leg = input.nextDouble();
		IsoscelesTrap trap = new IsoscelesTrap(base1, base2, height, leg);
		System.out.println(
				"The area of the trapezoid is " + trap.area() + " and the perimeter is " + trap.perimeter() + ".");
		input.close();
	}

}
