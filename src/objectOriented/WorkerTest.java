package objectOriented;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker bob = new Worker();
		Worker joe = new Worker(40, 10);
		System.out.println(bob.payCheck());
		System.out.println(joe.payCheck());
		joe.raise(15);
		System.out.println(joe.payCheck());
	}

}
