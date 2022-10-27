public class Flood {
    public static void helper(int image[][], int sr, int sc, int newcolor,  int orgcol) {
        if (sr < 0  || sr >= image.length ||  sc < 0 || sc >= image[0].length ){
            return;
        } 
        if(image[sr][sc] != orgcol) {
            return;
        }
        image[sr][sc] = newcolor;
        // left
        helper(image, sr, sc - 1, newcolor, orgcol);
        // right
        helper(image, sr, sc + 1, newcolor, orgcol);
        // up
        helper(image, sr - 1, sc, newcolor, orgcol);
        // down
        helper(image, sr + 1, sc, newcolor, orgcol);
    }

    public static void floodfill(int image[][], int sr, int sc, int newcolor) {
        int orgcol = image[sr][sc];
        if(orgcol == newcolor){
            return;
        }
        helper(image, sr, sc, newcolor, orgcol);
    }

    public static void main(String[] args) {
        int image[][] = { { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 } };

        int sr = 1, sc = 1, newcolor = 2;
        floodfill(image, sr, sc, newcolor);
        for(int i =0; i<image.length; i++){
            for(int j =0; j<image[0].length; j++){
                System.out.print(image[i][j] +" ");
            }
            System.out.println();
        }
    }
}
