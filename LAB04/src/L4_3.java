class bank_acc {
	String name;
	long acc_no;
	String acc_type;
	long bal;
	static int roi = 11;

	bank_acc(String name, long acc_no, String acc_type, long bal) {
		this.name = name;
		this.acc_no = acc_no;
		this.acc_type = acc_type;
		this.bal = bal;
	}

	bank_acc() {
		this.name = "Unknown";
		this.acc_no = 0;
		this.acc_type = "Savings";
		this.bal = 0;
	}

	void deposit(long x) {
		if (x > 0) {
			this.bal = this.bal + x;
			System.out.println("Balance after deposit: $" + this.bal);
		}
	}

	void withdraw(long x) {
		if (this.bal -x >= 5000) {
			this.bal = this.bal - x;
			System.out.println("Balance after withdrawal: $" + this.bal);
		} else {
			System.out.println("Insufficient balance for withdrawal");
		}
	}

	void acc_details() {
		System.out.println(
				"Name: " + name + "\nAccount number: " + acc_no + "\nAccount type: " + acc_type + "\nBalance: " + bal);
	}

	static void ROI() {
		System.out.println("Rate of Interest: " + roi + "%");
	}
}

public class L4_3 {
	public static void main(String[] args) {
		bank_acc b1 = new bank_acc();
		b1.acc_details();
		System.out.println("");
		
		bank_acc b2 = new bank_acc("Geetha", 123456789, "Savings", 50000);
		b2.acc_details();
		b2.deposit(10050);
		b2.withdraw(7000);
		b2.ROI();
	}
}