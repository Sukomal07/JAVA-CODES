public class Q10 {
    public static int friendsPairing(int n) {
        if(n==1 || n==2){
            return n;
        }
        // //choice
        // //single
        // int fnm1 = friendsPairing(n-1);

        // // paired
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1) * fnm2;

        // // totalways
        // int totalways = fnm1 + pairWays;
        // return totalways;
        // upper code in one line

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args) {
        friendsPairing(4);
    }
}
