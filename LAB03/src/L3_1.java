import java.util.Scanner;

class STUDENT {
	String sname;
	double total = 0, avg = 0;
	double[] marks_array;

	void assign() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student details:");
		System.out.print("Name: ");
		sname = sc.nextLine();
		marks_array = new double[5];
		System.out.println("Marks in 5 subjects: ");
		for (int i = 0; i < 5; i++) {
			marks_array[i] = sc.nextInt();
		}
	}

	void compute() {
		total = 0;
		for (int i = 0; i < 5; i++) {
			total += marks_array[i];
		}
		avg = total / 5;
	}

	void display() {
		System.out.println("\nStudent Report");
		System.out.println("Name: " + sname + "\nMarks: ");
		for (double marks : marks_array) {
			System.out.print(marks + " ");
		}
		System.out.println("Total: " + total + "\nAverage: " + avg);
	}
}

public class L3_1 {
	public static void main(String[] args) {
		STUDENT s1 = new STUDENT();
		s1.assign();
		s1.compute();
		s1.display();
	}
}
