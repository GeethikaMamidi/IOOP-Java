import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		int w;
		float r, s;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no. of hours worked by employee: ");
		w = in.nextInt();
		System.out.print("Enter hourly rate: ");
		r = in.nextFloat();
		if (w <= 40) {
			s = r * w;
		}
		else {
			int d = w - 40;
			s = r * 40 + r / 2 * d;
		}
		System.out.print("Salary of the employee: " + s);
	}
}