public class Q3 {
    // sum of n natural number
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int s1 = Sum(n-1);
        int sn = n+s1;
        return sn;
    }
    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
}
