public class Permution {
    public static void Findpermution(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.print(ans+" ");
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // remove pick up string from character
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            // add current string to answer
            Findpermution(Newstr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        Findpermution(str, "");
    }
}
