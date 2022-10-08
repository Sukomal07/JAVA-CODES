public class SubArraySum {
    public static void main(String[] args) {
        int numbers[] = { 5,-3,8,4,-2,-6};
        printSubArraySum(numbers);
    }
    public static void printSubArraySum(int numbers[]) {
        int currentSum = 0;
        int maxsum=Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j< numbers.length; j++){
                int end = j;
                currentSum = 0;
                for( int k = start; k<=end; k++){
                    currentSum = numbers[k];
                }
                System.out.println(currentSum);
                if(maxsum<currentSum){
                    maxsum = currentSum;
                }
            }
        }
        System.out.println("max sum = " + maxsum);
    }
}
