

public class Q1 {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(checkPalindrom(str));
    }
    public static boolean checkPalindrom(String str) {
        int n= str.length();
        for(int i =0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
// time complexity  of this code O(n)
// code run to 0 to (n-2)+
