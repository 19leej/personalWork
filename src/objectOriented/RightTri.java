package objectOriented;

public class RightTri {
	private double base;
	private double height;

	public RightTri() {
		base = -999.0;
		height = -999.0;
	}

	public RightTri(double newBase, double newHeight) {
		base = newBase;
		height = newHeight;
	}

	public double hypot() {
		double hypot = Math.sqrt((base * base) + (height * height));
		return hypot;
	}

	public double perimeter() {
		double hypot = Math.sqrt((base * base) + (height * height));
		double perimeter = base + height + hypot;
		return perimeter;
	}

	public double area() {
		double area = 0.5 * (base * height);
		return area;
	}
}
