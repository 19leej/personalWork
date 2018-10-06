package objectOriented;

import java.util.Scanner;

public class HouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		House robot = new House();
		robot.wallPaint();
		// version 1: no parameters or return type
		robot.Sandbox1();
		// version 2: pass parameter, but no return type
		System.out.println("What is the length of the sandbox in feet?");
		double length = input.nextDouble();
		System.out.println("What is the width of the sandbox?");
		double width = input.nextDouble();
		System.out.println("What is the depth of the sandbox?");
		double depth = input.nextDouble();
		System.out.println("How much san(in cubic feet) can you transport per hour?");
		double transport = input.nextDouble();
		robot.Sandbox2(length, width, depth, transport);
		/*
		 * version 3: pass parameters and return type This is the good one, since the
		 * method class is only for calculating stuff, allowing more versatility for the
		 * end user.
		 */
		System.out.println("What is the length of the sandbox in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the sandbox?");
		width = input.nextDouble();
		System.out.println("What is the depth of the sandbox?");
		depth = input.nextDouble();
		System.out.println("How much sand(in cubic feet) can you transport per hour?");
		transport = input.nextDouble();
		double time = robot.Sandbox3(length, width, depth, transport);
		System.out.println("It will take " + time + " hours to fill the sandbox.");

	}

}
