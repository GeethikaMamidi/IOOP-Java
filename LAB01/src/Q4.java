import java.util.Arrays;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n;
		System.out.println("No. of steps: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		rotate(a, n);
		System.out.println(Arrays.toString(a));
	}

	static void rotate(int[] a, int k) {
		k = k % a.length;
		if (k < 0)
			k = k + a.length;
		reverse(a, 0, k - 1);
		reverse(a, k, a.length - 1);
		reverse(a, 0, a.length - 1);
	}

	static void reverse(int[] x, int y, int z) {
		while (y < z) {
			int temp = x[y];
			x[y] = x[z];
			x[z] = temp;
			y++;
			z--;
		}
	}
}
