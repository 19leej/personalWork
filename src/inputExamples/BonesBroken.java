package inputExamples;

import java.util.Scanner;

public class BonesBroken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int bones = -999;
		System.out.println("How many bones have you broken so far?");
		bones = input.nextInt();
		System.out.println("You have broken " + bones + " bones.");
	}

}
