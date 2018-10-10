package objectOriented;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle bob = new Rectangle(4, 2);
		System.out.println(bob.returnWidth());
		System.out.println(bob.returnLength());
		System.out.println(bob.area());
		System.out.println(bob.perimeter());
		bob.changeLength(17);
		bob.changeWidth(12);
		System.out.println(bob.returnWidth());
		System.out.println(bob.returnLength());
	}

}
