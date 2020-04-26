class Graph{
	
	class Vertex{
		char label;
		
		public Vertex(char label) {
			this.label = label;
		}
		
	}
	
	
	private final int MAX_VERTICES = 20;
	private Vertex vertices[];
	private int numVerts;
	private int adjMat[][];
	private char sortedArray[];
	
	
	
	
	public Graph() {
		vertices = new Vertex[MAX_VERTICES];
		adjMat = new int[MAX_VERTICES][MAX_VERTICES];
		numVerts = 0;
		sortedArray = new char[MAX_VERTICES];
	}


	public void addVertex(char c) {
		vertices[numVerts++] = new Vertex(c);
	}


	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
	}


	public void topo() {
		int orig_verts = numVerts;

		while(numVerts>0) {
			int currentVertex = noSuccessors();
			
			if(currentVertex == -1) {
				System.out.println("Error: Graph has cycle");
				return;
			}
			
			sortedArray[numVerts-1] = vertices[currentVertex].label;
			
			deleteVertex(currentVertex);
			
			
		}
		
	}


	private void deleteVertex(int delVert) {
		// TODO Auto-generated method stub
		
	}


	private int noSuccessors() {
		boolean isEdge;
		
		
		for(int row = 0; row < numVerts ; row++) {
			isEdge = false;
			for(int col = 0; col < numVerts; col++) {
				if(adjMat[row][col] >0) {
					isEdge = true
;
					break;}
			}
			if(!isEdge)
				return row;
		}

		
		
		return -1;
		
		
		return 0;
	}
	
	
}








public class TopoSort {
	public static void main(String[] args) {
		Graph graph = new Graph();
		
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addVertex('F');
		graph.addVertex('G');
		graph.addVertex('H');
		
		graph.addEdge(0,3);
		graph.addEdge(0,4);
		graph.addEdge(1,4);
		graph.addEdge(2,5);
		graph.addEdge(3,6);
		graph.addEdge(4,6);
		graph.addEdge(5,7);
		graph.addEdge(6,7);
		
		graph.topo();

		
		
		

	}

}
