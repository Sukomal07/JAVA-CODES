public class fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int fibMemoization(int n, int f[]) { // O(n)
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fibMemoization(n - 1, f) + fibMemoization(n - 2, f);
        return f[n];
    }

    public static int fibTabulation(int n) { // O(n)
        int dp[] = new int[n + 1]; // from 0 index to nth index
        dp[0] = 0;
        dp[1] = 1;
        // loop start from 2 because 0,1 already initialization
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        // int f[] = new int[n + 1];
        // System.out.println(fibMemoization(n, f));
        System.out.println(fibTabulation(n));
        System.out.println(fib(n));
    }
}