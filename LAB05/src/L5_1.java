import java.util.Scanner;

class Student {
	String sname;
	double total = 0, avg = 0;
	Subject[] sub;
	int c;

	class Subject {
		String subjectName;
		double marks;

		void assign(String name, double m) {
			this.subjectName = name;
			this.marks = m;
		}

		void display_sub() {
			System.out.println("Subject: " + subjectName + ", Marks: " + marks);
		}
	}

	Student(String sname, int c) {
		this.sname = sname;
		this.sub = new Subject[c];
		this.c = 0;
	}

	void addSubject(String name, double marks) {
		if (c < sub.length) {
			sub[c] = new Subject();
			sub[c].assign(name, marks);
			c++;
		}
	}

	void compute() {
		this.total = 0;
		for (int i = 0; i < c; i++) {
			total += sub[i].marks;
		}
		this.avg = total/c;
	}

	void display() {
		System.out.println("***Report Card***\nName: " + sname);
		for (int i = 0; i < c; i++) {
			sub[i].display_sub();
		}
		System.out.println("Total: " + this.total+"\nAverage: " + this.avg);
	}
}

public class L5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();

		System.out.print("Enter no. of sub: ");
		int num = sc.nextInt();
		sc.nextLine();

		Student s = new Student(name, num);
		for (int i = 0; i < num; i++) {
			System.out.print("Subject " + (i + 1) +": ");
			String subName = sc.next(); // Reads one word
			System.out.print("Marks: ");
			double m = sc.nextDouble();
			sc.nextLine();
			s.addSubject(subName, m);
		}
		s.compute();
		s.display();
		sc.close();
	}

}
