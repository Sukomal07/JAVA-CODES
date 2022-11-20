import java.util.Arrays;

public class climbingStairs {
    public static int totalWays(int n, int ways[]) {
        // memoization - O(n) | recursion -2^n
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) { // Already calculate
            return ways[n];
        }
        ways[n] = totalWays(n - 1, ways) + totalWays(n - 2, ways);
        return ways[n];
    }
    public static int tabulation(int n){ // O(n)
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i =1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(totalWays(n, ways));
        System.out.println(tabulation(n));
    }
}
