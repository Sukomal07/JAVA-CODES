import java.util.*;

public class PrimAlgo {
    static class Edge {
        int src, dest, wt;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
        graph[3].add(new Edge(3, 0, 30));
    }

    static class Pair implements Comparable<Pair> {
        int vis;
        int cost;

        Pair(int v, int c) {
            vis = v;
            cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void prims(ArrayList<Edge> graph[]) { //O(ElogE)
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.vis]) {
                vis[curr.vis] = true;
                finalCost += curr.cost;
                for (int i = 0; i < graph[curr.vis].size(); i++) {
                    Edge e = graph[curr.vis].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }
        System.out.println("final cost = " + finalCost);
    }

    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        prims(graph);
    }
}
