import java.util.ArrayList;

public class Mothervertix {
    public static void addEdge(int u , int v , ArrayList<ArrayList<Integer>> graph){
        graph.get(u).add(v);
    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph , int V , boolean vis[]){
        vis[V] = true;
        for(int x : graph.get(V)){
            if(!vis[x]){
                dfs(graph, x, vis);
            }
        }
    }
    public static int findMother(ArrayList<ArrayList<Integer>> graph , int V){
        boolean vis[] = new boolean[V];
        int v = -1;
        for(int i =0 ; i<V; i++){
            if(!vis[i]){
                dfs(graph, i, vis);
                v = i;
            }
        }
        boolean check[] = new boolean[V];
        dfs(graph, v, check);
        for(boolean val : check){
            if(!val){
                return -1;
            }
        }
        return v;
    }
    public static void main(String[] args) {
        int V = 3;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i =0; i< V; i++){
            graph.add(new ArrayList<>());
        }
        // addEdge(0, 2, graph);
        // addEdge(0, 3, graph);
        // addEdge(1, 0, graph);
        // addEdge(2, 1, graph);
        // addEdge(3, 4, graph);
        addEdge(0, 1, graph);
        addEdge(2, 1, graph);
        System.out.println(findMother(graph, V));
    }
}
