import java.util.Scanner;

class EMPLOYEE {
	String Ename;
	int Eid;
	long Basic, DA, Gross_Sal, Net_Sal, IT;

	void read() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter employee details:");
		System.out.print("ID: ");
		Eid = in.nextInt();
		System.out.print("Name: ");
		Ename = in.next();
		System.out.println("Basic salary: ");
		Basic = in.nextLong();
	}

	void compute_net_sal() {
		DA = (52 * Basic) / 100;
		Gross_Sal = Basic + DA;
		IT = (30 * Gross_Sal) / 100;
		Net_Sal = Gross_Sal - IT;
	}

	void display() {
		System.out.println("\nSalary Details:");
		System.out.println("Name: " + Ename + "\nID: " + Eid + "\nBasic: " + Basic + "\nDA: " + DA + "\nGross Salary: "
				+ Gross_Sal + "\nNet Salary: " + Net_Sal);
	}
}

public class L3_2 {
	public static void main(String[] args) {
		int N;
		Scanner in = new Scanner(System.in);
		System.out.print("Number of employees: ");
		N = in.nextInt();

		EMPLOYEE[] list = new EMPLOYEE[N];
		for (int i = 0; i < N; i++) {
		    list[i] = new EMPLOYEE();
		    list[i].read();
		    list[i].compute_net_sal();
		    list[i].display();
		}

	}
}
