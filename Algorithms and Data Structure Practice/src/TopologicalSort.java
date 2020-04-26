import java.util.ArrayList;
import java.util.Stack;

import node.GraphNode;

public class TopologicalSort {
	private ArrayList<GraphNode> nodeList;
	
	public TopologicalSort(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addDirectedEdge(int start, int end) {
		GraphNode first = nodeList.get(start - 1);
		GraphNode second = nodeList.get(end - 1);
		
		first.getNeighbors().add(second);
	}
	
	public void topologicalSort() {
		Stack<GraphNode> stack = new Stack<>();
		
		for(GraphNode node : nodeList) {
			if(!node.getWasVisited()) {
				recursiveVisit(node, stack);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop() + " ");
		}
		
		
	}
	
	
	public void recursiveVisit(GraphNode node, Stack<GraphNode >stack) {
		for(GraphNode neighbor: node.getNeighbors()) {
			if(!neighbor.getWasVisited()) {
				recursiveVisit(neighbor, stack);
			}
		}
		
		stack.push(node);
		node.setWasVisited(true);
	}
	
	
	
	
	
}
