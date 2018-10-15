package objectOriented;

public class Cat {
	private int age;
	private int sleep;

	public Cat() {
		age = -999;
		sleep = -999;
	}

	public Cat(int newAge, int newSleep) {
		age = newAge;
		sleep = newSleep;
	}

	public void birthday() {
		age = age + 1;
	}

	public void sleepMore() {
		sleep = sleep + 1;
	}

	public void sleepLess() {
		sleep = sleep - 1;
	}

	public int getAge() {
		return age;
	}

	public int getSleep() {
		return sleep;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setSleep(int newSleep) {
		sleep = newSleep;
	}
}
