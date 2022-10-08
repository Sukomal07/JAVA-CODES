public class Q1 {
    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(6);
        
    }
    public static void oddOrEven(int n){
        int bitmask=1;
        if((n&bitmask) ==0){
            System.out.println("Even number");
        }else{
            System.out.println("odd number");
        }
    }
}
