package inputExamples;
import java.util.Scanner;
public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monkey = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height on an adult money in inches?(integers only)");
		monkey = input.nextInt();
		System.out.println("Adult monkeys are " + monkey + " inches tall.");
	}

}
