package objectOriented;

public class Worker {
	private int hours;
	private double pay;

	public Worker() {
		hours = -999;
		pay = -999.0;
	}

	public Worker(int newHour, double newPay) {
		hours = newHour;
		pay = newPay;
	}

	public double payCheck() {
		double paycheck = hours * pay;
		return paycheck;
	}

	public void raise(double newPay) {
		pay = newPay;
	}
}
