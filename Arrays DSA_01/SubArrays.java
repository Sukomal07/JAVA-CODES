public class SubArrays {
    public static void main(String[] args) {
        int numbers[] = {4,6,3,5,8,9};
        printSubArrays(numbers);
    }
    public static void printSubArrays(int numbers[]) {
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j< numbers.length; j++){
                int end = j;
                for( int k = start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
