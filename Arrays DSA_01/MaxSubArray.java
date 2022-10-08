public class MaxSubArray {
    public static void main(String[] args) {
        int numbers[] = { 5,-3,8,4,-2,-6};
        SubArray(numbers);
    }
    public static void SubArray(int numbers[]) {
        int currentSum = 0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];  
        prefix[0] = numbers[0];
        for(int i =1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j< numbers.length; j++){
                int end = j;
                currentSum = 0;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxsum<currentSum){
                    maxsum = currentSum;
                }
            }
        }
        System.out.println("max sum " + maxsum);
    }
}
