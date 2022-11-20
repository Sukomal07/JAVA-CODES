public class lcs {
    public static int Lcs(int x, int y, String str1, String str2) {
        // recursion
        int ans = 0;
        if (x == 0 || y == 0) {
            return 0;
        }
        if (str1.charAt(x - 1) == str2.charAt(y - 1)) {
            ans += Lcs(x - 1, y - 1, str1, str2) + 1;
        } else {
            ans += Math.max(Lcs(x - 1, y, str1, str2), Lcs(x, y - 1, str1, str2));
        }
        return ans;
    }

    public static int memoizaton(int x, int y, String str1, String str2, int dp[][]) { // O(x*y)
        if (x == 0 || y == 0) {
            return 0;
        }
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        if (str1.charAt(x - 1) == str2.charAt(y - 1)) {
            return dp[x][y] = memoizaton(x - 1, y - 1, str1, str2, dp) + 1;
        } else {
            return dp[x][y] = Math.max(memoizaton(x - 1, y, str1, str2, dp), memoizaton(x, y - 1, str1, str2, dp));
        }
    }

    static int tabu(int x, int y, String str1, String str2) {
        int dp[][] = new int[x + 1][y + 1];
        for (int i = 1; i < x+1; i++) {
            for (int j = 1; j < y+1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[x][y];
    }

    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "AEDFHR";
        System.out.println(Lcs(str1.length(), str2.length(), str1, str2));

        int x = str1.length();
        int y = str2.length();
        int dp[][] = new int[x + 1][y + 1];
        for (int i = 0; i < x + 1; i++) {
            for (int j = 0; j < y + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(memoizaton(x, y, str1, str2, dp));
        System.out.println(tabu(x, y, str1, str2));
    }
}
