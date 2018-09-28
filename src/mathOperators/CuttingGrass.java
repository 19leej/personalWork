package mathOperators;

import java.util.Scanner;

public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = -999.0;
		double width = -999.0;
		double radius = -999.0;
		double rectangle = -999.0;
		double circle = -999.0;
		double area = -999.0;
		int price = -999;
		double finalPrice = -999.0;
		System.out.println("What is the length of the lawn?");
		length = input.nextDouble();
		System.out.println("What is the width of the lawn?");
		width = input.nextDouble();
		System.out.println("What is the radius of the fountain?");
		radius = input.nextDouble();
		rectangle = length * width;
		circle = Math.PI * radius * radius;
		area = rectangle - circle;
		area = area / 100;
		finalPrice = area * 1.25;
		finalPrice = finalPrice * 100;
		price = (int) finalPrice;
		finalPrice = price;
		finalPrice = finalPrice / 100;
		System.out.println("The price for mowing the lawn is $" + finalPrice + ".");
	}

}
