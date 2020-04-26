
public class DijkstraPractice {

	
	static final int V = 5;

	private int minValue(int[] dist, Boolean[] cloud) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		int min_index = -1;
		
		for (int i = 0; i < V; i++) {
			if(cloud[i]==false && dist[i] <= min) {
				min = dist[i];
				min_index = i;
			}		
		}
	
		return min_index;
	
	}

	
	
	
	
	private void dijkstra(int[][] adjMatrix, int vertex) {
		// TODO Auto-generated method stub
		int dist[] = new int[V];
		
		
		Boolean cloud[] = new Boolean[V];
		
		
		for(int v=0;v<V;v++) {
			dist[v] = Integer.MAX_VALUE;
			cloud[v] = false;
		}
		
		
		dist[vertex] = 0;
		
		
		
		for(int count=0; count<V;count++) {
			
			int u = minValue(dist, cloud);
			
			cloud[u] = true;
			
			
			
			for(int z = 0; z < V; z++) {
				if(!cloud[z] && adjMatrix[u][z] > 0 
						&& dist[u] != Integer.MAX_VALUE 
						&&(dist[u] + adjMatrix[u][z]) < dist[z]) {
					dist[z] = dist[u] + adjMatrix[u][z];
				}
			}
			
			
		}
		
		
		printSolution(dist);


		
	}
	

	private void printSolution(int[] dist) {
		for(int i = 0; i<dist.length; i++)
			System.out.println((i+1) + " min-distance: " + dist[i]);
	}



	public static void main(String[] args) {
		
		int adjMatrix[][] = {{ 0, 10, 20, 25,  0},
							 {10,  0,  2,  5, 25},
							 {20,  2,  0, 10,  0},
							 {25,  5, 10,  0,  5},
							 {0,  25,  0,   5, 0}};
		
		
		DijkstraPractice SPF = new DijkstraPractice();
		
		
		SPF.dijkstra(adjMatrix, 0);
		

	}

	
}
