package designingClasses;

public class Friend {
	private String name;
	private int age;

	public Friend() {
		name = "n/a";
		age = 0;
	}

	public Friend(String n, int a) {
		name = n;
		age = a;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		age = a;
	}

	public String getFirst() {
		String first = name.substring(0, name.indexOf(" "));
		return first;
	}

	public String getLast() {
		String last = name.substring(name.indexOf(" ") + 1, name.length());
		return last;
	}
}
