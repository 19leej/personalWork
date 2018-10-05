package objectOriented;

public class Numbers {
	public Numbers() {
	}

	public void sayNumber(double num) {
		System.out.println("Your number is " + num + ".");
	}

	public void sayNumberPlus2(double num) {
		System.out.println("You sent " + num + " to the method.");
		num = num + 2;
		System.out.println("Your number plus two is " + num + ".");
	}

	public void saySum(double num, double num2) {
		System.out.println("You sent " + num + " and " + num2 + " to the method.");
		double num3 = num + num2;
		System.out.println("The sum of the numbers is " + num3 + ".");
	}

	public double returnSquare(double num) {
		num = Math.pow(num, 2);
		return num;
	}

	public double returnArea(double num, double num2) {
		return num * num2;
	}

	public int returnRoundUp(double num) {
		return (int)Math.ceil(num);
	}
}