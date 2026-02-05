public class Add {
    public static void main(String[] args) {
        int x = 30, y = -5;
        int carry;
        while (y!=0) {
            carry = (x&y)<<1;
            x = x^y;
            y = carry;
        }
        System.out.println("Sum of two numbers: "+x);
    }
}