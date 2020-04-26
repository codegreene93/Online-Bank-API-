import java.util.*;
import java.lang.*;
import java.io.*;
 
class ShortestPath
{
    // A utility function to find the vertex with minimum distance value,
    // from the set of vertices not yet included in shortest path tree
    static final int V = 9;
    int minDistance(int dist[], Boolean cloudSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (cloudSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
                System.out.println("min = " + min + "\tmin_index = " + min_index + 
                        "\t" + cloudSet[v] + "\t" + dist[v] + "\t" + Integer.MAX_VALUE);
            }
 
        return min_index;
    }
 
    // A utility function to print the constructed distance array
    void printSolution(int dist[], int n)
    {
        System.out.println("Vertex Distance from Source");
        // 0    1    2    3    4    5    6    7    8
        //BWI, JFK, BOS, PVD, ORD, DFW, MIA, SFO, LAX 
        for (int i = 0; i < V; i++)
        {
        	
        	System.out.println(i+" tt "+dist[i]);
        	
        	
           /* if (i == 0)
               System.out.println("BWI " +" tt "+dist[i]);
            if (i == 1)
               System.out.println("JFK " +" tt "+dist[i]);
            if (i == 2)
               System.out.println("BOS " +" tt "+dist[i]);
            if (i == 3)
               System.out.println("PVD " +" tt "+dist[i]);
            if (i == 4)
               System.out.println("ORD " +" tt "+dist[i]);
            if (i == 5)
               System.out.println("DFW " +" tt "+dist[i]);
            if (i == 6)
               System.out.println("MIA " +" tt "+dist[i]);
            if (i == 7)
               System.out.println("SFO " +" tt "+dist[i]); 
            if (i == 8)
               System.out.println("LAX " +" tt "+dist[i]);   */
       }
    }
    // Funtion that implements Dijkstra's single source shortest path
    // algorithm for a graph represented using adjacency matrix
    // representation
    void dijkstra(int graphWeight[][], int src)
    {
        int dist[] = new int[V]; // The output array. dist[i] will hold
                                 // the shortest distance from src to i
 
        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean cloudSet[] = new Boolean[V];
 
        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            cloudSet[i] = false;
        }
 
        // Distance of source vertex from itself is always 0
        dist[src] = 0;
 
        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++)
        {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, cloudSet);
 
            // Mark the picked vertex as processed
            cloudSet[u] = true;
 
            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int z = 0; z < V; z++)
 
                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (   !cloudSet[z] && graphWeight[u][z]!=0 
                    && dist[u] != Integer.MAX_VALUE 
                    && dist[u]+graphWeight[u][z] < dist[z]  )
                    
                    dist[z] = dist[u] + graphWeight[u][z];
        }
 
        // print the constructed distance array
        printSolution(dist, V);
    }
 
    // Driver method
    public static void main (String[] args)
    {
        
     //  0    1    2    3    4    5    6    7    8
     // BWI, JFK, BOS, PVD, ORD, DFW, MIA, SFO, LAX        
       
      int graphWeights[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
    	  								 {4, 0, 12, 0, 0, 0, 0, 0, 0},
    	  								 {0, 12, 0, 19, 0, 0, 0, 0, 14},
    	  								 {0, 0, 19, 0, 0, 0, 0, 0, 0},
    	  								 {0, 0, 0, 0, 0, 21, 0, 0, 0},
    	  								 {0, 0, 0, 0, 21, 0, 11, 0, 0},
    	  								 {0, 0, 0, 0, 0, 11, 0, 9, 0},
    	  								 {8, 0, 0, 0, 0, 0, 9, 0, 0},
    	  								 {0, 0, 14, 0, 0, 0, 9, 0, 0}};
       
       // Task 2
       // Develop an adjancency matrix for the airport example discussed in the 
       // lecture notes    
        ShortestPath DIJ = new ShortestPath();
        DIJ.dijkstra(graphWeights, 0);
    }
}
