package loops;

public class NestedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int count2 = 0;
		int number = 1;
		int initial = 1;
		for (count = 6; count >= 0; count = count - 1) {
			for (count2 = 0; count2 <= count; count2 += 1) {
				if (number < 6) {
					System.out.print(number + "  ");
					number++;
				} else {
					number = initial;
				}
			}
			initial++;
			System.out.println();
		}
	}

}
