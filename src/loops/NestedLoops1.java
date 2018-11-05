package loops;

public class NestedLoops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int factor = 0;
		for (factor = 1; factor <= 4; factor = factor + 1) {
			for (counter = 1; counter <= 5; counter = counter + 1) {
				System.out.print(factor * counter + "  ");
			}
			System.out.println();
		}
	}
}
