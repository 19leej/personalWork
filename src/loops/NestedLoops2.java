package loops;

public class NestedLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int num = 1;
		for (counter = 1; counter <= 4; counter = counter + 1) {
			for (num = 1; num <= 5; num = num + 1) {
				if (num != 3) {
					System.out.print(num + "  ");
				} else {
					System.out.print(counter + "  ");
				}
			}
			System.out.println();
		}
	}
}
