import java.util.ArrayList;

public class BeautifulArray {
    // using iterative
    // public static ArrayList<Integer> Arrange(int n) {
    // ArrayList<Integer> ans = new ArrayList<>();
    // ans.add(1);
    // for (int i = 2; i <= n; i++) {
    // ArrayList<Integer> temp = new ArrayList<>();
    // for (Integer e : ans) {
    // // even case
    // if (2 * e <= n) {
    // temp.add(e * 2);
    // }
    // }
    // // odd case
    // for (Integer e : ans) {
    // if (2 * e - 1 <= n) {
    // temp.add(2 * e - 1);
    // }
    // }
    // ans = temp;
    // }
    // return ans;
    // }

    // divide & conquer
    public static ArrayList<Integer> Arrange(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideConquer(1, 1, res, n);
        return res;
    }

    public static void divideConquer(int start, int inc, ArrayList<Integer> res, int n) {
        if (start + inc > n) {
            res.add(start);
            return;
        }
        divideConquer(start, 2 * inc, res, n);
        divideConquer(start + inc, 2 * inc, res, n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrange(n));
        
    }
}
