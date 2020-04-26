package breadthfirstsearch;

public class DepthFirstSearchMain {
	public static void main(String[] args) {
		DepthFirstSearch graph = new DepthFirstSearch(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(3, 3);
		
		
		System.out.println("Following is DFS starting from 2");

		graph.DFS(2);
	}
}
