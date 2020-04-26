import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import node.GraphNode;

public class BFSAdjacencyList {
	private ArrayList<GraphNode> nodeList;
	
	public BFSAdjacencyList(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}
	
	
	public void addUndirectedEdge(int start, int end) {
		GraphNode first = nodeList.get(start - 1);
		GraphNode second = nodeList.get(end - 1);
		
		first.getNeighbors().add(second);
		second.getNeighbors().add(first);
	}
	
	
	public void dfs() {
		for(GraphNode node:nodeList) {
			if(!node.getWasVisited()) {
				visitNodeDFS(node);
			}
		}
	}
	
	
	public void pathPrint(GraphNode node) {
		if(node.getParentNode() != null)
			pathPrint(node.getParentNode());
			
		System.out.print(node + " ");
	}
	
	
	
	public void visitNodeDFS(GraphNode node) {
		Stack<GraphNode> stack = new Stack<>();
		stack.push(node);
		node.setWasVisited(true);
		
		while(!stack.isEmpty()) {
			GraphNode currentNode = stack.pop();
			System.out.print(currentNode + " ");

			
			for(GraphNode neighbor:currentNode.getNeighbors()) {
				if(!neighbor.getWasVisited()) {
					stack.push(neighbor);
					neighbor.setWasVisited(true);
				}
			}
		}
		
		
	}
	
	
	
	public void bfs() {
		for(GraphNode node:nodeList) {
			if(!node.getWasVisited()) {
				visitNodeBFS(node);
			}
		}
	}
	
	
	public void visitNodeBFS(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		node.setWasVisited(true);
		
		
		while(!queue.isEmpty()) {
			GraphNode currentNode = queue.remove();
			System.out.print(currentNode + " ");
			System.out.print("Path from source to " + currentNode + ": ");
			pathPrint(currentNode);
			System.out.println();

			
			for(GraphNode neighbor:currentNode.getNeighbors()) {
				if(!neighbor.getWasVisited()) {
					queue.add(neighbor);
					neighbor.setWasVisited(true);
					neighbor.setParentNode(currentNode);
				}
			}
		}
		
		
		
		
		
	}
	
	
	
	
}
