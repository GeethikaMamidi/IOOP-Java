import java.util.Scanner;

class EMPLOYEE {
	String Ename;
	int Eid;
	long Basic, DA, Gross_Sal, Net_Sal, IT;
	String email;

	public EMPLOYEE() {
		this.Ename = "Unknown";
		this.Eid = 0;
		this.Basic = 0;
	}

	public EMPLOYEE(String name, int id, long basic) {
		this.Ename = name;
		this.Eid = id;
		this.Basic = basic;
	}

	void compute_net_sal() {
		DA = (52 * Basic) / 100;
		Gross_Sal = Basic + DA;
		IT = (30 * Gross_Sal) / 100;
		Net_Sal = Gross_Sal - IT;
	}

	void display() {
		System.out.println("\nEmployee Details:");
		System.out.println("Name: " + Ename + "\nID: " + Eid + "\nBasic: " + Basic + "\nDA: " + DA + "\nGross Salary: "
				+ Gross_Sal + "\nNet Salary: " + Net_Sal);
	}

	void formatEmployeeName() {
		String arr[] = Ename.split(" ");
		String x = "";
		for (String y : arr) {
			if (y.isEmpty())
				continue;
			char[] c = y.toCharArray();
			c[0] = Character.toUpperCase(c[0]);
			for (int i = 1; i < y.length(); i++)
				c[i] = Character.toLowerCase(c[i]);
			String w = new String(c);
			x += w;
			x += " ";
		}
		Ename = x.trim();
	}

	void generateEmail() {
		formatEmployeeName();
		String x = "";
		String arr[] = Ename.split(" ");
		x += Character.toLowerCase(arr[0].charAt(0));
		x += arr[1].toLowerCase();
		email = x + "@email.com";
		System.out.println("Email: " + email);
	}
}

public class L6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of employees: ");
		int n = sc.nextInt();
		sc.nextLine();

		EMPLOYEE[] e = new EMPLOYEE[n];

		for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Basic Salary: ");
            long basic = sc.nextLong();
            sc.nextLine();

			e[i] = new EMPLOYEE(name, id, basic);
		}

		for (int i = 0; i < n; i++) {
			e[i].formatEmployeeName();
			e[i].compute_net_sal();
			e[i].display();
			e[i].generateEmail();
		}

		sc.close();
	}

}
