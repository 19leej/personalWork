package inheritance;

public class Employee {
	private String name;
	private double pay;

	public Employee() {
		name = "Joe";
		pay = 7.5;
	}

	public Employee(String xName, double xPay) {
		name = xName;
		pay = xPay;
	}

	public double calculatePay(double hours) {
		return pay * hours;
	}

	public double getPay() {
		return pay;
	}

	public String getName() {
		return name;
	}
}
