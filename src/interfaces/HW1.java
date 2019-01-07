package interfaces;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person osterberg = new Teacher();
		System.out.println(osterberg.getName() + " " + osterberg.getAge());
		Person justin = new Student();
		System.out.println(justin.getName() + " " + justin.getAge());
	}

}
