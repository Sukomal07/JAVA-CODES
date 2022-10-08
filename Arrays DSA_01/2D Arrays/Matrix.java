import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        int matrix[][] = new int[2][2];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter elment ");
                matrix[i][j] = sc.nextInt();
            }
        }
        // output
        System.out.println("Printing elements ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
        search(matrix, 2);
    }
    public static boolean search(int matrix[][], int key) {
        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at ( " + i + "," + j+ ")");
                    return true;
                }
            }
        }
        return false;
    }
}
