package objectOriented;

import java.util.Scanner;

public class House {
	public House() {
	}

	public void wallPaint() {
		Scanner input = new Scanner(System.in);
		double length = -999.0;
		double width = -999.0;
		double area = -999.0;
		double time = -999.0;
		System.out.println("What is the length of the wall in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the wall in feet?");
		width = input.nextDouble();
		area = length * width;
		time = area / 200;
		time = time * 60;
		System.out.println("It will take " + time + " minutes to paint the wall.");

	}
}
