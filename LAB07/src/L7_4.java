class Account {
	String name;
	long acc_no;
	double bal;

	Account() {
		this.name = "Unknown";
		this.acc_no = 0;
		this.bal = 0;
		System.out.println("\nName: " + this.name +"\nAccount no.: " + this.acc_no);
	}

	Account(String n, long a, double b) {
		this.name = n;
		this.acc_no = a;
		this.bal = b;
		System.out.println("\nName: " + this.name +"\nAccount no.: " + this.acc_no);
	}

	void deposit(int d) {
		bal += d;
		System.out.println("Successful deposit: $" + d);
		this.bal();
	}

	void bal() {
		System.out.println("Balance: $" + this.bal);
	}
}

class Current_acc extends Account {
	final static long min = 5000;
	long s = 1000;

	Current_acc() {
		super();
	}

	Current_acc(String n, long a, long b) {
		super(n, a, b);
		if (this.bal < min) {
			System.out.println("Balance less than minimum.\nImposed service tax.");
			this.bal -= s;
		}
		super.bal();
	}
}

class Savings_acc extends Account {
	double i;

	Savings_acc(String n, long a, long b, double d) {
		super(n, a, b);
		this.i = d;
		super.bal();
	}

	void dep_in() {
		long amt = (long) ((this.bal * this.i) / 100);
		System.out.println("Deposit interest: " + this.i + "%"+"\nDeposit amount: $" + amt);
	}

	void withdraw(long w) {
		if (w > this.bal) {
			System.out.println("Can't withdraw");
		} else {
			this.bal -= w;
			System.out.println("Withdrawn: $" + w);
			super.bal();
		}
	}
}

public class L7_4 {

	public static void main(String[] args) {

		Current_acc c = new Current_acc("Geeths", 108, 100000);
		c.deposit(5000);
		
		Savings_acc s = new Savings_acc("Viraj", 109, 20000, 6);
		s.dep_in();
		s.withdraw(5000);
	}
}