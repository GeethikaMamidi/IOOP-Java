
public class L6_1 {

	public static void main(String[] args) {

		String a = "hello";
		System.out.println("String: " + a);
		StringBuffer b = new StringBuffer(a);
		if (a.equals(b.reverse().toString())) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
		StringBuffer c = new StringBuffer(a);
		c.reverse();
		System.out.println("Original String: " + a);
		System.out.println("Reversed String: " + c);

		char arr[] = a.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("Alphabetical Order: " + new String(arr));

		StringBuffer d = new StringBuffer(a);
		String rev = d.reverse().toString();
		System.out.println("Concatenated String: " + a + d);
	}

}
