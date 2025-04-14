/*
 * A Kruskal's Algorithm Class that defines the function that returns the weight of the minimum spanning tree.
 * Written using the pseudocode provided in Skiena's textbook
 * Written by Josh Planko, github: josh-planko41
 * PA2 - MSTs (4/14/25)
 */

package pa2_template;

import java.util.ArrayList;
import java.util.Collections;

public class Kruskal {
    
    public int kruskal(Graph graph){
        UnionFind unionFind = new UnionFind(graph.getTotalEdges());
        ArrayList<Edge> edges = new ArrayList<Edge>(graph.getEdgeList());
        int weight = 0;
        int edgeCounter = 0; // to keep track of edges so we know if the graph is disconnected (connected graphs have vertices-1 edges)

        Collections.sort(edges);

        for (int i = 0; i < edges.size(); i++){
            Edge edge = edges.get(i);
            int edgeV1 = graph.getInt(edge.v1);
            int edgeV2 = graph.getInt(edge.v2);

            if (!unionFind.same_component(edgeV1, edgeV2)){
                unionFind.unionSets(edgeV1, edgeV2);
                weight += edge.weight;
                edgeCounter++;
                
            }
        }
        if (edgeCounter == graph.getVertices() - 1) {
            return weight;
        } else {
            return -1;
        }
        
    }
}
