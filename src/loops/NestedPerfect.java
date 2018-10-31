package loops;

public class NestedPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int counter2 = 0;
		int sum = 0;
		for (counter = 1; counter <= 1000; counter = counter + 1) {
			for (counter2 = 1; counter2 <= counter; counter2 = counter2 + 1) {
				if (counter2 != counter) {
					if (counter % counter2 == 0) {
						sum = sum + counter2;
					}
				}
			}
			if (counter == sum) {
				System.out.println(counter);
			}
			sum = 0;
		}
	}
}
