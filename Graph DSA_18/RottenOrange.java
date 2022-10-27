import java.util.LinkedList;
import java.util.Queue;

public class RottenOrange {
    public static int R = 3;
    public static int C = 5;

    static class Pair {
        int x = 0;
        int y = 0;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static boolean isValid(int i, int j) {
        return (i >= 0 && j >= 0 && i < R && j < C);
    }

    static boolean isDelim(Pair temp) {
        return (temp.x == -1 && temp.y == -1);
    }

    static boolean checkAll(int arr[][]) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    static int rotten(int arr[][]) {
        Queue<Pair> q = new LinkedList<>();
        Pair temp;
        int ans = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] == 2) {
                    q.add(new Pair(i, j));
                }
            }
        }
        q.add(new Pair(-1, -1));
        while (!q.isEmpty()) {
            boolean vis = false;
            while (!isDelim(q.peek())) {
                temp = q.peek();
                if (isValid(temp.x + 1, temp.y) && arr[temp.x + 1][temp.y] == 1) {
                    if (!vis) {
                        ans++;
                        vis = true;
                    }
                    arr[temp.x + 1][temp.y] = 2;
                    temp.x++;
                    q.add(new Pair(temp.x, temp.y));
                    temp.x--;
                }
                if (isValid(temp.x - 1, temp.y) && arr[temp.x - 1][temp.y] == 1) {
                    if (!vis) {
                        ans++;
                        vis = true;
                    }
                    arr[temp.x - 1][temp.y] = 2;
                    temp.x--;
                    q.add(new Pair(temp.x, temp.y));
                    temp.x++;
                }
                if (isValid(temp.x, temp.y + 1) && arr[temp.x][temp.y + 1] == 1) {
                    if (!vis) {
                        ans++;
                        vis = true;
                    }
                    arr[temp.x][temp.y + 1] = 2;
                    temp.y++;
                    q.add(new Pair(temp.x, temp.y));
                    temp.y--;
                }
                if (isValid(temp.x, temp.y - 1) && arr[temp.x][temp.y - 1] == 1) {
                    if (!vis) {
                        ans++;
                        vis = true;
                    }
                    arr[temp.x][temp.y - 1] = 2;
                    temp.y--;
                    q.add(new Pair(temp.x, temp.y));
                }
                q.remove();
            }
            q.remove();
            if (!q.isEmpty()) {
                q.add(new Pair(-1, -1));
            }
        }
        return (checkAll(arr)) ? -1 : ans;
    }

    public static void main(String[] args) {
        int arr[][] = {{2,1,0,2,1},
                        {1,0,1,2,1},
                    {1,0,0,2,1}};
        int ans = rotten(arr);
        if(ans == -1){
            System.out.println("All orange cannot rot");
        }else{
            System.out.println("Time recuired for all orange to rot " + ans);
        }
    }
}
