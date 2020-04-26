package node;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode>{
	private String name;
	private ArrayList<WeightedNode> neighbors = new ArrayList<>();
	private HashMap<WeightedNode, Integer> weightMap = new HashMap<WeightedNode, Integer>();
	private int distance;
	private Boolean isVisited = false;
	private WeightedNode parent;
	
	
	public WeightedNode(String name) {
		this.name = name;
		distance = Integer.MAX_VALUE;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<WeightedNode> getNeighbors() {
		return neighbors;
	}


	public void setNeighbors(ArrayList<WeightedNode> neighbors) {
		this.neighbors = neighbors;
	}


	public HashMap<WeightedNode, Integer> getWeightMap() {
		return weightMap;
	}


	public void setWeightMap(HashMap<WeightedNode, Integer> weightMap) {
		this.weightMap = weightMap;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	public Boolean getIsVisited() {
		return isVisited;
	}


	public void setIsVisited(Boolean isVisited) {
		this.isVisited = isVisited;
	}


	public WeightedNode getParent() {
		return parent;
	}


	public void setParent(WeightedNode parent) {
		this.parent = parent;
	}


	@Override
	public int compareTo(WeightedNode o) {
		// TODO Auto-generated method stub
		return this.distance - o.distance;
	}
	
	
	@Override
	public String toString() {
		return name;
	}
	
}
