import java.util.*;
class bellmanford{
    static int inf=Integer.MAX_VALUE;
    public static void BellMan(int graph[][],int E,int V,int src,int des){
        int dist[]=new int[E];
        int parent[]=new int[E];
        Arrays.fill(dist, inf);
        Arrays.fill(parent, -1);
        dist[src]=0;

        for(int i=0;i<V-1;i++){
            for(int j=0;j<E;j++){
                int u=graph[j][0];
                int v=graph[j][1];
                int weight=graph[j][2];

                if(dist[u] != inf && dist[u] + weight < dist[v]){
                    dist[v]=dist[u] + weight;
                    parent[v]=u;
                }
            }
        }
        for(int j=0;j<E;j++){
            int u=graph[j][0];
            int v=graph[j][1];
            int weight=graph[j][2];

            if(dist[u] != inf && dist[u] + weight < dist[v]){
                System.out.println("Negative Cycle");
            }
        }

        System.out.println(Arrays.toString(dist));
        System.out.println("The "+src+" to "+des+":"+dist[des]);
        printparent(parent,des); 
    }
    public static void printparent(int parent[],int node){
        if(parent[node] == -1){
            System.out.print(node);
            return;
        }
        printparent(parent, parent[node]);
        System.out.print("->"+node);
    }
    public static void main(String args[]){
        int E=5,V=6;
        int src=0,des=3;
        int graph[][]={
            {0,1,-1},
            {0,2,1},
            {1,2,2},
            {1,3,2},
            {2,4,1},
            {3,4,3}
            };

        BellMan(graph,E,V,src,des);

    }
}