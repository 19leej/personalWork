package objectOriented;

public class NumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers digit = new Numbers();
		digit.sayNumber(7.5);
		digit.sayNumberPlus2(7.5);
		digit.saySum(2, 5);
		double thing = digit.returnSquare(12);
		System.out.println(thing);
		double area = digit.returnArea(11, 10);
		System.out.println(area);
		int roundUp = digit.returnRoundUp(789.4);
		System.out.println(roundUp);
	}

}
