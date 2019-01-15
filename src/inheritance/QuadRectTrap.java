package inheritance;

public class QuadRectTrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrilateral one = new Quadrilateral();
		Quadrilateral two = new Quadrilateral();
		Rectangle three = new Rectangle();
		Rectangle four = new Rectangle();
		Trapezoid five = new Trapezoid();
		Trapezoid six = new Trapezoid();
		System.out.println("Perimeter: " + one.perimeter());
		System.out.println("Perimeter: " + two.perimeter());
		System.out.println("Area: " + three.area() + " Perimeter: " + three.perimeter());
		System.out.println("Area: " + four.area() + " Perimeter: " + four.perimeter());
		System.out.println("Area: " + five.area() + " Perimeter: " + five.perimeter());
		System.out.println("Area: " + six.area() + " Perimeter: " + six.perimeter());

	}

}
