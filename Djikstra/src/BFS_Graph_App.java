import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

 class Graph{
	
	private class Vertex{
		char label;
		boolean wasVisited;
		
		public Vertex(char label) {
			this.label = label;
			this.wasVisited = false;
		}
	}
	
	private int MAX_VERTICES = 10;
	private Vertex vertices[];
	private int numVerts;
	private int adjMatrix[][];
	Queue<Integer> q;
	Stack<Integer> s;
	
	
	public Graph() {
		vertices = new Vertex[MAX_VERTICES];
		adjMatrix = new int[MAX_VERTICES][MAX_VERTICES];
		numVerts = 0;
		q = new LinkedList<>();
		s = new Stack<>();
	}
	
	public void addVertex(char c) {
		vertices[numVerts++] = new Vertex(c);
	}
	
	
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1; 
	}
	
	
	public void bfs() {
		
		displayVertex(0);
		vertices[0].wasVisited = true;
		q.add(0);
		
		while(!q.isEmpty()) {
			int u = q.remove();
			
			for(int i = 0; i<numVerts; i++) {
				if(!vertices[i].wasVisited && adjMatrix[i][u] != 0) {
					displayVertex(i);
					vertices[i].wasVisited = true;
					q.add(i);
				}
			}
		}	
	}


	public void dfs() {
		s.push(0);
		
		
		while(!s.isEmpty()) {
			int u = s.pop();
			displayVertex(u);
			vertices[u].wasVisited = true;

					
			for(int i = 0; i<numVerts; i++) {
				if(!vertices[i].wasVisited && adjMatrix[u][i] != 0) {
					s.push(i);
				}
			}

		}
		
	}
	
	
	
	
	
	private void displayVertex(int i) {
		System.out.print(vertices[i].label);
	}

	
	
	
}
public class BFS_Graph_App {
	public static void main(String[] args) {
		
		Graph graph = new Graph();
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
				
		graph.addEdge(0, 3);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 4);
		
		
	//	graph.bfs();
		graph.dfs();
		
	}
}
