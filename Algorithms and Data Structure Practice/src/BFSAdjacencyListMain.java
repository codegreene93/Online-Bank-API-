import java.util.ArrayList;

import node.GraphNode;

public class BFSAdjacencyListMain {
	public static void main(String[] args) {
		
	ArrayList<GraphNode> nodeList = new ArrayList<>();
	
	for(int i = 1; i < 9; i++) {
		nodeList.add(new GraphNode("Node" + i, i-1));
	}
	
	BFSAdjacencyList graph = new BFSAdjacencyList(nodeList);

	graph.addUndirectedEdge(1,5);
	graph.addUndirectedEdge(1,8);
	graph.addUndirectedEdge(1,2);
	graph.addUndirectedEdge(1,6);
	graph.addUndirectedEdge(1,7);
	graph.addUndirectedEdge(2,7);
	graph.addUndirectedEdge(2,3);
	graph.addUndirectedEdge(2,4);
	graph.addUndirectedEdge(4,6);
	graph.addUndirectedEdge(5,8);
	
	//graph.dfs();
	graph.bfs();
		
		
		
	}
}
