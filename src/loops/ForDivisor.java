package loops;

public class ForDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter2 = 0;
		int counter = 0;
		int divisor = 0;
		int biggestint = 0;
		int biggestdiv = 0;
		for (counter2 = 1; counter2 <= 1000; counter2 = counter2 + 1) {
			for (counter = 1; counter <= counter2; counter = counter + 1) {
				if (counter2 % counter == 0) {
					divisor++;
				}
			}
			if (divisor > biggestdiv) {
				biggestdiv = divisor;
				biggestint = counter2;
			}
			divisor = 0;
		}
		System.out.println("Biggest int: " + biggestint);
		System.out.println("Divisors: " + biggestdiv);
	}

}
