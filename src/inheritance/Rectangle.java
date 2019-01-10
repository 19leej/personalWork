package inheritance;

public class Rectangle extends Quadrilateral {
	public Rectangle() {
		
	}

	public Rectangle(double xlength, double xwidth) {
		setS1(xlength);
		setS2(xwidth);
	}

	public double area() {
		return getS1() * getS2();
	}
}
