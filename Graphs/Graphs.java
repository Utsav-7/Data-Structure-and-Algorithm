import java.util.*;
import java.util.LinkedList;

public class Graphs {
    static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s,int d,int w){
            src=s;
            dest=d;
            weight=w;
        }
    }

    //Graph Traversal: 1) BFS 2)DFS

    //1) BFS  --->T.C = O(V+E)  V=vertex  E=Edge
    public static void BFS(ArrayList<Edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);  //source=0

        while(!q.isEmpty()){
            int curr=q.remove();

            if(!vis[curr]){     //vis curr if visted then true else false
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    //2) DFS
    public static void DFS(ArrayList<Edge>[] graph,int curr,boolean[] vis){
        //visit
        System.out.print(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                DFS(graph,e.dest,vis);
            }
        }
    }

    public static void main(String[] args) {
        int v=5; //vertex
        ArrayList<Edge>[] graph=new ArrayList[v];
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }

        //0-vertex
        graph[0].add(new Edge(0, 0, 5));

        //1-vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //2-vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));

        //3-vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 3, 1));

        //4-vertex
        graph[4].add(new Edge(4, 2, 2));
        BFS(graph);
        DFS(graph, 0, vis);
    }
}
