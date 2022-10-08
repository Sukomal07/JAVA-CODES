public class Q7 {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        // int xmn = power(x, n-1);
        // int xn = x*xmn;
        // return xn;
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
