import java.util.ArrayList;
import java.util.PriorityQueue;

import node.WeightedNode;

public class Dijkstra {
	private ArrayList<WeightedNode> nodeList = new ArrayList<>();
	
	public Dijkstra(ArrayList<WeightedNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addWeightedEdge(int start, int end, int weight) {
		WeightedNode first = nodeList.get(start -1);
		WeightedNode second = nodeList.get(end - 1);
		
		first.getNeighbors().add(second);
		first.getWeightMap().put(second, weight);
		
	}

	public void dijkstra(WeightedNode node) {
		PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
		
		node.setDistance(0);
		
		queue.addAll(nodeList);
		
		while(!queue.isEmpty()) {
			WeightedNode currentNode = queue.remove();
			
			for(WeightedNode neighbor : currentNode.getNeighbors()) {
				if(queue.contains(neighbor)) {
					if(neighbor.getDistance() > currentNode.getDistance() + currentNode.getWeightMap().get(neighbor)) {
						neighbor.setDistance(currentNode.getDistance() + currentNode.getWeightMap().get(neighbor));
					}
						
					neighbor.setParent(currentNode);
					//refresh the queue
					queue.remove(neighbor);
					queue.add(neighbor);
					
				}

			}	
		}
		
		
		for(WeightedNode nodeToCheck : nodeList) {
			System.out.print("Node: " + nodeToCheck + "; Distance: " + nodeToCheck.getDistance() + " Path: ");
			pathPrint(nodeToCheck);
			System.out.println();
		}
		

	}

	private void pathPrint(WeightedNode node) {
		if(node.getParent() != null) {
			pathPrint(node.getParent());
			System.out.print(" -> " + node);
		}else {
			System.out.print(node);
		}
		
	}
	
	
	
	
	
}
