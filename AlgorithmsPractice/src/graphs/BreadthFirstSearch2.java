package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch2 {
	public static void main(String[] args) {
		
		Graph2 theGraph = new Graph2();
		
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		theGraph.addVertex('F');
		theGraph.addVertex('G');

		
		theGraph.addEdge(0,1);
		theGraph.addEdge(1,2);
		theGraph.addEdge(2,3);
		theGraph.addEdge(3,4);
		theGraph.addEdge(4,5);
		theGraph.addEdge(5,6);
		theGraph.addEdge(6,1);
	
		System.out.print("Visits : ");
		theGraph.bfs();
		System.out.println();
		
	}
}



class Vertex2{
	char label;
	boolean wasVisited;
	
	public Vertex2(char lab) {
		label = lab;
		wasVisited = false;
	}
}



class Graph2{
	private final int MAX_VERTICES = 20;
	private Vertex2 vertexList[];
	private int adjMat[][];
	private int nVerts;
	private Queue<Integer> q;
	
	
	
	public Graph2() {
		vertexList = new Vertex2[MAX_VERTICES];
		adjMat = new int[MAX_VERTICES][MAX_VERTICES];
		nVerts = 0;
		q = new LinkedList<>();
	}



	public void bfs() {
		vertexList[0].wasVisited = true;
		displayVertex(0);
		q.add(0);
		int v2;
		
		
		while(!q.isEmpty()) {
			int v1 = q.remove();
			while((v2 = getAdjUnvisited(v1))!=-1) {
				vertexList[v2].wasVisited = true;
				displayVertex(v2);
				q.add(v2);
			}
			
			
			
		}
		
		
		
		
	}



	private int getAdjUnvisited(int v1) {
		for(int j=0;j<nVerts;j++) {
			if(adjMat[v1][j]==1 && vertexList[j].wasVisited==false) {
				return j;
			}
		}
	
		return -1;
	}



	private void displayVertex(int i) {
		System.out.print(vertexList[i].label);
	}



	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}



	public void addVertex(char c) {
		vertexList[nVerts++] = new Vertex2(c);
	}
	
	
	
	
	
}