class Building {
	double sq_ft;
	int story;

	Building() {
		this.sq_ft = 1000;
		this.story = 2;
	}

	Building(double f, int s) {
		this.sq_ft = f;
		this.story = s;
	}
	
	void details() {
		System.out.println("Square footage: "+this.sq_ft+"\nStory: "+this.story);
	}
}

class House extends Building {
	int bedroom;
	int bath;

	House(){
		super();
		this.bedroom = 0;
		this.bath = 0;
	}

	House(double f, int s, int a, int b) {
		super(f,s);
		this.bedroom = a;
		this.bath = b;
	}
	
	void details() {
		System.out.println("\n**House details**");
		super.details();
		System.out.println("No. of bedrooms: "+this.bedroom+"\nNo. of bathrooms: "+this.bath);
	}
}

class School extends Building {
	int classroom;
	String grade_level;

	School(){
		super();
		this.classroom = 20;
		this.grade_level = "Elementary";
	}

	School(double f, int s, int a, String b) {
		super(f,s);
		this.classroom = a;
		this.grade_level = b;
	}
	
	void details() {
		System.out.println("\n**School details**");
		super.details();
		System.out.println("No. of classrooms: "+this.classroom+"\nGrade level: "+this.grade_level);
	}
}

public class L7_3 {

	public static void main(String[] args) {
		
		Building b = new Building(2000,3);
		System.out.println("**Building details**");
		b.details();
		
		House h = new House(1500,2,5,6);
		h.details();
		
		School s = new School();
		s.details();
	}
}
