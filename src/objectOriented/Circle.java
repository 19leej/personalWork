package objectOriented;

public class Circle {
	private double radius;

	public Circle() {
		radius = 10;
	}

	public Circle(double newRadius) {
		if (newRadius <= 0) {
			newRadius = 10;
		}
		radius = newRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		if (newRadius <= 0) {
			newRadius = 10;
		}
		radius = newRadius;
	}

	public double circumference() {
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}

	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}

}
