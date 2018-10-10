package objectOriented;

public class Circle {
	private double radius;

	public Circle() {
		radius = -999.0;
	}

	public Circle(double newRadius) {
		radius = newRadius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
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
