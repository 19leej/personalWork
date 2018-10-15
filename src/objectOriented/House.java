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

	public void Sandbox1() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the sandbox in feet?");
		double length = input.nextDouble();
		System.out.println("What is the width of the sandbox?");
		double width = input.nextDouble();
		System.out.println("What is the depth of the sandbox?");
		double depth = input.nextDouble();
		System.out.println("How much san(in cubic feet) can you transport per hour?");
		double transport = input.nextDouble();
		double volume = length * width * depth;
		double time = volume / transport;
		System.out.println("It will take " + time + " hours to fill the sandbox.");
	}
	public void Sandbox2(double length, double width, double depth, double transport) {
		double volume = length * width * depth;
		double time = volume / transport;
		System.out.println("It will take " + time + " hours to fill the sandbox.");
	}
	public double Sandbox3(double length, double width, double depth, double transport) {
		double volume = length * width * depth;
		double time = volume / transport;
		return time;
	}
}
