import java.util.Scanner;
public class L1_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		System.out.print("Enter the no. of products in stock: ");
		x = in.nextInt();
		String[] n = new String[x];
		double[] p = new double[x];
		int[] q = new int[x];
		for(int i=0;i<x;i++) {
			System.out.println("Enter details of product "+(i+1)+":");
			
			System.out.print("Name: ");
			n[i] = in.next();
			
			System.out.print("Price: ");
			p[i] = in.nextDouble();
			
			System.out.print("Quantity: ");
			q[i] = in.nextInt();
		}
		System.out.println("Items in stock:");
		System.out.println("ID\tName\tPrice\tQuantity");
		for(int i=0;i<x;i++) {
			System.out.println(i+1+"\t"+n[i]+"\t"+p[i]+"\t"+q[i]);
		}
		int y,id,q1;
		System.out.print("No. of unique products to purchase: ");
		y = in.nextInt();
		double bill=0;
		for(int i=0;i<y;i++) {
			System.out.println("Product "+(i+1)+":");
			System.out.print("ID: ");
			id = in.nextInt();
			
			System.out.print("Quantity: ");
			q1 = in.nextInt();
			if (q1<=q[id-1]) {
				bill+=p[id-1]*q1;
				q[id-1]-=q1;
			} else {
				System.out.println("Insufficient stock for "+n[id-1]);
			}
		}
		System.out.println("Total bill: "+bill);
	}

}
