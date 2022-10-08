public class clearLastIth {
    public static void main(String[] args) {
        System.out.println(ClearIthBits(15, 2));
    }
    public static int ClearIthBits(int n , int i) {
        int bitmask = (~0)<<i;
        return n& bitmask;
    }
}
