public class Knights {
    public static int N = 8;

    public static boolean solveKT() {
        int sol[][] = new int[8][8];
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                sol[x][y] = -1;
            }
        }
        int xmove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int ymove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        sol[0][0] = 0;
        if (!solveKtutil(0, 0, 1, sol, xmove, ymove)) {
            System.out.println("Solution does not exits");
            return false;
        } else {
            printSolution(sol);
            return true;
        }
    }

    // a function to check if i,j are valid indexes for N*N chessboard
    public static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && y >= 0 && x < N && y < N && sol[x][y] == -1);
    }

    // function to solve knight problem
    public static boolean solveKtutil(int x, int y, int movei, int sol[][], int xmove[], int ymove[]) {
        int k, next_x, next_y;
        if (movei == N * N) {
            return true;
        }

        // try all move from current coordinates x,y
        for (k = 0; k < 8; k++) {
            next_x = x + xmove[k];
            next_y = y + ymove[k];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKtutil(next_x, next_y, movei + 1, sol, xmove, ymove)) {
                    return true;
                } else {
                    sol[next_x][next_y] = -1; // backtracking
                }
            }
        }
        return false;
    }

    public static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(sol[x][y] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        solveKT();
    }
}