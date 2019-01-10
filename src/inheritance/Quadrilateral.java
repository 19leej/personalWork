package inheritance;

public class Quadrilateral {
	private double s1;
	private double s2;
	private double s3;
	private double s4;

	public Quadrilateral() {
		s1 = 5.0;
		s2 = 6.0;
		s3 = 7.0;
		s4 = 8.0;
	}

	public Quadrilateral(double newS1, double newS2, double newS3, double newS4) {
		s1 = newS1;
		s2 = newS2;
		s3 = newS3;
		s4 = newS4;
	}

	public void setS1(double newS1) {
		s1 = newS1;
	}

	public void setS2(double newS2) {
		s2 = newS2;
	}

	public void setS3(double newS3) {
		s3 = newS3;
	}

	public void setS4(double newS4) {
		s4 = newS4;
	}

	public double getS1() {
		return s1;
	}

	public double getS2() {
		return s2;
	}

	public double getS3() {
		return s3;
	}

	public double getS4() {
		return s4;
	}

	public double perimeter() {
		return s1 + s2 + s3 + s4;
	}
}
