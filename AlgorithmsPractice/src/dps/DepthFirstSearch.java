package dps;

import java.util.Stack;

public class DepthFirstSearch {
	
	public static void main(String[] args) {
		G theGraph = new G();
		
		theGraph.add(1);
		theGraph.add(2);
		theGraph.add(3);
		theGraph.add(4);
		theGraph.add(5);
		theGraph.add(6);
		theGraph.add(7);
		theGraph.add(8);
		theGraph.add(9);
		
		
		theGraph.addEdge(0,2);
		theGraph.addEdge(0,4);
		theGraph.addEdge(0,8);
		theGraph.addEdge(1,3);
		theGraph.addEdge(1,5);
		theGraph.addEdge(1,7);
		theGraph.addEdge(4,5);
		
		
		
		theGraph.dfs();

	}
	
	

}

class V{
	int num;
	boolean wasVisited;
	
	public V(int num) {
		this.num = num;
		wasVisited = false;
	}
	
}

class G{
	private final int MAX_V = 20;
	private V vList[];
	private int adjMatrix[][];
	private int numV;
	private Stack<Integer> stack;
	
	
	public G(){
		vList = new V[MAX_V];
		adjMatrix = new int[MAX_V][MAX_V];
		numV = 0;
		stack = new Stack<>();
	}


	public void dfs() {
		stack.push(0);
		
		while(!stack.isEmpty()) {
			int v1 = stack.pop();
			
			if(vList[v1].wasVisited == false) {
				vList[v1].wasVisited = true;
				displayV(v1);
				
				for(int i=0; i<numV;i++) {
					if(adjMatrix[v1][i] == 1 && vList[i].wasVisited == false) {
						stack.add(i);
					}
				}
				
			}
			
		}
			
	}
		




	private void displayV(int i) {
		System.out.println(vList[i].num);
	}


	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;

	}


	public void add(int i) {
		vList[numV++] = new V(i);
	}
	
	
	
}