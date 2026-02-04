
class Die {
	int SideUp;

	void Roll() {
		this.SideUp = ((int) (Math.random() * 6)) + 1;
		getSideUp(this.SideUp);
		}
	
	int getSideUp(int x) {
		System.out.println("Value on Die: ");
		return x;
	}
}
class DieDemo{
	public static void main(String[] args) {
		int r1,r2;
		Die d1 = new  Die();
		Die d2 = new  Die();
		r1 = d1.Roll();
		r2 = d2.Roll();
	}
}

public class L3_4 {

	public static void main(String[] args) {

	}

}
