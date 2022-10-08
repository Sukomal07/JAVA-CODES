public class FindSubsets {
    public static void Find(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }else{
                System.out.print(ans+" ");
            }
            return;
        }

        // recursion
        // yes choice
        Find(str, ans + str.charAt(i), i + 1);
        // no choice
        Find(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        Find(str, "", 0);
    }
}
