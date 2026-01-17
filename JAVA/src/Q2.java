import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		System.out.println("Enter year: ");
		int y;
		Scanner in = new Scanner(System.in);
		y = in.nextInt();
		if (y%4==0) {
			if (y%100==0) {
				if (y%400==0)
					System.out.println("True");
				else {
					System.out.println("False");
				}
			}
			else {
				System.out.println("True");
			}
		}
		else {
			System.out.println("False");
		}
	}

}
