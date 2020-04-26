package breadthfirstsearch;

import java.util.LinkedList;

public class GraphNode {
	private String name;
	private boolean isVisited = false;
	private LinkedList<GraphNode> neighbors = new LinkedList<>();
	private int index;
	
	public GraphNode(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public LinkedList<GraphNode> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(LinkedList<GraphNode> neighbors) {
		this.neighbors = neighbors;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	
}
