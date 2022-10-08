public class Q4 {
    public static void main(String[] args) {
        // System.out.println(6^6);
        int x=4, y=3;
        System.out.println("Before swap value of  x is "+ x + " and y is "+ y );
        x= x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap value of x is "+ x + " and y is " + y);
    }
}
