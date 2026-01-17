import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		int i,w,f;
		double d;
		char c;
		byte e;
		System.out.println("Enter an Integer, Double and a Char: ");
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		d = in.nextDouble();
		c = in.next().charAt(0);
		i = (byte)i;
		System.out.println(i);
		w = (int)c;
		System.out.println(w);
		e = (byte)d;
		System.out.println(e);
		f = (int)d;
		System.out.println(f);
	}

}
