package breadthfirstsearch;

import java.util.LinkedList;

public class DepthFirstSearch {
	private int V;
	private LinkedList<Integer> adj[];
	
	
	
	public DepthFirstSearch(int v) {
		V = v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	
	public void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.println(v + " ");
		
		for(Integer i : adj[v]) {
			if(!visited[i]) {
				DFSUtil(i,visited);
			}	
		}
		
		
	}
	
	
	public void DFS(int v) {
		boolean visited[] = new boolean[V];
		
		DFSUtil(v, visited);
		
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				DFSUtil(i, visited);
			}
		}
		
	}
	
	

	
}
