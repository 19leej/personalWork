package objectOriented;

public class IsoscelesTrap {
	private double base1;
	private double base2;
	private double height;
	private double leg;

	public IsoscelesTrap() {
		base1 = -999.0;
		base2 = -999.0;
		height = -999.0;
		leg = -999.0;
	}

	public IsoscelesTrap(double newBase, double newBase2, double newHeight, int newLeg) {
		base1 = newBase;
		base2 = newBase2;
		height = newHeight;
		leg = newLeg;
	}

	public double perimeter() {
		double perimeter = leg + leg + base1 + base2;
		return perimeter;
	}

	public double area() {
		return ((height) * (base1 + base2)) / 2;
	}
}
