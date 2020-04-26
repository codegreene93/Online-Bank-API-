package breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadhFirstSearch {
	private int V;
	private  LinkedList<Integer> adj[];
	
	public BreadhFirstSearch(int v) {
		V = v;
		adj = new LinkedList[v];
		
		for (int i = 0; i<v; i++) {
			adj[i] = new LinkedList<>();
		}
		
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	
	public void BFS(int s) {
		
		boolean visited[]  = new boolean[V];
		Queue<Integer> queue = new LinkedList<>();
		
		visited[s] = true;
		queue.add(s);
		
		while(!queue.isEmpty()) {
			
			s = queue.poll();
			System.out.println(s + " ");
			
			for(Integer i: adj[s]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
					
				}	
			}			
		}

	}
	
	public static void main(String[] args) {
		
		BreadhFirstSearch g = new BreadhFirstSearch(4);
		
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal (starting from  Vertex 2)");
		g.BFS(2);

		
		System.out.println("Following is Breadth First Traversal (starting from  Vertex 1)");
		g.BFS(1);
		
		
	}
	
	
	
}
