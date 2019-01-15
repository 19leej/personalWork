package inheritance;

public class Worker extends Employee {
	private int years;

	public Worker() {
		super();
		years = 5;
	}

	public Worker(String xName, double xPay, int xYears) {
		super(xName, xPay);
		years = xYears;
	}

	public double calculatePay(double hours) {
		if (years > 10) {
			return 1.2 * super.getPay() * hours;
		} else {
			return super.getPay() * hours;
		}
	}
}
