package interfaces;

import java.util.ArrayList;

public class StudentAndTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> names = new ArrayList<Person>();
		names.add(new Student());
		names.add(new Teacher());
		names.add(new Student());
		names.add(new Teacher());
		names.add(new Student());
		names.add(new Teacher());
		Student joe = new Student();
		joe.setName("Ryan George");
		names.add(joe);
		for (Person temp : names) {
			System.out.println(temp.getName());
		}
		for (Person temp : names) {
			if (temp.getName().length() > 10) {
				System.out.println(temp.getAge());
			}
		}
		for (int counter = 0; counter < names.size(); counter++) {
			if (names.get(counter) instanceof Student) {
				Student bob = (Student)names.get(counter);
				bob.outSick();
			}
			System.out.println(names.get(counter).getName());
		}
	}

}
