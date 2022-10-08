import java.util.LinkedList;
import java.util.Queue;

public class MinimumTimeFillnSolts {
    public static void minTime(int r[], int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[n + 1];
        int time = 0;
        for (int i = 0; i < k; i++) {
            q.add(r[i]);
            vis[r[i]] = true;
        }
        while (q.size() > 0) {
            for (int i = 0; i < q.size(); i++) {
                int curr = q.poll();
                if (curr - 1 >= 1 && !vis[curr - 1]) {
                    vis[curr - 1] = true;
                    q.add(curr - 1);
                }
                if (curr + 1 <= n && !vis[curr + 1]) {
                    vis[curr + 1] = true;
                    q.add(curr + 1);
                }
            }
            time++;
        }
        System.out.println(time - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        int r[] = { 2,6 };
        int k = 2;
        minTime(r, n, k);
    }
}
