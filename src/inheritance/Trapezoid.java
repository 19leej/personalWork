package inheritance;

public class Trapezoid extends Quadrilateral implements Geo {
	private double height;

	public Trapezoid() {
		super();
		height = 10;
	}

	public Trapezoid(double base1, double base2, double side, double ht) {
		super(side, base1, side, base2);
		height = ht;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double ht) {
		height = ht;
	}

	public double area() {
		/**
		 * double triside = (super.getS4() - super.getS2()) / 2; double height =
		 * Math.sqrt((super.getS1() * super.getS1()) + (triside* triside));
		 * return (super.getS2() + super.getS4())
		 **/
		return (0.5 * (super.getS1() + super.getS3()) * height);
	}

}
