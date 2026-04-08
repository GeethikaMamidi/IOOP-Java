class Student {
	int roll;
	double mark;

	int getRollNum() {
	    return this.roll;
	}

	void putRollNum(int r) {
		this.roll = r;
	}

	double getMarks() {
		return this.mark;
	}

	void putMarks(double m) {
		this.mark = m;
	}
}

interface Sports {
	void putSportsScore(double s);
}

class Result implements Sports {
	Student s;

	Result(Student st) {
		this.s = st;
	}

	double score;

	public void putSportsScore(double s) {
		this.score = s;
	}

	void res() {
		System.out.println("Total marks: " + (s.getMarks() + this.score));
	}
}

public class L8_3 {
	public static void main(String[] args) {
		Student s = new Student();
		s.putRollNum(7);
		s.getRollNum();
		s.putMarks(94);
		s.getMarks();

		Result r = new Result(s);
		r.putSportsScore(96);
		r.res();
	}
}
