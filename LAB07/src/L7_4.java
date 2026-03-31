import java.util.Scanner;

class Account {
    String name;
    long acc_no;

    Account() {
        this.name = "Unknown";
        this.acc_no = 0;
    }

    Account(String n, long a) {
        this.name = n;
        this.acc_no = a;
        System.out.println("\nName: " + this.name);
        System.out.println("Account no.: " + this.acc_no);
    }
}

class Current_account extends Account {
    long bal;

    Current_account() {
        super();
        this.bal = 1000000;
    }

    Current_account(String n, long a, long l) {
        super(n, a);
        this.bal = l;
        System.out.println("Balance: $" + this.bal);
    }

    void deposit() {
        Scanner s = new Scanner(System.in);
        System.out.print("Deposit Amount: ");
        long d = s.nextLong();
        this.bal += d;
        System.out.println("Balance: $" + this.bal);
    }
}

class Bank_account extends Account {
    long bal;
    int i;

    Bank_account() {
        super();
        this.bal = 1000;
        this.i = 4;
        System.out.println("Balance: $" + this.bal);
        System.out.println("Deposit interest: " + this.i + "%");
    }

    Bank_account(String n, long a, long l, int d) {
        super(n, a);
        this.bal = l;
        this.i = d;
        System.out.println("Balance: $" + this.bal);
        System.out.println("Deposit interest: " + this.i + "%");
    }

    void deposit() {
        Scanner s = new Scanner(System.in);
        System.out.print("Deposit amount: ");
        long d = s.nextLong();
        this.bal += d;
        System.out.println("Balance: $" + this.bal);
    }

    void dep_in() {
        long amt = (this.bal * this.i) / 100;
        System.out.println("Deposit amount: $" + amt);
    }
}

public class L7_4 {

    public static void main(String[] args) {

        Current_account c = new Current_account("Geeths", 108, 10000);
        Bank_account b = new Bank_account("Viraj", 109, 2000, 6);
        b.dep_in();
    }
}