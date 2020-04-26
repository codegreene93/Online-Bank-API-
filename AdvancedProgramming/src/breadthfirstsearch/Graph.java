package breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	ArrayList<GraphNode> nodeList = new ArrayList<>();
	
	
	public Graph(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}


	public void addEdge(int i, int j) {
		GraphNode first = nodeList.get(i);
		GraphNode second = nodeList.get(j);
		
		first.getNeighbors().add(second);
		second.getNeighbors().add(first);
	}


	public void bfs(int i) {
		for(GraphNode node:nodeList) {
			node.setVisited(false);
		}
		
		bfsVisitNode(nodeList.get(i));
	}


	private void bfsVisitNode(GraphNode node) {
		Queue<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		node.setVisited(true);
		
		
		while(!queue.isEmpty()) {
			GraphNode currentNode = queue.poll();
			System.out.print(currentNode.getName() + " ");
			
			for(GraphNode neighbor:currentNode.getNeighbors()) {
				if(!neighbor.isVisited()) {
					queue.add(neighbor);
					neighbor.setVisited(true);
				}
			}
		}
	}
	
	
	public void dfs(int i) {
		for(GraphNode node:nodeList) {
			node.setVisited(false);
		}
		
		dfsVisitNode(nodeList.get(i));
	}

	private void dfsVisitNode(GraphNode node) {
		node.setVisited(true);
		System.out.print(node.getName() + " ");
		
		
		for(GraphNode neighbor : node.getNeighbors()) {
			if(!neighbor.isVisited()) {
				dfsVisitNode(neighbor);
			}
		}
	
	}
	
	
	
	
	
}
