package breadthfirstsearch;

import java.util.ArrayList;

public class GraphMain {
	public static void main(String[] args) {
		ArrayList<GraphNode> list = new ArrayList<>();
		
			list.add(new GraphNode("r",0));
			list.add(new GraphNode("s",1));
			list.add(new GraphNode("t",2));
			list.add(new GraphNode("u",3));
			list.add(new GraphNode("v",4));
			list.add(new GraphNode("w",5));
			list.add(new GraphNode("x",6));
			list.add(new GraphNode("y",7));

		Graph graph = new Graph(list);
		
		graph.addEdge(0,1);
		graph.addEdge(0,4);
		graph.addEdge(1,5);
		graph.addEdge(5,2);
		graph.addEdge(5,6);
		graph.addEdge(2,6);
		graph.addEdge(2,3);
		graph.addEdge(6,7);
		graph.addEdge(3,7);

		System.out.println("Starting the BFS with Node 's':");
		graph.bfs(1);
		
		System.out.println("\n");

		System.out.println("Starting the BFS with Node 'r':");
		graph.bfs(0);
		
		System.out.println("\n");

		System.out.println("Starting the DFS with Node 's':");
		graph.dfs(1);
		
		
		
			
		}		
	}
