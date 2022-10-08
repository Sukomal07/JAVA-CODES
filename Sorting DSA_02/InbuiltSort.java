import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
    public static void main(String[] args) {
        Integer arr[] = {5,3,1,4,2};
        Arrays.sort(arr); // sorting Array through inbuilt funtion
        Arrays.sort(arr,Collections.reverseOrder()); // reverse array through inbuilt funtion
        printArr(arr);
        
    }
    public static void printArr( Integer arr[]) {
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 
}
