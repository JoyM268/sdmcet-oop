// With a example show how abstract methods are implemented
abstract class bank {
	double interest;

	abstract void setInterest(double d);

	double getInterest() {
		return interest;
	}
}

class banking extends bank {
	void setInterest(double i) {
		interest = i;
	}
}

class bankInterest {
	public static void main(String[] args) {
		// Cannot instantiate abstract class
		// bank b1 = new bank();

		banking b = new banking();
		b.setInterest(7.0);
		System.out.println("SI for SBI = " + b.getInterest());
	}
}