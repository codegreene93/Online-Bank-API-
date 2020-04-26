import java.util.ArrayList;
import java.util.LinkedList;

import node.GraphNode;

public class BFSAdjacencyMatrix {
	ArrayList<GraphNode> nodeList = new ArrayList<>();
	int adjMatrix[][];
	
	
	public BFSAdjacencyMatrix(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		adjMatrix = new int[nodeList.size()][nodeList.size()];
	}

	public void addUndirectedEdge(int start, int end) {
		start--;
		end--;
		
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	
	}

	public void bfs() {
		for(GraphNode node: nodeList) {
			if(!node.getWasVisited()) {
				visitNode(node);
			}
		}
		
	}

	private void visitNode(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		node.setWasVisited(true);

		
		while(!queue.isEmpty()) {
			GraphNode currentNode = queue.remove(0);
			System.out.print(currentNode.getName() + " ");
			
			ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
			
			for(GraphNode neighbor : neighbors) {
				if(!neighbor.getWasVisited()) {
					queue.add(neighbor);
					neighbor.setWasVisited(true);
				}
			}
		}
	}

	private ArrayList<GraphNode> getNeighbors(GraphNode currentNode) {
		ArrayList<GraphNode> neighbors = new ArrayList<>();
		
		int nodeIndex = currentNode.getIndex();
		
		
		for(int i = 0 ; i < adjMatrix.length; i++) {
			if(adjMatrix[nodeIndex][i] == 1) {
				neighbors.add(nodeList.get(i));
			}
		}
		
		
		return neighbors;
	}
	
	
	
	
	
	
}
