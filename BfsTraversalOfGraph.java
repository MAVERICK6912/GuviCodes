import java.io.*;
import java.util.*;
class BfsTraversalOfGraph{
	private int V;
	private LinkedList<Integer> adj[];
	BfsTraversalOfGraph(int v){
		V=v;
		adj=new LinkedList[v];
		for (int i=0;i<v ;i++ ) {
			adj[i]=new LinkedList();
		}
		void addEdge(int v, int w){
			adj[v].add(w);
		}
		void BFS(int s){
			boolean visited[]=new boolean[V];
			LinkedList<Integer> queue = new LinkedList<Integer>();
			visited[s]=true;
			queue.add(s);
			while (queue.size()!=0) {
			s=queue.poll();
			System.out.print(s+" ");
			Iterator<Integer>it = adj[s].listIterator();
			while (i.hasNext()) {
				int n=i.next();
				if (!visited[n]) {
					visited[n]=true;
					queue.add(n);					
					}
				}				
			}
		}
		public static void main(String[] args) {
			BfsTraversalOfGraph bfs=new BfsTraversalOfGraph(); //pass the number of vertices here.
			bfs.addEdge();// pass the adjacency list here.
			bfs.BFS();//pass source node here.
		}
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