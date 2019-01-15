package inheritance;

public class Manager extends Employee {
	private int level;

	public Manager() {
		super();
		level = 10;
	}

	public Manager(String xName, double xPay, int xLevel) {
		super(xName, xPay);
		level = xLevel;
	}

	public double calculatePay(double hours) {
		return (1.0 + ((double) level / 100.0)) * hours * super.getPay();
	}
}
