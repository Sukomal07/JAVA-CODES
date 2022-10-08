public class Q2 {
    public static void main(String[] args) {
        System.out.println(checkNumber(14));
    }
    public static boolean checkNumber(int n) {
        return (n&(n-1)) ==0;
    }
}
