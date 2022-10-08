public class BubblleSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        BasicShorting(arr);
        printArr(arr);
    }
    public static void BasicShorting(int arr[]) {
        //outer loops n times
        for(int turn =0; turn<arr.length; turn++){
            //inner loops n-1-turn times
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr( int arr[]) {
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 
}
