public class RegionInMatrix {
    static int R, C, count;

    static boolean isSafe(int M[][], int r, int c, boolean vis[][]) {
        if (r >= 0 && c >= 0 && r < R && c < C && M[r][c] == 1 && !vis[r][c]) {
            return true;
        }
        return false;
    }

    static void dfs(int M[][], int r, int c, boolean vis[][]) {
        int rowNbr[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int colNbr[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
        vis[r][c] = true;
        for (int k = 0; k < 8; k++) {
            if (isSafe(M, r + rowNbr[k], c + colNbr[k], vis)) {
                count++;
                dfs(M, r + rowNbr[k], c + colNbr[k], vis);
            }
        }
    }

    static int largestRegion(int M[][]) {
        boolean vis[][] = new boolean[R][C];
        int result = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (M[i][j] == 1 && !vis[i][j]) {
                    count = 1;
                    dfs(M, i, j, vis);
                    result = Math.max(result, count);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int M[][] = {{0,0,1,1,0},
                    {0,0,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,1}};
        R = 4;
        C = 5;
        System.out.println(largestRegion(M));
    }
}
