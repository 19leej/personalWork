package inheritance;

import java.util.ArrayList;

public class EWMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker one = new Worker("Tom", 15, 11);
		System.out.println(one.getName());
		System.out.println(one.getPay());
		System.out.println(one.calculatePay(5));
		Manager two = new Manager("Joe Bob", 20, 10);
		System.out.println(two.getName());
		System.out.println(two.getPay());
		System.out.println(two.calculatePay(10));
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Manager("Joe Bob", 20, 10));
	}

}
