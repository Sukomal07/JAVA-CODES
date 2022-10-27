import java.util.ArrayList;
import java.util.Collections;

public class KruskalsAlgo {
    static class Edge implements Comparable<Edge>{
        int src, dest , wt;
        Edge(int s , int d , int w){
            src = s;
            dest = d;
            wt = w;
        }
        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph){
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 3, 50));
    }
    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];
    public static void init(){
        for(int i =0; i<n; i++){
            par[i] = i;
        }
    }
    public static int find(int x){
        if(par[x] == x){
            return x;
        }
        return par[x] = find(par[x]);
    }
    public static void union(int a , int b){
        int parA = find(a);
        int parB = find(b);
        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }else{
            par[parB] = parA;
        }
    }
    public static void Kruskal(ArrayList<Edge> graph , int v){
        init();
        Collections.sort(graph);
        int minCost = 0;
        int count = 0;
        for(int i =0; count<v-1; i++){
            Edge e = graph.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);
            if(parA != parB){
                union(e.src, e.dest);
                minCost += e.wt;
                count++;
            }
        }
        System.out.println(minCost);
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);
        Kruskal(graph, v);
    }
}
