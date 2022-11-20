public class RodCutting {
    public static int maxvalue(int length[], int price[], int totalrod) { // O(n*totalrod)
        int n = price.length;
        int dp[][] = new int[n + 1][totalrod + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < totalrod + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < totalrod + 1; j++) {
                if (length[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][totalrod];
    }
    public static int cutRod(int price[], int totalrod) {
        int dp[][] = new int[totalrod + 1][totalrod + 1];
        for(int i =0; i< totalrod+1; i++){
            for(int j =0; j< totalrod+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i =1; i<totalrod+1; i++){
            for(int j =1; j<totalrod+1; j++){
                if(i <= j){
                    dp[i][j] = Math.max(price[i-1] + dp[i][j- i] , dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[totalrod][totalrod];
    }
    public static void main(String[] args) {
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 }; // pieces length
        int price[] = { 3, 5, 8, 9, 10, 17, 17, 20 };
        int totalrod = 8;
        System.out.println(cutRod(price, totalrod));
        System.out.println(maxvalue(length, price, totalrod));
    }
}