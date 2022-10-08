public class kadans {
    public static void main(String[] args) {
        int numbers[]= { -4,-6,-2,3,-5,-9,-4};
        array(numbers);
    }
    public static void array(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs =0;
            }
            max = Math.max(cs, max);
        }
        System.out.println("max of subarray sum " + max);
    }
}
