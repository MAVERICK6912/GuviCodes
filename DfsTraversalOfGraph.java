import java.io.*;
import java.uti.*;
class DfsTraversalOfGraph {
	private int V;
	private LinkedList<Integer> adj[];

	DfsTraversalOfGraph(int v){
		V=v;
		adj=new LinkedList[v];
		for (int i=0;i<v ;i++ ) {
			adj[i]=new LinkedList();
		}
	}
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	void DfsUtility(int v, boolean visited[]){
		visited[v]=true;
		System.out.print(v+" ");
		Iterator<Integer> it= adj[v].listIterator)();
		while (it.hasNext()) {
			int n=i.next();
			if (!visited[n]) {
				DfsUtility(n, visited);
			}
		}
	}
	void DFS(int v){
		boolean visited[]=new boolean[V];
		DfsUtility(v, visited);
	}
	public static void main(String[] args) {
		DfsTraversalOfGraph dfs=new DfsTraversalOfGraph();//pass the number of vertices here.
		dfs.addEdge();//pass the adjacency list here.
		dfs.DFS();//pass source node here.
	}
}
/*
Passing the adjacency list:
consider the adjacency list:
-----------------------------------
|0|-> |1 |->|2|/|
|1|-> |2 |/|
|2|-> |0 |->|3|/|
|3|-> |3 |/|
-----------------------------------
pass it as:
bfs.addEdge(0,1);
bfs.addEdge(0,2);
bfs.addEdge(1,2);
bfs.addEdge(2,0);
bfs.addEdge(2,3);
bfs.addEdge(3,3);
*/