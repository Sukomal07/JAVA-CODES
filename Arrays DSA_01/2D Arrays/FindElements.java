import java.util.*;

public class FindElements {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int n = arr.length, m = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter elment ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing Matrix ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
        int large = arr[0][0] , bi =0 ,bj = 0;
        int small = arr[0][0] , si=0, sj=0;
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                if(large<arr[i][j]){
                    int temp = large;
                    large= arr[i][j];
                    arr[i][j] = temp;
                    bi=i ; bj=j;
                }else if(small> arr[i][j]){
                    int temp1= small;
                    small = arr[i][j];
                    arr[i][j] =temp1;
                    si=i;
                    sj=j;
                }
            }
        }
        System.out.println("largest number "+large + " t's position  " + bi +","+bj);
        System.out.println("smallest number "+small + " it's position  " +  si +","+sj);
    }
}
