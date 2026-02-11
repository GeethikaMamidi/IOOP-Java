public class L3_4 {
}

class Die {
	int sideUp;

	int getSideUp() {
		return this.sideUp;
	}

	void roll() {
		this.sideUp = ((int) (Math.random() * 6)) + 1;
	}
}

class DieDemo {
	void sum() {
		Die d1 = new Die();
		Die d2 = new Die();

		d1.roll();
		d2.roll();

		int a = d1.getSideUp();
		int b = d2.getSideUp();

		System.out.println("Die 1: " + a);
		System.out.println("Die 2: " + b);
		System.out.println("Sum: " + (a + b));
	}

	public static void main(String[] args) {
		DieDemo d = new DieDemo();
		d.sum();
	}
}