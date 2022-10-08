public class Q4 {
    public static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        int fib1 = fibonacci(n-1);
        int fib2 = fibonacci(n-2);
        int fibN = fib1 + fib2;
        return fibN;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
