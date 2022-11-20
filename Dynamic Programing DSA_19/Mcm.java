import java.util.Arrays;

public class Mcm {
    // Recursion
    static int minimumCost(int arr[], int i, int j) {
        if (i == j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = minimumCost(arr, i, k); // Ai.....Ak arr(i-1) arr(k)
            int cost2 = minimumCost(arr, k + 1, j); // Ak+1..... Aj arr(k)arr(j)
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return ans;
    }

    static int minimumCostMemo(int arr[], int i, int j, int dp[][]) { // O(n2)
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int finalCost = minimumCostMemo(arr, i, k, dp) + minimumCostMemo(arr, k + 1, j, dp)
                    + arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(ans, finalCost);
        }
        return dp[i][j] = ans;
    }

    static int minimumCostTabu(int arr[]) {
        int dp[][] = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            dp[i][i] = 0;
        }
        for (int len = 2; len <= arr.length - 1; len++) {
            for (int i = 1; i <= arr.length - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int finalCost = dp[i][k] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], finalCost);
                }
            }
        }
        print(dp);
        return dp[1][arr.length - 1];
    }

    static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        System.out.println(minimumCost(arr, 1, arr.length - 1));
        int dp[][] = new int[arr.length + 1][arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(minimumCostMemo(arr, 1, arr.length - 1, dp));
        System.out.println(minimumCostTabu(arr));
    }
}
