public class Q15 {
    public static int contiguous(String str , int start , int end , int n) {
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        // formula A U B = A + B - A intersection B
        int rest = contiguous(str, start+1, end, n-1) + contiguous(str, start, end-1, n-1) - contiguous(str, start+1, end-1, n-2);
        if(str.charAt(start) == str.charAt(end)){
            rest++;
        }
        return rest;
    }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(contiguous(str, 0, n-1, n));
    }
}
