public class updateIthbit {
    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10, 2, 1));
    }
    public static int ClearIthBit(int n , int i) {
        int bitmask= ~(1<<i);
        return n &  bitmask;
    }
    public static int UpdateIthBit( int n, int i, int newbit){
        // best approach
        // if(newbit == 0){
        //     return clearIthbit(n,i);

        // }else{
        //     return SetIthbit(n,i);
        // }

        n = ClearIthBit(n, i);
        int bitmask = newbit<<i;
        return n|bitmask;
    }
}
