package arrays;

import java.util.ArrayList;

public class Arrays19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Friend> names = new ArrayList<Friend>();
		names.add(new Friend("Joe", 8));
		names.add(new Friend("Tom", 17));
		names.add(new Friend("Mary", 24));
		names.add(new Friend("Null", 0));
		names.add(3, names.get(2));
		names.add(2, names.get(0));
		names.add(0, names.get(3));
		System.out.println(names);
	}

}
