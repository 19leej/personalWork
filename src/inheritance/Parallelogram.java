package inheritance;

public class Parallelogram extends Quadrilateral {
	private double height;

	public Parallelogram() {
		super();
		height = 10;
	}

	public Parallelogram(double side1, double side2, double ht) {
		super(side1, side2, side1, side2);
		height = ht;
	}

	public double area() {
		return super.getS2() * height;
	}

	public String toString() {
		return ("Parallelogram: height=" + height + super.toString());
	}
	
	public boolean equals(Object otherObject) {
		return (this.toString().equals(otherObject.toString()));
	}

}