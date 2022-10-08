public class Q8 {
    // Tiling Problem
    public static int CountWays(int n ) {
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1= CountWays(n-1);
        // Horaizontal choice
        int fnm2 = CountWays(n-2);
        //total ways
        int totalways = fnm1+fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(CountWays(5));
    }
}
