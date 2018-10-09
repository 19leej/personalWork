package objectOriented;

public class Employee {
	private double wage;
	private double experience;

	public Employee() {
		wage = -999.0;
		experience = -999.0;
	}

	public double getWage() {
		return wage;
	}

	public void setAge(double newWage) {
		wage = newWage;
	}

	public double getExp() {
		return experience;
	}

	public void setExp(double newExp) {
		experience = newExp;
	}

	public void raiseWage() {
		wage = wage * 1.10;
	}
}
