public class StringConversion {
    static int lcs(String str1, String str2, int n, int m) {
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[n][m];
    }
    static void convertion(String str1 , String str2){
        int n = str1.length();
        int m = str2.length();
        int len = lcs(str1, str2, n, m);
        System.out.println("minimum number of delete");
        System.out.println(m-len);
        System.out.println("minimum insertion");
        System.out.println(n-len);
    }
    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        convertion(str1, str2);
    }

}