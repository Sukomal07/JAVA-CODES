public class Q2 {
    public static void main(String[] args) {
        int arr[] ={3,6,2,1,8,7,4,5,3,1};
        BasicSearch(arr);
        printArr(arr);
    }
    //selection sort
    public static void BasicSearch(int arr[]) {
        for(int i =0; i<arr.length-1; i++ ){
            int minpos = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[minpos] < arr[j]){
                    minpos=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }
    public static void printArr( int arr[]) {
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
