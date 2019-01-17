package comparableInterface;

import java.util.Random;
import java.util.ArrayList;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randall = new Random();
		ArrayList<WorkerStart> work = new ArrayList<WorkerStart>();
		for (int one = 0; one < 100; one++) {
			work.add(new WorkerStart(5, 5 + randall.nextInt(50 - 5 + 1)));
		}
		WorkerStart largest = work.get(0);
		WorkerStart smallest = work.get(0);
		for (WorkerStart temp : work) {
			if (temp.compareTo(smallest) < 0) {
				smallest = temp;
			}
			if (temp.compareTo(largest) > 0) {
				largest = temp;
			}
		}
		System.out.println(smallest.getRate());
		System.out.println(largest.getRate());
	}

}
