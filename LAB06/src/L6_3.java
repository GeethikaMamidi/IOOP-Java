
class student {
	String sname;
	double total = 0, avg = 0;
	double[] m_array;
	int c;

	student(String n, double[] m) {
		this.sname = n;
		this.m_array = m;
		compute();
	}

	student() {
		this.sname = "Unknown";
		this.m_array = new double[5];
	}

	void compute() {
		total = 0;
		for (double m : m_array) {
			total += m;
		}
		avg = total / m_array.length;
	}

	void display() {
		System.out.println("\nStudent Report");
		System.out.println("Name: " + sname);
		System.out.println("Marks: ");
		for (double m : m_array) {
			System.out.println(m);
		}
		System.out.print("\nTotal: " + this.total);
		System.out.print("\nAverage: " + this.avg);
	}

	String extractInitials() {
		String[] parts = sname.split(" ");
		String r = "";
		for (String p : parts) {
			if (!p.isEmpty()) {
				r += p.charAt(0);
			}
		}
		return r.toUpperCase();
	}

	String removeWhiteSpace() {
		String r = "";
		for (char c : sname.toCharArray()) {
			if (!Character.isWhitespace(c)) {
				r += c;
			}
		}
		return r;
	}
}

public class L6_3 {

	public static void main(String[] args) {
        double[] marks = {10, 9, 8, 9};
        student st1 = new student("Santosh Kumar", marks);
        student st2 = new student("Geetha Madhuri", marks);

        student[] st_arr = {st1, st2};

        System.out.println("Names with 'Geetha':");
        for (student s : st_arr) {
            if (s.sname.toLowerCase().contains("geetha")) {
                System.out.println(s.sname);
            }
        }

        System.out.println("\nAscending Order:");
        for (int i = 0; i < st_arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < st_arr.length; j++) {
                if (st_arr[j].sname.compareToIgnoreCase(st_arr[min].sname) < 0) {
                    min = j;
                }
            }

            student temp = st_arr[i];
            st_arr[i] = st_arr[min];
            st_arr[min] = temp;
        }

        for (student s : st_arr) {
            System.out.println(s.sname);
        }

        System.out.println("\nInitials: " + st_arr[0].extractInitials());
        System.out.println("Without spaces: " + st_arr[0].removeWhiteSpace());
    }
}