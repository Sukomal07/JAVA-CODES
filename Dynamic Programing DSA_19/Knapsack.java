public class Knapsack {
    public static int recursion(int val[], int wt[], int w, int i) { // O(2^n)
        if (w == 0 || i == 0) {
            return 0;
        }
        if (wt[i - 1] <= w) { // i-1 = index
            // include
            int ans1 = val[i - 1] + recursion(val, wt, w - wt[i - 1], i - 1);
            // exclude
            int ans2 = recursion(val, wt, w, i - 1);
            return Math.max(ans1, ans2);
        } else {
            return recursion(val, wt, w, i - 1);
        }
    }

    public static int memoization(int val[], int wt[], int w, int i, int dp[][]) { // O(n*w)
        if (w == 0 || i == 0) {
            return 0;
        }
        if (dp[i][w] != -1) {
            return dp[i][w];
        }
        if (wt[i - 1] <= w) {
            // include
            int ans1 = val[i - 1] + memoization(val, wt, w - wt[i - 1], i - 1, dp);
            // exclude
            int ans2 = memoization(val, wt, w, i - 1, dp);
            dp[i][w] = Math.max(ans1, ans2);
            return dp[i][w];
        } else {
            dp[i][w] = memoization(val, wt, w, i - 1, dp);
            return dp[i][w];
        }
    }

    public static int tabulation(int val[], int wt[], int w) {
        int dp[][] = new int[val.length + 1][w + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < val.length + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                int v = val[i - 1]; // ith value
                int W = wt[i - 1]; // ith weight
                if (W <= j) {
                    int incprofit = v + dp[i - 1][j - W];
                    int exprofit = dp[i - 1][j];
                    dp[i][j] = Math.max(incprofit, exprofit);
                } else {
                    int exprofit = dp[i - 1][j];
                    dp[i][j] = exprofit;
                }
            }
        }
        return dp[val.length][w];
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int w = 7;
        int dp[][] = new int[val.length + 1][w + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(recursion(val, wt, w, val.length));
        System.out.println(memoization(val, wt, w, val.length, dp));
        System.out.println(tabulation(val, wt, w));
    }
}
