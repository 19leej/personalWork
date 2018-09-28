package mathOperators;

import java.util.Scanner;

public class AreaOfWall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int width = -999;
		int area = -999;
		System.out.println("How wide is the 8 feet tall wall?(in feet)");
		width = input.nextInt();
		area = width * 8;
		System.out.println("The wall has an area of " + area + " feet squared.");
	}

}
