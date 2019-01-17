package comparableInterface;

import java.util.ArrayList;
import java.util.Random;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randall = new Random();
		ArrayList<CatStart> cat = new ArrayList<CatStart>();
		for (int one = 0; one < 100; one++) {
			cat.add(new CatStart(1 + randall.nextInt(100 - 1 + 1), 12));
		}
		CatStart largest = cat.get(0);
		CatStart smallest = cat.get(0);
		for (CatStart temp : cat) {
			if (temp.compareTo(smallest) < 0) {
				smallest = temp;
			}
			if (temp.compareTo(largest) > 0) {
				largest = temp;
			}
		}
		System.out.println(smallest.getAge());
		System.out.println(largest.getAge());
	}

}
