public class Q3 {
    public static void main(String[] args) {
        int row=2,col =3;
        int matrix[][] ={{2,3,7},{ 2,4,9}};

        // display original matrix
        printMatrix(matrix);

        //transpoms of the matrix
        int trans[][] = new int [col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                trans[j][i]= matrix[i][j];
            }
        }
        // print transpons matrix
        printMatrix(trans);
    }
    public static void printMatrix(int matrix[][]) {
        System.out.println("The matrix is ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
