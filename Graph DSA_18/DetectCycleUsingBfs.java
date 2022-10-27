import java.util.*;

public class DetectCycleUsingBfs {
    public static void addEdge(ArrayList<Integer> graph[], int u, int v) {
        graph[u].add(v);
        graph[v].add(u);
    }

    public static boolean isCycle(ArrayList<Integer> graph[], int s, int V, boolean vis[]) {
        int par[] = new int[V];
        Arrays.fill(par, -1);
        Queue<Integer> q = new LinkedList<>();
        vis[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.remove();
            for (int i = 0; i < graph[u].size(); i++) {
                int v = graph[u].get(i);
                if (!vis[v]) {
                    vis[v] = true;
                    q.add(v);
                    par[v] = u;
                } else if (par[u] != v) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Integer> graph[], int V) {
        boolean vis[] = new boolean[V];
        Arrays.fill(vis, false);
        for (int i = 0; i < V; i++) {
            if (!vis[i] && isCycle(graph, i, V, vis)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Integer> graph[] = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 0);
        addEdge(graph, 2, 3);
        if (isCycleUtil(graph, v)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

    }
}
