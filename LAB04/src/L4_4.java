class Counter {
    private static int count = 0;
     Counter() {
        count+=1;
    }
    static int showCount() {
    	return count;
    }
}

public class L4_4 {

	public static void main(String[] args) {
		Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("No. of counter objects created: "+Counter.showCount());
	}

}
