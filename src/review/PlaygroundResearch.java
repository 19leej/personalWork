package review;

import java.util.Scanner;
import java.util.Random;

public class PlaygroundResearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] height = new int[10][12];
		Scanner input = new Scanner(System.in);
		Random randall = new Random();
		int student = 0;
		int heightsum = 0;
		int tallest = 1;
		int shortest = 999;
		for (int one = 0; one < height.length; one++) {
			for (int two = 0; two < height[0].length; two++) {
				System.out.println("What is the height of the student in inches?");
				height[one][two] = 58 + randall.nextInt(72 - 58 + 1);
			}
		}
		for (int one = 0; one < height.length; one++) {
			for (int two = 0; two < height[0].length; two++) {
				if (height[one][two] > 0) {
					student++;
				}
				if (height[one][two] > tallest) {
					tallest = height[one][two];
				}
				if (height[one][two] < shortest && height[one][two] != 0) {
					shortest = height[one][two];
				}
				heightsum += height[one][two];
			}
		}
		double average = (double)heightsum / (double)student;
		System.out.println("Average height: " + average);
		System.out.println("Tallest height: " + tallest);
		System.out.println("Shortest height: " + shortest);
		
	}

}
