package loops;

public class Math2 {
	public Math2() {
	}

	public int rightTri(double one, double two, double three) {
		int truth = 0;
		if (one > 0 && two > 0 && three > 0) {
			if (one > two && one > three) {
				if ((one * one) == (two * two) + (three * three)) {
					truth = 1;
				}
			}
			if (two > one && two > three) {
				if ((two * two) == (one * one) + (three * three)) {
					truth = 1;
				}
			}
			if (three > two && three > one) {
				if ((three * three) == (two * two) + (one * one)) {
					truth = 1;
				}
			}
		}
		return truth;
	}

	public double powers(double number, int power) {
		if (power > 0) {
			for (int counter = 1; counter < power; counter++) {
				number = number * number;
			}
		}
		return number;
	}

	public double root(double number) {
		if (number > 0) {
			number = Math.sqrt(number);
			return number;
		} else {
			return -999;
		}

	}

	public double roundUp(double number) {
		number = Math.ceil(number);
		return number;
	}

	public double roundDown(double number) {
		number = Math.floor(number);
		return number;
	}
}
