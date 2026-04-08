class STUDENT {
    String sname;
    double total = 0, avg = 0;
    int[] marks;

    STUDENT() {
        this.sname = "Unknown";
        this.marks = new int[3];
    }

    STUDENT(String n, int[] m) {
        this.sname = n;
        this.marks = m;
    }

    void compute() {
        for (double m : marks) {
            total += m;
        }
        avg = total / marks.length;
    }

    void display() {
        System.out.println("Name: " + sname + "\nMarks: ");
        for (double m : marks) {
            System.out.println(m);
        }
        System.out.println("Total: " + total + "\nAverage: " + avg);
    }
}

class ScienceStudent extends STUDENT {
    int practicalMarks;

    ScienceStudent() {
        super();
        practicalMarks = 0;
    }

    ScienceStudent(String n, int[] m, int p) {
        super(n, m);
        practicalMarks = p;
    }

    @Override
    void compute() {
        for (double m : marks) {
            total += m;
        }
        total += practicalMarks;
        avg = total / (marks.length + 1);
    }

    void displayPracticalMarks() {
        System.out.println("Practical marks: " + practicalMarks);
    }

    @Override
    void display() {
        System.out.println("\n**Science Student**");
        System.out.println("Name: " + sname + "\nMarks: ");
        for (double m : marks) {
            System.out.println(m);
        }
        System.out.println("Total: " + total + "\nAverage: " + avg);
    }
}

class ArtsStudent extends STUDENT {
    String electiveSubject;

    ArtsStudent() {
        super();
        electiveSubject = "Unknown";
    }

    ArtsStudent(String n, int[] m, String e) {
        super(n, m);
        electiveSubject = e;
    }

    @Override
    void display() {
        System.out.println("\n**Arts Student**");
        super.display();
        System.out.println("Elective Subject: " + electiveSubject);
    }
}

public class L7_1 {
    public static void main(String[] args) {
        int[] mark = {4, 5, 3};

        STUDENT s = new STUDENT("Geetha", mark);
        s.compute();
        s.display();

        ScienceStudent s1 = new ScienceStudent("Harsha", mark, 5);
        s1.compute();
        s1.display();
        s1.displayPracticalMarks();

        STUDENT s2 = new ArtsStudent("Manish", mark, "Psychology");
        s2.compute();
        s2.display();
    }
}