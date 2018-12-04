package arrays;

import java.util.Random;

public class Arrays14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randall = new Random();
		int[][][] numbers = new int[3][7][9];
		int one = 0;
		int two = 0;
		int three = 0;
		int sum = 0;
		for (one = 0; one < numbers.length; one++) {
			for (two = 0; two < numbers[0].length; two++) {
				for (three = 0; three < numbers[0][0].length; three++) {
					numbers[one][two][three] = 0 + randall.nextInt(50 - 0 + 1);
				}
			}
		}
		for (one = 0; one < numbers.length; one++) {
			for (two = 0; two < numbers[0].length; two++) {
				for (three = 0; three < numbers[0][0].length; three++) {
					sum += numbers[one][two][three];
				}
			}
		}
		System.out.println(sum);
	}

}
