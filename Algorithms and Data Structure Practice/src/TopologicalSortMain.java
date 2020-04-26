
import java.util.ArrayList;

import node.GraphNode;

public class TopologicalSortMain {
	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList = new ArrayList<>();
		
		for (int i = 1; i<9; i++) {
			nodeList.add(new GraphNode("Node " + i, i-1));
		}
		
		TopologicalSort graph = new TopologicalSort(nodeList);
		
		graph.addDirectedEdge(1,3);
		graph.addDirectedEdge(2,3);
		graph.addDirectedEdge(2,4);
		graph.addDirectedEdge(3,5);
		graph.addDirectedEdge(4,6);
		graph.addDirectedEdge(5,6);
		graph.addDirectedEdge(5,7);
		graph.addDirectedEdge(6,8);

		
		graph.topologicalSort();
		
	}
}
