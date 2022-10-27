import java.util.*;

public class BellmanFord {
    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }

    // public static void createGraph(ArrayList<Edge> graph[]) {
    // for (int i = 0; i < graph.length; i++) {
    // graph[i] = new ArrayList<>();
    // }
    // graph[0].add(new Edge(0, 1, 2));
    // graph[0].add(new Edge(0, 2, 4));
    // graph[1].add(new Edge(1, 2, -4));
    // graph[2].add(new Edge(2, 3, 2));
    // graph[3].add(new Edge(3, 4, 4));
    // graph[4].add(new Edge(4, 1, -1));
    // }
    public static void createGraph(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }

    // public static void findPath(ArrayList<Edge> graph[], int src) {// O(V*E)
    // int dist[] = new int[graph.length];
    // for (int i = 0; i < dist.length; i++) {
    // if (i != src) {
    // dist[i] = Integer.MAX_VALUE;
    // }
    // }
    // int v = graph.length;
    // for (int i = 0; i < v - 1; i++) {
    // for (int j = 0; j < graph.length; j++) {
    // for (int k = 0; k < graph[j].size(); k++) {
    // Edge e = graph[j].get(k);
    // int u = e.src;
    // int V = e.dest;
    // int w = e.wt;
    // if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[V]) {
    // dist[V] = dist[u] + w;
    // }
    // }
    // }
    // }
    // for (int i = 0; i < dist.length; i++) {
    // System.out.print(dist[i] + " ");
    // }
    // System.out.println();
    // }
    public static void findPath(ArrayList<Edge> graph, int src, int v) { //O(V*E)
        int dist[] = new int[v];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < v - 1; i++) {
            for (int j = 0; j < graph.size(); j++) {
                Edge e = graph.get(j);
                int u = e.src;
                int V = e.dest;
                int w = e.wt;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[V]) {
                    dist[V] = dist[u] + w;
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 5;
        // @SuppressWarnings("unchecked")
        // ArrayList<Edge> graph[] = new ArrayList[v];
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);
        findPath(graph, 0, v);
    }
}
