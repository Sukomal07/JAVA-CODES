import java.util.ArrayList;

public class FindCycle {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        // graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 3));
        // graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 4));
        // graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));
        // graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));
        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));
        // graph[5].add(new Edge(5, 6));
        // graph[6].add(new Edge(6, 5));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    // public static boolean isCycle(ArrayList<Edge> graph[]) { // O(V+E)
    // boolean vis[] = new boolean[graph.length];
    // for (int i = 0; i < graph.length; i++) {
    // if (!vis[i]) {
    // if (isCycleUtil(graph, vis, i, -1)) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // public static boolean isCycleUtil(ArrayList<Edge> graph[], boolean vis[], int
    // curr, int par) {
    // vis[curr] = true;
    // for (int i = 0; i < graph[curr].size(); i++) {
    // Edge e = graph[curr].get(i);
    // // case3
    // if (!vis[e.dest]) {
    // if (isCycleUtil(graph, vis, e.dest, curr)) {
    // return true;
    // }
    // }else if(vis[curr] && curr != par){ // case 1
    // return true;
    // }
    // // case 2 do nothing - continue
    // }
    // return false;
    // }

    // using DFS
    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) {
                return true;
            }
            if (!vis[e.dest]) {
                if (isCycleUtil(graph, e.dest, vis, stack)) {
                    return true;
                }
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        // int v = 7;
        int v = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph));
        // System.out.println(isCycle(graph));
    }
}
